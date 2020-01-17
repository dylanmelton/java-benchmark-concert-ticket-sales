package app;

// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello Java");
//     }
// }
import java.util.Scanner;

class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a movie: ");
        String movie = input.next();
        System.out.println("You entered: " + movie);

    }
}