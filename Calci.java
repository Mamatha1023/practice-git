 public interface Calci{
  int add(int n1,int n2);
}
class CalciImpl implements Calci{
    public int add(int n1,int n2){
        System.out.println(n1+"+"+n2+"=".add(n1,n2));
    }
}