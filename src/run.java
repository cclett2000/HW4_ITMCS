//++++++++++++++++++++++++++++++++++++++++++++++++
// Name: run.java
// Function: execution file; houses main class
// Programmer: Charles Lett Jr.
// Last Updated: 03/24/22
//++++++++++++++++++++++++++++++++++++++++++++++++

public class run {
    final static int ASSIGN_TYPE = 1;

    public static void main(String[] args){
        if(ASSIGN_TYPE == 0) {
            round_method rm = new round_method();
            rm.getMethod(-44.35,1);
        }

        if(ASSIGN_TYPE == 1) {
            getMapType gm = new getMapType();
            gm.run();
        }
    }
}
