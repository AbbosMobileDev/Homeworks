package lesson21.Social_Network;

public class Main {
    public static void main(String[] args) {

        UserData userData = new UserData("Abbos", "AbiBro");
        UserData userData2 = new UserData("Mirjamol", "1202");
        VideoData videoData2 = new VideoData("Orzu", "xujjatli film", 43, 0);
        VideoData videoData = new VideoData("Samo", "xujjatli film", 100, 0);
        VideoData videoData3 = new VideoData("Yulduz", "Badiiy film", 151, 0);
        SocialRepository socialRepository = new SocialRepository();

        socialRepository.setShowMessageInterface(new ShowMessageInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }

        });
        socialRepository.setShowMessageInterface(new ShowMessageInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }

        });
        socialRepository.setShowInfoInterface(new ShowInfoInterface() {
            @Override
            public void showInfo(VideoData videoData) {
                System.out.println(videoData);
            }

        });

        socialRepository.addVideo(userData, videoData);
        socialRepository.addVideo(userData, videoData2);
        socialRepository.addVideo(userData2, videoData3);
        System.out.println(socialRepository.videos);
        socialRepository.getAllVideoByUser(userData2);
        socialRepository.LikeTheVide(videoData);
        System.out.println(videoData);
        socialRepository.getAllVideo();
        System.out.println("/n");
        socialRepository.getTopVideos(10);
    }


}
