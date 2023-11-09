public class BankAccount {
    private String id;
    private String name;
    private double balance;

    public BankAccount() {
        this.id = "1";
        this.name = "Nantawat";
        this.balance = 900;
    }

    public BankAccount(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }else{
            System.out.println("Reset");
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }else{
            System.out.println("The amount is not enough.");
        }
    }

    public double checkBalance() {
        return this.balance;
    }
}
