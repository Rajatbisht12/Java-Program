public class Program5 {
    public Integer add(Integer args1, Integer args2)
    {
        Integer sum = args1 + args2;
        return sum;
    }

    public static void main(String[] args) {
        Program5 cal = new Program5();
        Integer result = cal.add(8,9);
        System.out.println(result);
    }
}