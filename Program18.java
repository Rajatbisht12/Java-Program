interface Welcomes{
    default void say(){
        sayhello();
    }

    private  void sayhello(){
        System.out.println("Hello... i'm private method. Welcome to edureka");
    }
}

public class Program18 implements Welcomes {
    public static void main(String[] args) {
        Welcomes s = new Program18();
        s.say();
    }
}