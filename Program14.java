class Man{
    void pay()
    {
        System.out.println("Paying Bill");
    }
}

class  Millonarie extends  Man{
    void pay()
    {
        System.out.println("Paying bill with tips");
    }
}

public class Program14 {
    public static void main(String[] args) {
        Man obj = new Millonarie();
        obj.pay();
    }
}