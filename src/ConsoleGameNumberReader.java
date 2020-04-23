import java.util.Scanner;

public class ConsoleGameNumberReader implements GameNumberReader {
    Scanner scanner = new Scanner(System.in);
    public int getGuessedNumber(){
        return scanner.nextInt();
    }
}
