package patterns.adapter;

/*
* This pattern we use to integrate new component to already exists structure
* */
public class TwitterAdapter implements SocialNetwork{

    private Twitter twitter;

    public TwitterAdapter(Twitter twitter) {
        this.twitter = twitter;
    }

    @Override
    public void loginToSocialNetwork(String login, String password) {
        twitter.startWorkWithApplication(login, password);
    }

    @Override
    public void logoutFromSocialNetwork() {}
}
