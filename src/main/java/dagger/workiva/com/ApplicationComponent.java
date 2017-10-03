package dagger.workiva.com;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {TweeterModule.class, NetworkModule.class})
public interface ApplicationComponent {

    Tweeter getTweeter();

    Timeline getTimeline();
}