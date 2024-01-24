package lesson21.Social_Network;

public class Main {
    public static void main(String[] args) {

        UserData userData = new UserData("Abbos","AbiBro");
        VideoData videoData= new VideoData("Orzu","xujjatli film",43,0);
        SocialRepository socialRepository =new SocialRepository();

        socialRepository.setShowMessageInterface(new ShowMessageInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }

        });

        socialRepository.addVideo(userData,videoData);

    }
}
