package banking;

 
public interface HdfcBankable extends Bankable{
    
    void housingLoan(String acNum, int amt);
}