import java.util.Random;

public class TinyUrl {
    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    //HashMap<String, String> map = new HashMap<>();
    UrlDataStore urlDataStore = new UrlDataStore();
    Random rand = new Random();
    String shortUrlPrefix = "http://t-mo.co/";

    //helper function, generates a 6 char key for the tinyurl
    public String getKey() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(rand.nextInt(62)));
        }
        return sb.toString();
    }

    //builds the tiny url by taking the long url as a parameter
    public String getAliasedUrl(String longUrl) {
        String shortUrl = "";
        if (longUrl.length() == 0) {
            throw new NullPointerException("No URL entered");
        }
        String key = getKey();
//        while (map.containsKey(key)) {
//            key = getKey();
//        }
        while (urlDataStore.isKeyExist(key)) {
            key = getKey();
        }
        //map.put(key, longUrl);
        urlDataStore.add(key,longUrl);
        shortUrl = shortUrlPrefix + key;
        return shortUrl;
    }

    //retrieves the original long url from the map using the short url generated by encoding
    public String getFullUrl(String shortUrl) throws Exception {
        if (shortUrl.length() == 0) {
            throw new NullPointerException("No Short URL");
        }
        String key = shortUrl.replace(shortUrlPrefix, "");
        if (!urlDataStore.isKeyExist(key)) {
            throw new Exception("No Key Found");
        }
        return urlDataStore.get(key);
    }
}