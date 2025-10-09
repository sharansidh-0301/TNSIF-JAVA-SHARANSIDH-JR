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


class myInter implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread Interface.......");
            try {
                Thread.sleep(5000);
            }catch(InterruptedException e){System.out.print(e);}
        }
    }
}

public class Mutltithread{
    public static void main(String[] args) throws InterruptedException {

        //Implementing Thread via Functional Interface
        Runnable r = ()->{
                for(int i=1;i<=5;i++) {
                    System.out.println("Lambda Expression Running......");
                    try {
                        Thread.sleep(5000);
                    }catch(InterruptedException e){System.out.println(e);}
                }
        };

        Runnable inter = new myInter();
        Thread t = new Thread(inter);
        t.start();

        Thread tt = new Thread(r);

        book ob = new book();
        num ob1 = new num();

        //Threads1 Starts
        ob.start();

        //Threads2 Starts
        ob1.start();

        //Functional Interface Thread
        tt .start();

        //Threads are joins with Main Function
        ob.join();
        ob1.join();
        tt.join();

        System.out.println("Done.............");

    }
}