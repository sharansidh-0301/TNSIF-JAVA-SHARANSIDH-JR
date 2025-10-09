package day10;
/*throw in java is a keyword that is used to throw a built-in exception or a custom exception explicitly or manually*/

/* throws used in the method declaration
   It provides just a indication that the method have exceptions */

public class throwDemo {

    public static void main(String[] args) {
        int num=1;
        int den=0;

        if (den==0) {
            //explicitly throwing the error
        throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.print(num/den);
    }
}
