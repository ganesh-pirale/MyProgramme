package banking;

public class CommanAtm {
    
    void swipe(Bankable bankable)              /* it is very similar to int i parameter */    //void swipe(int i);
    {
        System.out.println(" Balance - "+bankable.balance("100"));
        bankable.deposit("100", 4531);
        bankable.withdraw("45", 12);
        
    }
}