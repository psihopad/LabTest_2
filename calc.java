import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {
    private double x1;
    public calc(double x1) throws Excepts {

        if (x1 <= 3.28 || x1 >= 114.428) throw new Excepts("Неправильний діапазон. Введіть значення в діапазоні x1 <= 3.28 || x1 >= 114.428", x1);
        this.x1 = x1;
    }

    public calc(String x1) throws ExceptType{
        throw new ExceptType("Неправильний тип даних.", x1);
    }
    public Double one() {

        double y = x1* 7.012;
        return y;

    }
    public Double four() {

        double y = (2.226 * (Math.pow(x1, 4)) + (2.196 * Math.pow(x1, 3))) -  (7.083 * Math.pow(x1, 2)) + x1*3.724;
        return y;

    }
    public Double tree() {

        double y = (4.729 * Math.pow(x1, 3)) -  (2.429 * Math.pow(x1, 2)) + x1*2.987;
        return y;

    }
    public Double two() {

        double y = (2.022 * Math.pow(x1, 2)) + x1*4.567;
        return y;

    }

}
