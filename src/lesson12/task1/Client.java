package lesson12.task1;

public  class Client {
private final double priceCall;
private final double priceSms;
private double money=0;

    public Client(double priceCall, double priceSms) {
        this.priceCall = priceCall;
        this.priceSms = priceSms;
    }
    public  void addSum(int addMoney){
        this.money += addMoney;
        System.out.println("Clientnming hoirgi puli :"+ money);

    }

    public boolean isActive(){
        if(money - priceCall>=0 || money - priceSms >=0)
            return true;
        else return false;
    }
    public boolean call(int minut){
        boolean can = false;
        if (priceCall*minut <= money){
            can = true;
            money = money - priceCall*minut;
        }

        return can;

    }
    public boolean sms(int smsCount){
        boolean impossible =false;
        if(priceSms * smsCount <= money){
            impossible = true;
            money = money -priceSms * smsCount;
        }

        return impossible;
    }
}
