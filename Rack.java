import java.util.ArrayList;

public class Rack {

    ArrayList<Integer> rack;

    Rack() {
        rack = new ArrayList<Integer>();
    }

    public void print_rack(){
        int i = 0;
        System.out.println("Balls in the rack:");
        for (i = 0; i < rack.size(); i++) {
            System.out.print(rack.get(i) + " ");
        }
        System.out.print("\n");
    }

    public void add_ball(int new_ball){
        rack.add(new_ball);
    }
}
