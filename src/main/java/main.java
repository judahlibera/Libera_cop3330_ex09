/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        final double apg = 350;
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter length. ");
        int l = sc.nextInt();
        System.out.printf("Enter width. ");
        int w = sc.nextInt();
        int a = l * w;
        int g = (int)Math.ceil(a / apg);
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.\n",g,a);
    }
}