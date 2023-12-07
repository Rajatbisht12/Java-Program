public class Program1  {

    public void test(){
        System.out.println("Hello world");
    }

    static void Test2()
    {
        System.out.println("hello2");
    }

    public static void main(String[] args) {
        Program1 helloWorldObject = new Program1();
        System.out.println("Hello");
        helloWorldObject.test();
        Test2();

    }
}