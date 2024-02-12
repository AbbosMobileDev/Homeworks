package lesson27.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        HomeDirector homeDirector = new HomeDirector();
        ConcredBuilder builder = new ConcredBuilder();
        homeDirector.TEN_THAUSAND_DOLLAR_home(builder, "Abbos");
        Home home =builder.build();
        System.out.println(home);
    }
}
