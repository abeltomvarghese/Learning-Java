package DefaultProperties;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        try(OutputStream oStream = Files.newOutputStream(Paths.get("src/DefaultProperties/MyDefaultValues.xml"))) {
            Properties firstProps = new Properties();
            firstProps.setProperty("welcomeMessage", "hello world");
            firstProps.setProperty("farewellMessage", "GoodNight Moon");
            firstProps.setProperty("isFirstRun","Y");

            firstProps.storeToXML(oStream, "initial changes");
        } catch (Exception e) {e.printStackTrace();}


        try{

            Properties defaultProps = new Properties();
            try(InputStream inputStream = Main.class.getResourceAsStream("MyDefaultValues.xml")) {
                defaultProps.loadFromXML(inputStream);
            }

            Properties userProps = new Properties(defaultProps);
            userProps = loadUserProps(userProps);

            String welcome = userProps.getProperty("welcomeMessage");
            String farewell = userProps.getProperty("farewellMessage");

            System.out.println(welcome);
            System.out.println(farewell);

            if (userProps.getProperty("isFirstRun").equalsIgnoreCase("Y")) {
                userProps.setProperty("welcomeMessage", "different now");
                userProps.setProperty("farewellMessage", "what is sleep?");
                userProps.setProperty("isFirstRun","N");
                saveUserProps(userProps);
            }


        } catch(Exception e) {e.printStackTrace();}
    }

    public static Properties loadUserProps(Properties userProps) throws IOException {
        Path userFile = Paths.get("src/DefaultProperties/userValues.xml");
        if(Files.exists(userFile)) {
            try(InputStream inputStream = Files.newInputStream(userFile)) {
                userProps.loadFromXML(inputStream);
            }
        }
        return userProps;
    }

    public static void saveUserProps(Properties userProps) throws Exception{
        try(OutputStream oStream = Files.newOutputStream(Paths.get("src/DefaultProperties/userValues.xml"))) {
            userProps.storeToXML(oStream, "second Changes");
        }
    }
}
