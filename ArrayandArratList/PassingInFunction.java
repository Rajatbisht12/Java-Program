public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = {5, 9, 10, 14, 99};
        for(Integer ar : arr){
            System.out.println(ar);
        }
        change(arr);
        for(Integer ar : arr){
            System.out.println(ar);
        }
    }

    public static void change(int[] arr) {
        arr[3] = 45;
    }
}