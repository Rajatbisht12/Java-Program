interface Walk{
    void walk();
}

interface Run{
    void run();
}

class Animal implements Walk,Run{
    @Override
    public void walk() {
        System.out.println("Walkable interface is getting ready");
    }

    @Override
    public void run() {
        System.out.println("Runnable phase");
    }
}
class Human extends Animal{
}

public class Program17 {
    public static void main(String[] args) {
        Walk h1 = new Human();
        Run h2 = new Human();
        h1.walk();
        h2.run();
    }
}