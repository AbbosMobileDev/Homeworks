package lesson21.Social_Network;

public class VideoData implements Comparable<VideoData>{
    private String title;
    private String desprition;
     int likeCount;
    private int dislikeCount;

    public VideoData(String title, String desprition, int likeCount, int dislikeCount) {
        this.title = title;
        this.desprition = desprition;
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
    }

    @Override
    public String toString() {
        return "VideoData{" +
                "title='" + title + '\'' +
                ", desprition='" + desprition + '\'' +
                ", likeCount=" + likeCount +
                ", dislikeCount=" + dislikeCount +
                '}';
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(int dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    @Override
    public int compareTo(VideoData o) {
        
        return 0;
    }
}
