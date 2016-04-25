package banking;

 
public class Main {
    
    public static void main(String[] args) {
        
        UbiAtm ubiAtm = new UbiAtm();
        System.out.println("Balance is - "+ubiAtm.balance("1000"));;
        ubiAtm.withdraw("100", 1500);
        ubiAtm.deposit("100", 15000);
        ubiAtm.goldLoan("1000",150);
        
        HdfcAtm hdfcAtm = new HdfcAtm();
        System.out.println("Balance is - "+hdfcAtm.balance("1000"));;
        hdfcAtm.withdraw("200", 2500);
        hdfcAtm.deposit("200", 25000);
        hdfcAtm.housingLoan("2000", 250);
        
        CommanAtm atm = new CommanAtm();
        atm.swipe(hdfcAtm);   // void swipe(10);
        atm.swipe(ubiAtm);    // void swipe(20);  
    }
}