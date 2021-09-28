import java.util.Scanner;

import XvYgame.littleXbiggerthanY;
public class Runner {
    public static void main(String[] args) throws Exception {
String selection;
int select = 1;


Scanner gameSelector = new Scanner(System.in);
System.out.println("What game do you want to play? Please select from this list: \n 1: XvY \n 2: ");

switch (select){
    case 1: selection = "XvY";
   littleXbiggerthanY XvsY = new littleXbiggerthanY();
   
XvsY.XYfunction();
break;

}
gameSelector.close();
}
}