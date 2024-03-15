//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072

public class SavingAccount extends Account {
    private double interestRate;
    
    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
}
