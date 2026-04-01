/**
 * HelloApp - A simple Java application to display "Hello" greetings.
 *
 * UC6: Display "Hello" with Multiple Command-Line Arguments using substring
 * to Remove Trailing Delimiter — The application should accept multiple names as
 * command-line arguments and display a personalized greeting for each user using
 * substring to remove the trailing delimiter.
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Developer
 * @version 7.0
 * @since UC1
 */
public class HelloApp {
    public static void main(String[] args) {

        String names = "World";

        if (args.length > 0) {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}