package dagger.workiva.com;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

public class TwitterApi {

    @Inject @Named("water")
    String user;

    private final OkHttpClient httpClient;

    @Inject
    public TwitterApi(OkHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void sendTweet(String tweet) {
        String request = "[" + user + "] send tweet request : " + tweet;
        httpClient.sendRequest(request);
    }

    public List<String> getTimeline(int tweetsLimit) {
        httpClient.sendRequest("[" + user + "] send get timeline request " + tweetsLimit);
        ArrayList<String> tweets = new ArrayList<>();
        tweets.add("@"+user+": #Dagger2 is great ! ");
        return tweets;
    }

}