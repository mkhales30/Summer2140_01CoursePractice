/**
 * class name: SkippingDemo
 * author: Monauver Rahman
 * date: June 02, 2022
 * version 1.0
 * description: this program will check addition answers
 */

public class AdditionQuiz {
    public static void main(String[] args)
    {

        int number1 = (int)(System.currentTimeMillis() % 10) ;
        int number2 = (int)(System.currentTimeMillis() *7 % 10) ;
        java.util.Scanner consolInput = new java.util.Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "= ? ");
        int answer = consolInput.nextInt();

        if (answer == (number1 + number2)) {
            System.out.println("Your answer is correct! :)");
        }
        else {
            System.out.println("Your answer is not correct :(");
        }
