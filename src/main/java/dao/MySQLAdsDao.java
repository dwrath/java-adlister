package dao;

import com.mysql.cj.jdbc.Driver;
import models.Ad;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements AdsDao{
    private Connection connection;

    public MySQLAdsDao(){
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        } catch (SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");
            while(resultSet.next()){
                Ad ad = new Ad(
                        resultSet.getLong("id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        long id = ad.getUserId();
        String title = ad.getTitle();
        String description = ad.getDescription();
        try{
            String insertQuery = "INSERT INTO adlister_db.ads(user_id, title, description) VALUES('" + id + "', '" + title + "', '" + description + "')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            ad.setId(resultSet.getLong(1));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ad.getId();
    }
}
