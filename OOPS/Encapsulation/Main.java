class BankAccount {
    private double balace;

    public void deposit(double amount){
        if(amount>0){
            balace += amount;
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<= balace){
            balace -= amount;
        }else{
            System.out.print("invalid amount");
        }
    }
    public double getBalance(){
        return balace;
    }

    
}
public class Main{

    public static void main(String [] a){
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
       // System.out.println("Balance after deposit: " + account.getBalance());
        System.out.println("Balance after withdrawn: " + account.getBalance());
    }
}
