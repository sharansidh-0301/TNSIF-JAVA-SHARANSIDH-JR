package day11;
/* Thread is a Class, which comes from lang package.
*  A process is program that executes as a single thread
*  Multithreading in java - the process of executing multiple threads simultaneously
* Eg: Website -Servlet
* */
//Implementing thread using class
class MyTheard extends Thread{
    public void run(){
        System.out.println("Thread started Running.......");
    }
}
//Implementing Thread using Runnable Interface
class myRunnable implements Runnable{
    public void run(){
        System.out.println("Thread started Running from interface.......");
    }
}
public class threadsDemo{
    public static void main(String[] args) {

        MyTheard mt = new MyTheard();
        mt.start();

        myRunnable r = new myRunnable();
        Thread th = new Thread(r);
        th.start();

        threadDemo2 th2 = new threadDemo2(5,"Hello World");
        th2.start();
    }

}
