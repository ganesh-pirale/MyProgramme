 
package Interface;
 
public class MyPrinter implements Printable,Showable{
    
    @Override
    public void Print(){
        System.out.println("Printer is printing.....");
    }
    
    public void Show(){
        System.out.println("Printer is Showing.....");   // this is not actually not overriden from suggestions so not executing
    }
    
     @Override
    public void show() {
        System.out.println("Printer is Showing.....");
    }
    
    @Override
    public void close() {
           System.out.println("Printer is Closing");
    }
    
    @Override
    public void print() {
              System.out.println("Printing in Showing method ");
    }
    
    @Override
    public void display() {
        System.out.println("Print extends Showable so display in Showable will call.....");
    }
     
    public static void main(String[] args) {
        MyPrinter printer = new MyPrinter();    
        printer.Print();
        printer.print();
        printer.show();
        printer.close();
        printer.print();
        printer.print();
        printer.display();
        

    }

    

}
