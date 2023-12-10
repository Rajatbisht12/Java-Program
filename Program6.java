public class Progrm6 {
    int data = 60;
     int Operation(int data){
        data = data*2/6;
        return data;
    }

    public static void main(String[] args) {
        Progrm6 pg = new Progrm6();
        System.out.println("Before "+ pg.data);
        pg.Operation(45);
        System.out.println("After "+ pg.data);
    }
}