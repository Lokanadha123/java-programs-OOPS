package exception;
import java.io.*;
public class except2 {
    public static void main(String[] args) {
        try {
            FileOutputStream obj1 = new FileOutputStream("D:\\java.txt");
            String C = "welcome";
            byte b[] = C.getBytes();
            obj1.write(b);
            obj1.write(90);
            obj1.close();
            System.out.println("byte");
        } catch (Exception e) {
            System.out.println("execute");
        }

    }
}
