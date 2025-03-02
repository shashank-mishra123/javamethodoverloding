package javabatch3;
// static method not access non_static methods
// access reference object pass//
// access without object
class static_methods
{
    String brand;
    int price;
    String country;
    static_methods(String brand,int price,String country)
    {
        this.brand= brand;
        this.price=price;
        this.country=country;

    }
    static void print (static_methods s)
    {
        System.out.println(s.brand+s.price+s.country);
    }
}
public class static_method {
    public static void main(String[] args) {
        static_methods s=new static_methods("india",40,"india");
        static_methods.print( s);

    }
}


