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
 * @author Developer Name
 * @version 6.0
 * @since UC1
 */
public class HelloApp {

    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            // No arguments — default message
            message = "Hello, World!";
        } else {
            // Build name list using StringBuilder, appending ", " after each name
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove the trailing ", " (last 2 characters) using substring()
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            message = "Hello, " + names + "!";
        }

        System.out.println(message);
    }
}