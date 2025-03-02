package javabatch3;
class  clacu
{
    void sum(int a,int b)
    {
        // return a+b;
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class methodoverloding  {
    public static void main(String[] args) {
        clacu c=new clacu();
        c.sum(1,2);
        c.sum(0,8,9);
    }
}

class Adcal
{
}