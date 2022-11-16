public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                try {
                    bankAccount.withDraw((int)e.getRemainingAmount());
                } catch (LimitException ex) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
