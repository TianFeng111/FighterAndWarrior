package Rational;

/**
 * Created by Admin on 2018/11/7.
 */
public class RationalTest {
    public static void main(String[] args) {
        Rational r = new Rational();
        r.plus(1,3,3,1);
        r.multiplication(1,3,3,1);
        r.isEqualTo(1,3,3,1);
        r.isEqualTo(1,3,2,6);
    }
}
