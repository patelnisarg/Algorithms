import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;
class TinyUrlTest {
    TinyUrl tu = new TinyUrl();
    @Test
    void check_if_key_is_fixed_length(){
        int char_length = 6;
        String key = tu.getKey();
        int key_length = key.length();
        assertEquals(char_length, key_length);
    }
    @Test
    void check_if_key_is_not_fixed_length(){
        int char_length = 7;
        String key = tu.getKey();
        int key_length = key.length();
        assertNotEquals(char_length, key_length);
    }
    @Test
    void throw_exception_if_no_url_given_to_encode(){
        String longURL = "";
        Executable executable = () -> tu.getAliasedUrl(longURL);
        assertThrows(NullPointerException.class , executable);
    }
    @Test
    void check_if_encode_returns_shotUrl() {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        int key_length = 6;
        String shortUrl = tu.getAliasedUrl(longUrl);
        String shortUrlKey = shortUrl.replace("http://tinyurl.com/", "");
        assertEquals(key_length, shortUrlKey.length());
    }
    @Test
    void check_if_encode_does_not_return_shortUrl() {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        int key_length = 7;
        String check = tu.getAliasedUrl(longUrl);
        String shortUrl = check.replace("http://tinyurl.com/", "");
        assertNotEquals(key_length, shortUrl.length());
    }
    @Test
    void check_if_decode_returns_longUrl() throws Exception {

        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = tu.getAliasedUrl(longUrl);
        String originalLongUrl = tu.getFullUrl(shortUrl);
        assertEquals(longUrl, originalLongUrl);
    }
    @Test
    void throw_exception_if_no_url_in_decode() {
        final String shortUrl = "";
        Executable executable = () -> tu.getFullUrl(shortUrl);
        assertThrows(NullPointerException.class, executable);
    }
}