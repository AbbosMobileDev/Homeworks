//package Lesson9_homeworks.task1;
//
//public class Telegram {
//    private User user;
//    private User[] allUser;
//
//    public Telegram(User user, User[] allUser) {
//        this.user = user;
//        this.allUser = allUser;
//    }
////    public boolean thisAccauntYes(String number){
////        for (int i = 0; i < allUser.length; i++) {
////
////            if(this.allUser[i].getPhoneNumber() == number) {
////                return false;
////            }
////        }
////return true;
////    }
//
//    public boolean crateAccount(User user) {
//        for (int i = 0; i < allUser.length; i++) {
//            if (allUser[i].getPhoneNumber() == user.getPhoneNumber()) {
//                System.out.println("bu account bor.!");
//                return false;
//            }
//            User[] users = new User[allUser.length + 1];
//            for (i = 0; i < allUser.length; i++)
//                users[i] = allUser[i];
//            users[users.length] = this.user;
//            this.allUser = users;
//
//        }
//
//        return true;
//    }
//
//    public boolean checkSmsCode(int code, int random) {
//        return code == random;
//
//
//    }
//
//    private int randomCode() {
//        Random random = new Random();
//        return random.nextInt(9999, 100000);
//    }
//}
