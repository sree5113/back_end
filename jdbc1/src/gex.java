import java.util.Scanner;

public class gex {
    public static void main(String[] args) {
        int points = 0;
        System.out.println("welcome to the game ");
        Scanner scn  = new Scanner(System.in);


        System.out.println("enter yes to start game");
        String a = scn.next();
        if ( a.equalsIgnoreCase("yes")){
            System.out.println("lets play");

            //Question 1
            System.out.println("what is the largest land animal");
            String b = scn.next();
            if (b.equalsIgnoreCase("elephant")){
                System.out.println("right answer");
                points = points+10;
            }else {
                System.out.println("wrong answer");
                points = points-5;
            }

            //Question 2
            System.out.println("what is the capital of india");
            String c = scn.next();
            if (c.equalsIgnoreCase("Delhi")){
                System.out.println("right answer");
                points+=10;
            }
            else {
                System.out.println("wrong answer");
                points = points-5;
            }
            System.out.println("game over! your final score:" + points);

            if (points == 20) {
                System.out.println("congrates");
            }else {
                System.out.println("better luck next time");
            }
        }else {
            System.out.println("thanks for comming ");
        }
    }
}
