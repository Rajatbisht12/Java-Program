interface Money{
    void Operation();
}
class Debit implements Money{
    @Override
    public void Operation() {
        System.out.println("Debiting the money");
    }
}

class Credit implements Money{
    @Override
    public void Operation() {
        System.out.println("Crediting the money");
    }
}
public class Program16 {
    public static void main(String[] args) {
        Money d = new Credit();
        d.Operation();
    }
}