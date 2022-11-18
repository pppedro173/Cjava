import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class checkLink {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://miniclip.com/games/genre-2/multiplayer/EN/");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();

        if(responseCode >= 400){
            System.out.println(url + " is a broken link");
        }
    }

}
