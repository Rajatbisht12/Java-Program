// import java.io.*;

// public class Program31 {
//     public static void main(String[] args) throws IOException, ClassNotFoundException {
//         VehicleInfo bmw = new VehicleInfo("BMW", 40, 4);
//         File serializedFile = new File("/Users/rajatbisht/Desktop/InputOutput/serialize.bin");
//         new Program31().serialize(serializedFile,bmw);
//         new Program31().deserialize(serializedFile);
//     }
//     public void serialize(File file, VehicleInfo instanceVehicleinfo) throws IOException {
//         FileOutputStream fileOutputStream = new FileOutputStream(file);
//         ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);
//         obj.writeObject(instanceVehicleinfo);
//         obj.flush();
//         obj.close();
//     }

//     private void deserialize(File file) throws IOException, ClassNotFoundException {
//         FileInputStream fileInputStream = new FileInputStream(file);
//         ObjectInputStream obj = new ObjectInputStream(fileInputStream);
//         VehicleInfo deserialize = (VehicleInfo) obj.readObject();
//         System.out.println("Name of serialized vehicle"+deserialize.nameOfvehicle);
//         System.out.println("Number of wheels of serialized vehicle"+deserialize.numberOfWheels);
//         System.out.println("Mileage of serialized vehicle"+deserialize.mileaga);

//     }
// }