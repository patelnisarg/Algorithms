import java.util.HashMap;

public class UrlDataStore {
    private HashMap<String, String> map = new HashMap<>();

    public void add(String key, String longUrl){
        map.put(key, longUrl);
    }

    public String get(String key){
        return map.get(key);
    }

    public boolean isKeyExist(String key){
        return map.containsKey(key);
    }
}
