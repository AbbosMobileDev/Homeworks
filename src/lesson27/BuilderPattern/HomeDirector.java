package lesson27.BuilderPattern;

public class HomeDirector {

    public void TEN_THAUSAND_DOLLAR_home(Builder builder, String owner){
        builder.setDoorColor("White");
        builder.setHomePrise(Builder.HomePrice.TEN_THAUSAND_DOLLAR);
        builder.setDoorCount(2);
        builder.setWallColor("Blue");
        builder.setWindowCount(4);
        builder.setOwnerName(owner);
    }
    public void FIFTY_THAUSAND_DOLLAR_home(Builder builder, String owner){
        builder.setDoorColor("Yellow");
        builder.setHomePrise(Builder.HomePrice.FIFTY_THAUSAND_DOLLAR);
        builder.setDoorCount(3);
        builder.setWallColor("green");
        builder.setWindowCount(6);
        builder.setOwnerName(owner);
    }
    public void EIGHTY_THAUSAND_DOLLAR_home(Builder builder, String owner){
        builder.setDoorColor("black");
        builder.setHomePrise(Builder.HomePrice.EIGHTY_THAUSAND_DOLLAR);
        builder.setDoorCount(5);
        builder.setWallColor("red");
        builder.setWindowCount(10);
        builder.setOwnerName(owner);
    }
    public Builder homeBuild(Builder builder){
        return builder;
    }
}
