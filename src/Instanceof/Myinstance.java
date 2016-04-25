 
package Instanceof;

 
public class Myinstance extends instance{
    
    static void method(instance I){
        if(I instanceof Myinstance){
            Myinstance myinstance = (Myinstance)I;
        }
            
    }
    
    
    public static void main(String[] args) {
    
//        Myinstance myinstance = new instance();   // bap mula sarka kadhi asu shakat nai 
//        System.out.println(Myinstance instanceof instance);
        
        /*instance instance = new Myinstance();       // mulga bapa sarka asu skakto 
        System.out.println(instance instanceof Myinstance);
        
        check this example 

        instance Myinstance = new Myinstance();
        System.out.println(Myinstance instanceof instance);*/
        
        instance I = new Myinstance();
        
        Myinstance.method(I);          // The static method can not use non static data member 
                                       // or call non-static method directly
        
 
    
    }

}