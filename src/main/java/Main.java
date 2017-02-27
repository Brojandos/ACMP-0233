import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 27.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("input.txt"));
        PrintWriter output = getPrintWriter();
        int bridgeQuantity = input.nextInt();
        for (int i = 1; i <= bridgeQuantity; i++) {
            if (input.nextInt() <= 437) {
                output.print("Crash " + i);
                output.close();
                return;
            }
        }
        output.print("No crash");
        output.close();
    }

    private static PrintWriter getPrintWriter() throws IOException {
        try {
            return new PrintWriter(new File("output.txt").getAbsoluteFile());
        } catch (FileNotFoundException e) {
            PrintWriter output = new PrintWriter(new File("output.txt").getAbsoluteFile());
            output.print("File not found!");
            e.printStackTrace();
            return output;
        }
    }
}