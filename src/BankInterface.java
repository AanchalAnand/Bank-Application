public interface BankInterface {
    int getBalance();
    String depositMoney(int amount);
    String withdraw(int amount, String password);
    double calculateInterest(int time);
}
