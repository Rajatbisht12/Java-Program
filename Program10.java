public class Program10 {
    int instanceVariable;
//    Program10()
//    {
//        instanceVariable = 200;
//    }
//
//    Program10(int value)
//    {
//        instanceVariable=value;
//    }

    Program10(int value)
    {
        this(value,14);
    }
    Program10(int value, int value1)
    {
        instanceVariable = value + value1;
    }

    public static void main(String[] args) {
        Program10 pg = new Program10(30);
//        Program10 pg = new Program10();
        System.out.println("The value of the instance variable is "+pg.instanceVariable);
    }
}