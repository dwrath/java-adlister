package dao;

import models.Ad;

import java.util.List;

public class adlistTest {
    private static List<Ad> getAds(){
        return DaoFactory.getAdsDao().all();
    }

    public static void main(String[] args) {
        DaoFactory.getAdsDao().insert(new Ad(1,"Test", "Test"));
        for(Ad ad : getAds()){
            System.out.println(ad.getTitle());
        }

    }
}
