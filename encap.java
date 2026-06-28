import java.util.*;
public class encap {
    public static void main(String[] args) {
        Can c = new Can();
        c.sum(5, 6);
      

    }
}
interface a{
    void sum(int a , int b);
}
interface b{
    void sum(int a , int b);
}

class Can implements a,b{
  public void sum(int a , int b){
   System.out.println(a+b);
   }
  
}