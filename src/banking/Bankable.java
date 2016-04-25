package banking;
 
public /*abstract*/ interface Bankable {
    
    /*public abstract*/ void deposit(String acNum, int amt);
    
    int balance(String acNum);
    
    void withdraw(String acNum, int amt);
}