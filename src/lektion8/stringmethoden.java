package lektion8;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;

public class stringmethoden {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";

        int startURLIndex = seite.indexOf("img src=" );
        int endURLIndex =  seite.indexOf("</div>");
        System.out.println("StartURL: " + startURLIndex);
        System.out.println("EndURL: " + endURLIndex);
        String bildURL = seite.substring(startURLIndex+9, endURLIndex-2);
        System.out.println("BildURL: " + bildURL);
        String downloadUrl = bildURL;

        //URL url = new URI(downloadUrl).toURL();

        // add user agent
        URLConnection urlConnection = new URL(downloadUrl).openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla");
        urlConnection.setReadTimeout(5000);
        urlConnection.setConnectTimeout(5000);

        BufferedImage image = ImageIO.read(urlConnection.getInputStream());
        ImageIO.write(image, "png", new File("bild.png"));
    }
}
