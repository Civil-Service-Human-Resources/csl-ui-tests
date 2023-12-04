package utilities;

public class Users {

    protected String nonAdminUsername;
    protected String nonAdminUserPassword;
    protected String adminUsername;
    protected String adminUserPassword;

    public Users(){
        ConfigReader configReader = new ConfigReader();
        nonAdminUsername = configReader.getNonAdminUsername();
        nonAdminUserPassword = configReader.getNonAdminUserPassword();
        adminUsername = configReader.getAdminUsername();
        adminUserPassword = configReader.getAdminUserPassword();
    }

    public String getNonAdminUsername(){
        return nonAdminUsername;
    }

    public String getNonAdminUserPassword(){
        return nonAdminUserPassword;
    }

    public String getAdminUsername(){
        return adminUsername;
    }

    public String getAdminUserPassword(){
        return adminUserPassword;
    }

}
