//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072

public class CheckingAccount extends Account {
    private double overdraftProtection;
    
    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }
    
    public CheckingAccount(double balance) {
        this(balance, -1.0); // Default overdraftProtection is -1.0
    }
    
    @Override
    public boolean withdraw(double amount) {
        double overdraftNeeded = amount - balance;
        
        if(balance - amount >= 0.0) {
            balance -= amount;
            return true;
        } else if(overdraftProtection != -1.0 && overdraftProtection >= overdraftNeeded) {
            balance = 0.0;
            overdraftProtection -= overdraftNeeded;
            return true;
        } else {
            return false;
        }
    }
}