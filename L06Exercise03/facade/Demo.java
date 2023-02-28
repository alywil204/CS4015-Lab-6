public class Demo {
  public static void main(String[] args) {
    var twitterClient = new TwitterFacade("appKey", "secret");
    var tweets = twitterClient.getRecentTweets();
  }
}
