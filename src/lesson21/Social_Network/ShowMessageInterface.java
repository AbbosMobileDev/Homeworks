package lesson21.Social_Network;

import java.util.List;

public interface ShowMessageInterface {
    default void showMessage(String message) {

    }

    default void showMessage(List<VideoData> videoData) {

    }
}
