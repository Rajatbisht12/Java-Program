public class Program13 {
    public void area(int b, int h)
    {
        System.out.println("Area of triangle is "+0.5*b*h);
    }
    public void area(int r)
    {
        System.out.println("Area of circle is "+3.14*r*r);
    }

    public static void main(String[] args) {
        Program13 a = new Program13();
        a.area(2, 4);
        a.area(10);
    }
}