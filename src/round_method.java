import java.util.Scanner;

public class round_method {
    public void getMethod(double val, int type){
        int round_type;                             // select rounding method; 0=floor, 1=ceil
        Scanner user_input = new Scanner(System.in);
        System.out.print("""
                Which Rounding Method Would You Like To Use?
                    1. Floor Method
                    2. Ceiling Method
                """);
        System.out.print(">>> ");
        round_type = user_input.nextInt() - 1;
        //round_type = 0;   // debugging

        if (round_type < 0 || round_type > 1) {
            System.out.println("\nMethod not available\nAborting...");
            System.exit(404);
        }

        System.out.println("\nStarting Value: " + val);

        if (round_type == 0) floorRound(val);
        if (round_type == 1) ceilingRound(val);
    }

    // round down to nearest int
    private void floorRound(double val){
        int int_part = 0;

        // drop decimal
        if (val < 0) int_part = (int) val - 1;
        else int_part = (int) val;

        System.out.println("Rounded Value (Floor): " + int_part);
    }

    // round up to nearest int
    private void ceilingRound(double val){
        int int_part = 0;

        // double to int conversion; drop decimal
        if (val < 0) int_part = (int) val;
        else int_part = (int) val + 1;

        System.out.println("Rounded Value (Ceiling): " + int_part);
    }
}
