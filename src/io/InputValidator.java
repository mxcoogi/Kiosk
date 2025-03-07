package io;

import java.util.Scanner;

public class InputValidator {

    public static Scanner sc = new Scanner(System.in);

    public static int isValid(){
        try{
            int input = Integer.parseInt(sc.nextLine());
            if(input < 0) throw new Exception();
            return input;
        } catch (Exception e) {
            return -1;
        }
    }
}
