package hust.soict.hedspi.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "hust/soict/hedspi/garbage/test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        startTime = System.currentTimeMillis();
        String outputString = "";
        for(byte b: inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time elapsed when using String: " + (endTime - startTime) + "ms");
    }
}