package banking;

 
public class UbiAtm implements UBIBankable{

    
    @Override
    public void goldLoan(String acNum, int grams) {
        
        System.out.println("Gold Loan for Acount Num - "+acNum +" Grams - "+grams);
    }

    @Override
    public void deposit(String acNum, int amt) {
        
        System.out.println("Ubi deposit to AC num -"+acNum +" Amount - "+amt);
    }

    @Override
    public int balance(String acNum) {
        
        return 2200;
    }

    @Override
    public void withdraw(String acNum, int amt) {
        System.out.println("Ubi withdraw to AC num -"+acNum +" Amount - "+amt);
    }
}