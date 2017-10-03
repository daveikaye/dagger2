package dagger.workiva.com;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Qualifier;
import javax.inject.Singleton;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    public  OkHttpClient provideHttpClient() {
        return new OkHttpClient();
    }

    @Provides
    @Named("da da da")
    public  OkHttpClient provideHttpSever() {
        return new OkHttpClient();
    }
}
