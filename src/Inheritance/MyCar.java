 
package Inheritance;

public class MyCar extends Car{

    void run(){
        System.out.println("running MyCar...");
    }    

public static void main(String[] args) {
        Car c = new MyCar();        // right side value is asigned to left side and here new allocates memory for MyCar so its methods are invoked
        c.run();       // consider bank example
    }
}
