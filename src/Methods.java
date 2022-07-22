import java.io.*;

public class Methods<I> {

    public void serialize(I employee) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\employee.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Employee saved...");
    }

    public I deserealize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d:\\employee.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        I employee = (I) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Employee restored...");
        return employee;
    }

}
