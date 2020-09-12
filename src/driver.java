public class driver {
    
    public static void main(String[] args) throws Exception {
        TinyUrl turl = new TinyUrl();
        
        String url = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = turl.getAliasedUrl(url);
        String originalUrl = turl.getFullUrl(shortUrl);
        System.out.println("Encoded URL:" + shortUrl);
        System.out.println("Decoded URL:" + originalUrl);

        String emptyUrl = "";
        String emptyShortUrl = turl.getAliasedUrl(emptyUrl);
        String emptyOriginalUrl = turl.getFullUrl(emptyShortUrl);
        System.out.println("Encoded URL:" + emptyShortUrl);
        System.out.println("Decoded URL:" + emptyOriginalUrl);

    }
}
