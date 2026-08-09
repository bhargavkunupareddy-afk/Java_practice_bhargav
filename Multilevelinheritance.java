abstract class A{
    int age;
    String location;
    float salary;
    A(){
      age= 30;
      location="hyderbad";
      salary=55000f;
    }
    abstract void show();
    public void config() {
      System.out.println("excuted child function");
    }
}
class B extends A {
  String department;
   B() {
     super();
     department="HR";
     super.config();
   }
   public void show(){
     System.out.println("=======Employe Detaills========");
     System.out.println("Age: "+ age );
     System.out.println("location: "+ location );
     System.out.println("slary: "+ salary );
     System.out.println("Department: "+  department );
    }
}
public class Main{
  public static void main(String [] args) {
   B obj= new B();
   obj.show();
  }
}