package APIUtils.src.main.java.requests;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Requests {

    private static HttpURLConnection httpURLConnection;

    public Requests() {
    }

    public static HttpURLConnection sendGetRequest(String url) throws IOException {
        URL requestUrl = new URL(url);
        httpURLConnection = (HttpURLConnection) requestUrl.openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(false);

        return httpURLConnection;
    }
}
