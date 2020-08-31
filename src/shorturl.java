import java.util.HashMap;
import java.util.Map;

public class shorturl {

    public static String encode(String longUrl) {
        Map<Integer, String> map = new HashMap<>();
        int i = 0;
        map.put(i, longUrl);
        return "http://tinyurl.com/" + i++;
    }

    public static void main(String[] args) {
        String longUrl = "https://www.jvbfdshbvjvbndfjvn.cdskvnsjvn";
        System.out.print(encode(longUrl));
    }
}
