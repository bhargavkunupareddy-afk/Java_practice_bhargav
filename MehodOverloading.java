class MehodOverloading {
  public void add(){
    System.out.println("Method over loading");
  }
    public int add(int a, int b){
    return a+b;
  }
}
public class Main{
public static void main(String[] args){ 
MehodOverloading obj = new MehodOverloading();
obj.add();
int  c= obj.add(3,5);
System.out.println("Additon: "+ c);
  }
}