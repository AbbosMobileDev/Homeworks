package lesson21.Social_Network;

import java.util.ArrayList;
import java.util.List;

public class SocialRepository {

    private ShowInfoInterface showInfoInterface = null;
    private ShowMessageInterface showMessageInterface = null;
    List<VideoData> videos = new ArrayList<>();
    List<UserData> users = new ArrayList<>();


    public void setShowInfoInterface(ShowInfoInterface showInfoInterface) {
        if (!hasShowInfoListener()) {
            this.showInfoInterface = showInfoInterface;
        }
    }

    private boolean hasShowInfoListener() {

        return showInfoInterface != null;
    }

    public void setShowMessageInterface(ShowMessageInterface showMessageInterface) {
        if (!hasShowMessageListener()) {
            this.showMessageInterface = showMessageInterface;
        }
    }

    private boolean hasShowMessageListener() {

        return showMessageInterface != null;
    }

    void addVideo(UserData userData, VideoData videoData) {
        if (!(videos.contains(videoData))) {
            videos.add(videoData);
            users.add(userData);
            showMessageInterface.showMessage(userData.getUserName() + " tomonidan  video qo'shildi ");
        } else {
            showMessageInterface.showMessage("Xatolik : bu video oldin qo'shilgan");
        }

    }

    void removeVideo(UserData userData, VideoData videoData) {
        for (int i = 0; i < videos.size(); i++) {
            if (videos.get(i) == videoData) {
                videos.remove(i);
                users.remove(i);

            } else {
                showMessageInterface.showMessage("Xatolik: Bunday video topilmadi");
            }
        }
    }

    void LikeTheVide(VideoData videoData) {
        for (int i = 0; i < videos.size(); i++) {
            if (videos.get(i) == videoData) {
                videos.get(i).setLikeCount(videos.get(i).getLikeCount() + 1);

            } else if (videos.contains(videoData) == false) {
                showMessageInterface.showMessage("Xatolik: Bunday video topilmadi");
            }
        }
    }

    void dislLkeTheVide(VideoData videoData) {
        for (int i = 0; i < videos.size(); i++) {
            if (videos.get(i) == videoData) {
                videos.get(i).setDislikeCount(videos.get(i).getDislikeCount() + 1);

            } else if (videos.contains(videoData) == false) {
                showMessageInterface.showMessage("Xatolik: Bunday video topilmadi");
            }
        }
    }

    void getAllVideo() {
        for (int i = 0; i < videos.size(); i++) {
            showInfoInterface.showInfo(videos.get(i));
        }

    }

    void getAllVideoByUser(UserData userData) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) == userData) {
                System.out.println(videos.get(i));
            }

        }

    }

    void getTopVideos(int count) {
        if (videos.size() < count) {
            videos.stream().sorted();
            for (int i = 0; i < videos.size(); i++) {
                System.out.println(videos.get(i));
            }

        }

    }
}


