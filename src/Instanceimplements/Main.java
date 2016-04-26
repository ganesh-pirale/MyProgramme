
package Instanceimplements;


public class Main {
    
    public static void main(String[] args) {
        
        Printable x = new A();
        Printable y = new B();
        
        Call c = new Call();
        c.invoke(x);
        c.invoke(y);
        
    }
    
}
