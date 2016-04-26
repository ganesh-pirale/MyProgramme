 
package StaticCall;
 
public class Main {
    
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.sayHello();
        
        Parent parent1 = new Parent();
        parent1.sayHello();
        
        Child child = new Child();
        child.sayHello();
        
        child.sayHello();
        parent.sayHello();
        
        
    }
    
}
