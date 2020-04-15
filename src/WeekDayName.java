/*
This program prints out the the weekday name with given weekday number to calculate the weekday name.
 */

import java.util.Scanner;

public class WeekDayName {

    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weekday number: ");
        num = input.nextInt();

        if(num == 1){
            System.out.println("It is Sunday.");
        }
        else if(num == 2){
            System.out.println("It is Monday.");
        }
        else if(num == 3){
            System.out.println("It is Tuesday.");
        }
        else if(num == 4){
            System.out.println("It is Wednesday.");
        }
        else if(num == 5){
            System.out.println("It is Thursday.");
        }
        else if(num == 6){
            System.out.println("It is Friday.");
        }
        else if(num == 7){
            System.out.println("It is Saturday.");
        }
        else{
            System.out.println("Oooops! number out of range.");
        }
    }
}
