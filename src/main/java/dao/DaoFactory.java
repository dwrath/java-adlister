package dao;

public class DaoFactory {
    private static AdsDao adsDao;

    public static AdsDao getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }
}
