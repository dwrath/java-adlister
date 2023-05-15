package dao;

public class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public String getUser() {
        return "test_user";
    }
    public String getPassword() {
        return "codeup";
    }

}
