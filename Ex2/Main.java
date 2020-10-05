import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String input_number;
        int number;
        Number written_number = new Number();

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        do {
            System.out.println("To stop reading numbers write STOP");
            System.out.println("Write your number:");
            System.out.print("> ");

            try {
                input_number = reader.readLine();

                if (input_number.equals("STOP")) {
                    break;
                }

                number = Integer.parseInt(input_number);

                written_number.number_in_words(number);


            } catch (IOException ioException) {
                System.out.println("Error reading input.");
            }
        } while (true);

    }
}
