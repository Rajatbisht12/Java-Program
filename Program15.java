class Vehicle{
    String wheels = "Vehicle moves because of wheels";
}

class Truck extends Vehicle{
    String wheels = "Truck has 4 wheels";
    void printWheel(){
        System.out.println(wheels);
        System.out.println(super.wheels);
    }
}

public class Program15 {
    public static void main(String[] args) {
       Truck b = new Truck();
       b.printWheel();
    }
}