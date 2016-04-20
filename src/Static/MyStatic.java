package Static;
 
public class MyStatic {
    int rollNum ;
    String name;
    static String clg = "PVPIT";

    public MyStatic(int a,String b) {
        rollNum = a;
        name = b;
        System.out.println(" " +rollNum+ " " +name +" "+ clg);
    }
    
     static public String Change(){
        return clg = "WALCHAND";
    }
     
     /*** The static method can not use non static data member or call non-static method directly ***/
     static public void ChangeStatic(){
         //System.out.println(clg+ " " +rollNum+ " " +name +" ");
    }
     
//    void display()
//    {
//        System.out.println(" " +rollNum+ " " +name +" "+ clg);
//    }
    
    
    
    public static void main(String[] args) {
        MyStatic ms = new MyStatic(1,"ABC");
        MyStatic ms1 = new MyStatic(2,"PQR");
        
//        ms.display();
//        ms1.display();

    String res = ms.Change();
        System.out.println(" "+res);
       // System.out.println(" "+name);
       
        
    }
}
