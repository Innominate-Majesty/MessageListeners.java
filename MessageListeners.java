package listeners.messages;

import com.slack.api.bolt.App;
import com.slack.api.model.event.MessageEvent;
import listeners.ListenerProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageListeners implements ListenerProvider {

    private static final Logger logger = LoggerFactory.getLogger(MessageListeners.class);

    @Override
    public void register(App app) {
        // Register the WeatherHandler listener
        app.event(MessageEvent.class, new WeatherHandler(app));
        logger.info("WeatherHandler Registered");

        // Register the HotelHandler listener
        app.event(MessageEvent.class, new HotelHandler(app));
        logger.info("HotelHandler Registered");
    }
}
