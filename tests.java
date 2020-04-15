
import org.junit.Assert;

import org.junit.Test;

public class tests {

    @Test (expected = Excepts.class)
    public void TC1() throws Excepts {
        double expected = 102.42;
        double res = new calc(2).one();
        Assert.assertEquals(expected, res,0.000001);
    }

    @Test
    public void TC2() throws Excepts {
        double expected = 35.060;
        double res = new calc(5).one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC3() throws ExceptType{
        double expected = 56.096;
        double res = new calc(" 8 6").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = Excepts.class)
    public void TC4() throws Excepts {
        double expected = 102.35;
        double res = new calc(-9).one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = Excepts.class)
    public void TC5() throws Excepts {
        double expected = 102.35;
        double res = new calc(- 9).one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC6() throws ExceptType {
        double expected = 56.096;
        double res = new calc(" 8").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = Excepts.class)
    public void TC7() throws Excepts {
        double expected = 102.35;
        double res = new calc(- 2).one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC8() throws ExceptType{
        double expected = 102.35;
        double res = new calc( "5,45").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test
    public void TC9() throws Excepts {
        double expected = 30.852800000000002;
        double res = new calc( 4.4).one();
        Assert.assertEquals(expected, res, 0.0000000000000001);
        // Expected Output - Результат обчислення
    }

    @Test
    public void TC10() throws Excepts {
        double expected = 56.096;
        double res = new calc( 8.).one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC11() throws ExceptType {
        double expected = 102.35;
        double res = new calc( "4.,4").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC12() throws ExceptType{
        double expected = 28.048;
        double res = new calc( "4. 6").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC13() throws ExceptType{
        double expected = 531.546;
        double res = new calc( "dsdasdas").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC14() throws ExceptType{
        double expected = 453.556;
        double res = new calc( "12dcs").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC15() throws ExceptType{
        double expected = 12305.5546;
        double res = new calc( "sdffsd fd").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC16() throws ExceptType{
        double expected = 5613.494;
        double res = new calc( "/").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC17() throws ExceptType{
        double expected = 161.1564;
        double res = new calc( "/444").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC18() throws ExceptType{
        double expected = 6546.4564;
        double res = new calc( "    ").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC19() throws ExceptType{
        double expected = 28.048;
        double res = new calc( "4 4 . 4 4").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC20() throws ExceptType{
        double expected = 14133.15678;
        double res = new calc( " ").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC21() throws ExceptType{
        double expected = 15662.15845;
        double res = new calc("1 kkk").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test (expected = ExceptType.class)
    public void TC22() throws ExceptType {
        double expected = 28.048;
        double res = new calc("4 kkk").one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test
    public void TC23() throws Excepts {
        double expected = 154.264;
        double res = new calc(  22).one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test
    public void TC24() throws Excepts {
        double expected = 178.71484399999997;
        double res = new calc(25.487).one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test(expected = Excepts.class)
    public void TC25() throws Excepts {
        double expected = 1231.156;
        double res = new calc(-2.3).one();
        Assert.assertEquals(expected, res, 0.000001);

    }

    @Test(expected = Excepts.class)
    public void TC26() throws Excepts {
        double expected = 1235.156;
        double res = new calc(2.3).one();
        Assert.assertEquals(expected, res, 0.000001);

    }
}

