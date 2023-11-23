package hust.soict.hedspi.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class NoGarbage {
    public static void main(String[] args) {
        String filename = "hust/soict/hedspi/lab03/garbage/test.exe";
        byte[] inputBytes = {0};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        startTime = System.currentTimeMillis();
        StringBuilder outputString = new StringBuilder();
        for(byte b: inputBytes) {
            outputString.append((char) b);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time elapsed when using StringBuilder: " + (endTime - startTime) + "ms");
    }
}