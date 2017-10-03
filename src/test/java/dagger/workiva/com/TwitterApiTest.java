package dagger.workiva.com;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class TwitterApiTest {

    @InjectMocks
    private TwitterApi sut;

    private static final String MESSAGE = "y0";
    private static final String USER_NAME = "gaga";

    @Mock
    private OkHttpClient httpClient;

    @Before
    public void setup() {
        sut.user = USER_NAME;
    }

    @Test
    public void sendsTweet() {
        sut.sendTweet(MESSAGE);

        verify(httpClient).sendRequest("["+USER_NAME+"] send tweet request : "+MESSAGE);
    }

}
