 
package Abstract;

public class Honda extends Bike {

     void run(){
         System.out.println("running Honda");
     }
    
     public static void main(String[] args) {
        Bike bk = new Honda();
        bk.run();
    
  }
}
