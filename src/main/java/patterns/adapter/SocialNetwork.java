package patterns.adapter;


public interface SocialNetwork {

    void loginToSocialNetwork(String login, String password);

    void logoutFromSocialNetwork();
}
