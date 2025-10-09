package day11;


class book extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Updating DB.....");
            try {
                Thread.sleep(8000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class num extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(6000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class Mutltithread{
    public static void main(String[] args) {

        book ob = new book();
        num ob1 = new num();

        //Threads1 Starts
        ob.start();

        //Threads1 Starts
        ob1.start();

        System.out.println("Done");

    }
}

