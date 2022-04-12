//++++++++++++++++++++++++++++++++++++++++++++++++
// Name: getMapType.java
// Function: get function mapping type
// Programmer: Charles Lett Jr.
// Last Updated: 03/29/22
//++++++++++++++++++++++++++++++++++++++++++++++++

import java.util.Arrays;
import java.util.Scanner;

public class getMapType {
    public void run(){
        getType();
    }

    private static void getType(){


        // provided function
        String[] func_X = {"a", "b", "c", "d"};
        String[] func_Y = {"1", "2", "3", "4"};

        // init storage for user function
        String[] u_func_X = new String[4];
        String[] u_func_Y = new String[4];

        Scanner uInput = new Scanner(System.in);

        System.out.println("Provided Function: \n"
        + "\tX = " + Arrays.toString(func_X)
        + "\n\tY = " + Arrays.toString(func_Y));

        System.out.println("Now choose from the above to create your own set.");

        System.out.println("Begin Filling Domain...");
        for (int x = 0; x < u_func_X.length; x++){
            System.out.print((x + 1) + "/" + u_func_X.length + " >>> ");
            u_func_X[x] = uInput.nextLine();
        }
        System.out.println("Domain Filled!");

        System.out.println("\nBegin Filling Target");
        for (int y = 0; y < u_func_Y.length; y++){
            System.out.print((y + 1) + "/" + u_func_Y.length + " >>> ");
            u_func_Y[y] = uInput.nextLine();
        }
        System.out.println("Target Filled!");

        // begin type check
        int[] target_count = new int[4];    // number target occurrences

        for (int i = 0; i < u_func_Y.length; i++) {
            for (int j = 0; j < u_func_Y.length; j++) {
                if (Integer.valueOf(u_func_Y[i]) == Integer.valueOf(u_func_Y[j])) target_count[i] += 1;
            }
        }

        // debug info
        System.out.println(Arrays.toString(u_func_X));
        System.out.println(Arrays.toString(u_func_Y));
        System.out.println(Arrays.toString(target_count));


    }
}
