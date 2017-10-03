package dagger.workiva.com;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class TweeterModule {

    private final String user1;
    private final String user2;

    public TweeterModule(String user) {
        this.user1 = user;
        this.user2 = "fire";
    }

    @Provides @Named("water")
    public String getUser1() {
        return user1;
    }

    @Provides @Named("fire")
    public String getUser2() {
        return user2;
    }

    @Provides
    @Singleton
    public Tweeter provideTweeter(TwitterApi twitterApi) {
        return new Tweeter(twitterApi);
    }

    @Provides
    @Singleton
    public Timeline provideTimeline(TwitterApi twitterApi) {
        return new Timeline(twitterApi);
    }
}
