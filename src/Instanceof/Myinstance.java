 
package Instanceof;

 
public class Myinstance extends instance{
    
    static void method(instance I){
       // Myinstance myinstance = (Myinstance)I;
        //if(I instanceof Myinstance){
            Myinstance myinstance = (Myinstance) I;
            System.out.println("downcasting is performed successfully");
            
    myinstance.ParentAccess();
            
            
        //}
        //myinstance.ParentAccess();
            
    }
    
    
    public static void main(String[] args) {
    
//        Myinstance myinstance = new instance();   // bap mula sarka kadhi asu shakat nai i.e mulga is not equal to bap
//        System.out.println(Myinstance instanceof instance);
        
        /*instance instance = new Myinstance();       // mulga bapa sarka asu skakto i.e bap is equal to mulga 
        System.out.println(instance instanceof Myinstance);
        
        check this example 

        instance Myinstance = new Myinstance();
        System.out.println(Myinstance instanceof instance);*/
        
        instance I = new instance(); // 1. if statement will not get executed 
        //  instance I = new Myinstance();
        
        
        Myinstance.method(I);          // The static method can not use non static data member 
                                       // or call non-static method directly so need to create method above as static method 
                                       
        /* for example, when one tries to cast an Integer to a String, String is not an subclass of Integer, 
           so a ClassCastException will be thrown.

        Object i = Integer.valueOf(42);
        String s = (String)i;            // ClassCastException thrown here.*/
 
    }

}