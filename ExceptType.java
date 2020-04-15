public class ExceptType extends Exception{
    private String x1;
    public ExceptType(String message, String x1) {
        super(message);
        this.x1 = x1;
    }
}
