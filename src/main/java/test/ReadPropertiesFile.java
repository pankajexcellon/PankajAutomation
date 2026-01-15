package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static void main(String[] args) throws IOException {

        // Step 1: Create Properties object
        Properties prop = new Properties();

        // Step 2: File path of properties file
        FileInputStream fis = new FileInputStream("src/test/resources/config");

        // Step 3: Load file
        prop.load(fis);

        // Step 4: Read values using key
        String url = prop.getProperty("url");
        String browser = prop.getProperty("browser");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        // Print values
        System.out.println("URL: " + url);
        System.out.println("Browser: " + browser);
        System.out.println("U_name: " + username);
        System.out.println("PWD: " + password);
    }
}
 