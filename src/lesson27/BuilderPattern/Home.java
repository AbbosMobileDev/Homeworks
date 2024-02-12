package lesson27.BuilderPattern;

import lesson27.BuilderPattern.Builder.HomePrice;

public class Home {
    private final Builder.HomePrice homePrice;


    private final String wallColor;
    private final int windowCount;
    private final int doorCount;

    private final String doorColor;
    private final String ownerName;


    public Home(HomePrice homePrice, String wallColor, int windowCount, int doorCount, String doorColor, String ownerName) {
        this.homePrice = homePrice;
        this.wallColor = wallColor;
        this.windowCount = windowCount;
        this.doorCount = doorCount;
        this.doorColor = doorColor;
        this.ownerName = ownerName;
    }

    public HomePrice getHomePrice() {
        return homePrice;
    }

    public String getWallColor() {
        return wallColor;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Home{" +
                "homePrice=" + homePrice +
                ", wallColor='" + wallColor + '\'' +
                ", windowCount=" + windowCount +
                ", doorCount=" + doorCount +
                ", doorColor='" + doorColor + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
