import java.util.List;

class TwitterFacade {
    private String appKey;
    private String secret;

    public TwitterFacade(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    private String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, secret);
        return oauth.getAccessToken(requestToken);
    }

    public List<Tweet> getRecentTweets() {
        var accessToken = this.getAccessToken();

        var twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(accessToken);
    }
}