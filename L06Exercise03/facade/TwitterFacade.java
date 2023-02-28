import java.util.List;

class TwitterFacade {
    private OAuthFacade oauthFacade;

    public TwitterFacade(String appKey, String secret) {
        this.oauthFacade = new OAuthFacade(appKey, secret);
    }

    public List<Tweet> getRecentTweets() {
        var accessToken = oauthFacade.getAccessToken();

        var twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(accessToken);
    }
}