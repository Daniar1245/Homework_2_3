public class BankAccount {
    private Double amount;

    public void deposit(Double sum) {
        amount = amount + sum;
        System.out.println("You have topped up on:" + amount + "number;");
    }

    public Double getAmount() {
        return amount;
    }

    public void withDraw(Integer sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("There are not enough funds in your account. Your account is:" + amount, amount);
        } else {
            amount -= sum;
            System.out.println("You have removed" + sum +
                    "\n" + "Remains:" + amount);
        }

    }
}
