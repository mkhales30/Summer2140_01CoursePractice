/**
 * class name: ChineseZodiac2Monauver
 * author: Monauver Rahman
 * date: June 02, 2022
 * version 1.0
 * description: This program will determine a given years Chinese Zodiac animal
 */

import java.util.Scanner;

public class ChineseZodiac2Monauver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the year? ");
        int year = keyboard.nextInt();
//        switch(year % 12){
//            case 0:
//                System.out.println("Monkey"); break;
//            case 1:
//                System.out.println("Rooster"); break;
//            case 2:
//                System.out.println("Dog"); break;
//            case 3:
//                System.out.println("Pig"); break;
//            case 4:
//                System.out.println("Rat"); break;
//            case 5:
//                System.out.println("Ox"); break;
//            case 6:
//                System.out.println("Tiger"); break;
//            case 7:
//                System.out.println("Rabbit"); break;
//            case 8:
//                System.out.println("Dragon"); break;
//            case 9:
//                System.out.println("Snake"); break;
//            case 10:
//                System.out.println("Horse"); break;
//            case 11:
//                System.out.println("Sheep"); break;

        if (year % 12 == 0) {
            System.out.print("Zodiac is Monkey");
        }
        else if (year % 12 == 1) {
            System.out.print("Zodiac is Rooster");
        }
        else if (year % 12 == 2) {
            System.out.print("Zodiac is Dog");
        }
        else if (year % 12 == 3) {
            System.out.print("Zodiac is Pig");
        }
        else if (year % 12 == 4) {
            System.out.print("Zodiac is Rat");
        }
        else if (year % 12 == 5) {
            System.out.print("Zodiac is Ox");
        }
        else if (year % 12 == 6) {
            System.out.print("Zodiac is Tiger");
        }
        else if (year % 12 == 7) {
            System.out.print("Zodiac is Rabbit");
        }
        else if (year % 12 == 8) {
            System.out.print("Zodiac is Dragon");
        }
        else if (year % 12 == 9) {
            System.out.print("Zodiac is Snake");
        }
        else if (year % 12 == 10) {
            System.out.print("Zodiac is Horse");
        }
        else {
            System.out.print("Zodiac is Sheep");
        }

    }

}
