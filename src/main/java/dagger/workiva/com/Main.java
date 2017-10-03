package dagger.workiva.com;

public class Main {

    public static void main(String[] args) {
        ApplicationComponent appComponent = DaggerApplicationComponent.builder()
                .tweeterModule(new TweeterModule("water"))
                .build();

        Tweeter tweeter = appComponent.getTweeter();
        tweeter.tweet("Hello");
        appComponent.getTimeline().getTimeline(10).stream().forEach(System.out::println);
    }
}
