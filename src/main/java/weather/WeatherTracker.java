package weather;

import java.util.HashMap;
import java.util.Map;

public class WeatherTracker {
    String currentConditions;

    private final Map<String, AlertChannel> channelsByCondition = new HashMap<>();

    public WeatherTracker() {
        channelsByCondition.put("rainy", new Phone());
        channelsByCondition.put("sunny", new Email());
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;

        AlertChannel channel = channelsByCondition.get(weatherDescription);
        if (channel != null) {
            String alert = channel.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }

    // 새 조건-채널 조합을 추가할 때 setCurrentConditions()는 안 건드려도 됨
    public void registerChannel(String condition, AlertChannel channel) {
        channelsByCondition.put(condition, channel);
    }
}