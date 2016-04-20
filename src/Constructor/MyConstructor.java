package Constructor;
 
public class MyConstructor {
    String carName;
    int carNum;
            
    public MyConstructor() {
        carName = "Audi";
        carNum = 1234;
        System.out.println(" " +carName+ " " +carNum);
    }
    MyConstructor(String a, int b){
        carName = a ;
        carNum = b;
        System.out.println(" " +carName+ " " +carNum);
    }
    
    
 
    public static void main(String[] args) {
      MyConstructor mc = new MyConstructor();
      MyConstructor mc1 = new MyConstructor("BMW",1117);
      
    }
}
