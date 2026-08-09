abstract class A{
    int age;
    String location;
    float salary;
    A(){
      age= 30;
      location="hyderbad";
      salary=55000f;
    }
    abstract public void show(); // Method overriding
    public void config() {
      System.out.println("Excuted child function");
    }
}

class C extends A {
  String department;
   C(int age, String location, float salary) {
      this.age=age;
      this.location=location;
      this.salary=salary;
      department="IT";
      super.config();
   }
   // Method overriding show is over ridded 
   public void show(){
     System.out.println("=======Employe Detaills========");
     System.out.println("Age: "+ age );
     System.out.println("location: "+ location );
     System.out.println("slary: "+ salary );
     System.out.println("Department: "+  department );
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
   C obj1= new C(30, "Chennai", 48000f);
   obj1.show();
  }
}