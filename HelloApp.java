/**
 * HelloApp – UC4 – A simple Java application that greets multiple users by name if
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 * * Greet Multiple Users - The application should accept multiple names as command-line
 * arguments and display a personalized greeting for each user.
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Developer
 * @version 4.0
 * @since UC1
 */

public class HelloApp {

    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            
            name = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}