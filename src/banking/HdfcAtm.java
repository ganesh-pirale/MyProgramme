package banking;

 
public class HdfcAtm implements HdfcBankable {
    
    
    @Override
    public void housingLoan(String acNum, int amt) {
        
        System.out.println("Housing Loan for Acount Num - "+acNum +" amt - "+amt);
    }

    @Override
    public void deposit(String acNum, int amt) {
        
        System.out.println("Hdfc deposit to AC num -"+acNum +" Amount - "+amt);
    }

    @Override
    public int balance(String acNum) {
        
        return 4400;
    }

    @Override
    public void withdraw(String acNum, int amt) {
        System.out.println("HDFC withdraw to AC num -"+acNum +" Amount - "+amt);
    }
    
}