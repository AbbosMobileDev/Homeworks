package lesson21.Social_Network;

import java.util.LinkedList;
import java.util.List;

public class SocialRepository {
    ShowInfoInterface showInfoInterface = null;
    ShowMessageInterface showMessageInterface= null;
    private List<VideoData> videos = new LinkedList<VideoData>();


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
    void addVideo(UserData userData,VideoData videoData){
    if(!(videos.contains(videoData))){
        videos.add(videoData);
        showMessageInterface.showMessage(userData.getUserName()+" tomonidan  video qo'shildi ");
        }else {
        showMessageInterface.showMessage("Xatolik : bu video oldin qo'shilgan");
    }

    }

}
