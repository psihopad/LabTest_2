import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//

    do{
            Scanner sc = new  Scanner(System.in);
            System.out.println("Будь-ласка введіть x1: ");
            try {
                double x1;
                x1 = sc.nextDouble();
                calc calc = new calc(x1);

                System.out.printf("y1 = %.3f %n",calc.one());
                System.out.printf("y2 = %.3f %n", calc.two());
                System.out.printf("y3 = %.3f %n" , calc.tree());
                System.out.printf("y4 = %.3f %n" , calc.four());




            }catch (Excepts | InputMismatchException e) {
                System.out.println(e);
            }


    }while(true);
    }
}
