public class enap { // Capitalized class name
    private double balance; 

    public void deposit(double amount) { // Fixed spelling & camelCase
        if (amount > 0) {
            balance += amount; 
            System.out.println(balance);
        }
    }

    public void withdraw(double amount) {
        // Logical check: Don't allow withdrawing more than the balance
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }

    public void checkBalance() { // camelCase
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        enap e = new enap();
        e.deposit(1000); 
        e.checkBalance();
    }
}