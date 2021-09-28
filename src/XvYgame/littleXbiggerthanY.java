package XvYgame;

import java.util.Scanner;


public class littleXbiggerthanY {
    
    public void XYfunction(){

Scanner chooseNumber = new Scanner(System.in);
        int x = 5;
       
        System.out.println("Enter your number");
        int y = chooseNumber.nextInt();
            chooseNumber.close();
             if (x > y){
          System.out.println("Your number is LOWER than "+ x);
        }
            else if (x < y){
                System.out.println("Your number is HIGHER than "+ x);
        }
                else if (x == y ){
                    System.out.println("Your number is the same as " + x +  " please pick a new number");
                }
}

}