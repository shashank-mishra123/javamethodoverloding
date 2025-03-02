package javabatch3;

 class Parents
 {
   public void show( int n)
    {
        System.out.println("hii parent");
    }
    public void print(int k)
    {
        System.out.println("print parent ");
    }
}
class childs extends Parents
{
    public void show()
    {
        System.out.println("hii child");
    }
    public void print ( int k)
    {

        System.out.println(" print child ");
    }
}
public class method_overiding {
    public static void main(String[] args) {

        childs s=new childs();
        s.show(5);
        s.print(24);

    }
}
