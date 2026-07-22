package Exceptions;

import java.util.Scanner;

public class Wbt1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Start");
        System.out.print("1.Do Transaction\n2.Bring Water:");
        int input = in.nextInt();
        try {
            if (input == 1) {
                callCheckedException();
            } else if (input == 2) {
                callUncheckedException();
            }
        } catch (TransactionFailed | GlassBroken e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }

    public static void callCheckedException() throws TransactionFailed {
        throw new TransactionFailed("Network Problem");
    }

    public static void callUncheckedException() {
        throw new GlassBroken("Glass was Slippery");
    }
}


//BOBBLY LIFE
//SHINCHAN
//bayblade
//totally accurate batttle simuator

