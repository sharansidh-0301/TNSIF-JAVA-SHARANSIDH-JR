package day10;

/*
Exception - can be solved by the programmers
 Occurs due to issues in application code (e.g., invalid input, API misuse) and can be anticipated and handled.
Error - are usually beyond the control of the programmer. and we should not try to handle the error,


* */

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("Main Method Performing.......");
        int result =0;
        try{
            result =  demo1.perform(12,0);
        }catch(Exception e){
            System.out.println("You got error : "+e.getMessage());
            System.out.println("Please Change the Input...");
        }finally {
            System.out.println("Finally Blocks Running.......");
        }

    }
}
