package constants;

public class User {

    private String email = null;
    private String password = null;

    public final static String USER_VALID_EMAIL = "bazhan@live.com";
    public final static String USER_VALID_PASSWORD = "Etos2020_";
    public final static String USER_UNVALID_PASSWORD = "sho?";
    public final static String USER_HOW_MADE_ORDER_EMAIL = "iurii.bazhan@gmail.com";
    public final static String COMPETED_ORDER_NUMBER = "BDU-511-23888647847";

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public static User getUserWithValidCredentials() {
        return new User(USER_VALID_EMAIL,USER_VALID_PASSWORD);
    }

    public static User getUserWithUnValidPassword() {
        return new User(USER_VALID_EMAIL,USER_UNVALID_PASSWORD);
    }

}
