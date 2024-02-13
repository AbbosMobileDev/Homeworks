package lesson27.BuilderPattern;

public class ConcredBuilder implements Builder {
    private Builder.HomePrice homePrice;
    private String wallColor;
    private int windowCount;
    private int doorCount;

    private String doorColor;
    private String ownerName;


    @Override
    public void setHomePrise(HomePrice homePrice) {
        this.homePrice= homePrice;
    }

    @Override
    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    @Override
    public void setWindowCount(int windowCount) {
        this.windowCount = windowCount;
    }

    @Override
    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }


    @Override
    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName=ownerName;
    }
    public Home build(){
        return new Home(homePrice,wallColor, windowCount, doorCount, doorColor, ownerName);}

}
