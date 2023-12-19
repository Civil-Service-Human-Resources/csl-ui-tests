package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;
    private final String propertyFilePath = "config//config.properties";
    public ConfigReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getIdentityBaseUrl() {
        String identityBaseUrl = properties.getProperty("identityBaseUrl");
        if(identityBaseUrl != null) return identityBaseUrl;
        else throw new RuntimeException("identityBaseUrl not specified in config.properties file");
    }

    public String getBaseUrl() {
        String baseUrl = properties.getProperty("baseUrl");
        if(baseUrl != null) return baseUrl;
        else throw new RuntimeException("baseUrl not specified in config.properties file");
    }

    public String getAdminURL() {
        String adminUrl = properties.getProperty("adminUrl");
        if(adminUrl != null) return adminUrl;
        else throw new RuntimeException("adminUrl not specified in config.properties file");
    }

    public String getBrowser() {
        String browser = properties.getProperty("browser");
        if(browser != null) return browser;
        else throw new RuntimeException("browser not specified in config.properties file");
    }

    public String getNonAdminUsername() {
        String nonAdminUsername = properties.getProperty("nonAdminUsername");
        if(nonAdminUsername != null) return nonAdminUsername;
        else throw new RuntimeException("nonAdminUsername not specified in config.properties file");
    }

    public String getNonAdminUserPassword() {
        String nonAdminUserPassword = properties.getProperty("nonAdminUserPassword");
        if(nonAdminUserPassword != null) return nonAdminUserPassword;
        else throw new RuntimeException("nonAdminUserPassword not specified in config.properties file");
    }

    public String getAdminUsername() {
        String adminUsername = properties.getProperty("adminUsername");
        if(adminUsername != null) return adminUsername;
        else throw new RuntimeException("adminUsername not specified in config.properties file");
    }

    public String getAdminUserPassword() {
        String adminUserPassword = properties.getProperty("adminUserPassword");
        if(adminUserPassword != null) return adminUserPassword;
        else throw new RuntimeException("adminUserPassword not specified in config.properties file");
    }

}
