public class Excepts extends Exception{
    private double x1;
    public double getNum() {
        return x1;
    }
    public Excepts(String message, double x1) {
        super(message);
        this.x1 = x1;
    }
}
