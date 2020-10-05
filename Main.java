import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rack rack = new Rack();
        rack.print_rack();

        String ball_drawn;
        int number;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        do {
            System.out.println("To close lottery write STOP.");
            System.out.println("Insert the number drawn:");
            System.out.print("> ");

            try {
                ball_drawn = reader.readLine();

                if (ball_drawn.equals("STOP")) {
                    break;
                }
                number = Integer.parseInt(ball_drawn);

                rack.add_ball(number);
                rack.print_rack();

            } catch (IOException ioException) {
                System.out.println("Error reading input");
            }
        } while (true);
    }
}
