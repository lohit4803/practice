public interface bankInterface
{
    int balance();
    String addMoney(int money);
    String withdrawMoney(int money);
    int calcInterest(int years);
}
