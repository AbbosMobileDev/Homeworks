package lesson27.BuilderPattern;

public interface Builder {


    enum HomePrice {
        TEN_THAUSAND_DOLLAR, FIFTY_THAUSAND_DOLLAR, EIGHTY_THAUSAND_DOLLAR

    }

    void setHomePrise(HomePrice homePrice);

    void setWallColor(String wallColor);

    void setWindowCount(int windowCount);

    void setDoorCount(int doorCount);

    void setDoorColor(String doorColor);

    void setOwnerName(String ownerName);


}
