public class BankAccount {
    private double amount;

    private int withDraw;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sun) {
        amount += sun;
        System.out.println(" вы сняли со счета " + sun);
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException(" НЕ ДОСТАТОЧНО ДЕНЕГ ", amount);
        }
        System.out.println(" вы можете снять со счета " + sum);
        amount -= sum;
        System.out.println("вы сняли со счета " + sum);
    }
}
