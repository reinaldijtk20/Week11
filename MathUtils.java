public class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException {
        if(n < 0) {
            throw new IllegalArgumentException("Factorial for negative number is undefined");
        }

        if(n > 16) {
            throw new IllegalArgumentException("Arithmetic Overflow");
        }

        int fac = 1;
        for(int i = n; i>0; i--) {
            fac*=i;
        }
        return fac;
    }
}
