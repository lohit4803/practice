public class Bank implements bankInterface
{
    private int accountNo;
    private String name;
    private int balance;
    int rateOfInterest;

    public Bank(String name, int balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int balance() {
        return balance;
    }

    @Override
    public String addMoney(int money) {
        balance += money;
        return "balance is "+balance;
    }

    @Override
    public String withdrawMoney(int money) {
        balance -= money;
        return "balance is "+balance;
    }

    @Override
    public int calcInterest(int years) {
        return balance * rateOfInterest * years;
    }
}
