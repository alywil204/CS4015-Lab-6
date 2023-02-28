class OAuthFacade {
    private String appKey;
    private String secret;

    public OAuthFacade(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(this.appKey, this.secret);
        return oauth.getAccessToken(requestToken);
    }
}