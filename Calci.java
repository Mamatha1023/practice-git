 public interface Calci{
  int add(int n1,int n2);
}
class CalciImpl implements Calci{
    public int add(int n1,int n2){
        System.out.println(n1+"+"+n2+"="+c.add(n1,n2));
    }
}
public class Main{
    public static void main(String[] args){
        CalciImpl c=new CalciImpl();
        c.add(10, 20);
    }
}