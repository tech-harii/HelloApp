/**
 * HelloApp - A simple Java application to display "Hello" greetings.
 *
 * This version (UC5) extends UC4 by accepting multiple command-line arguments
 * and iterating over them using an enhanced for loop. If no names are provided,
 * it should display "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Developer Name
 * @version 5.0
 * @since UC1
 */
public class HelloApp {

    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            // No arguments provided — default message
            message = "Hello, World!";
        } else {
            // Build greeting using StringBuilder and enhanced for loop
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            message = "Hello, " + nameBuilder.toString() + "!";
        }

        System.out.println(message);
    }
}