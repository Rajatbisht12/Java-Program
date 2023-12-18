interface Inter1{
    int a = 10;
    static  void display(){
        System.out.println("Static method interface");
    }
}

public class Program19 implements Inter1{
    public static void main(String[] args) {
        Inter1.display();
    }
}