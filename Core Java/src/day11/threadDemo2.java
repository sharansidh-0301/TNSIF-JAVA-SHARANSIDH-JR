package day11;

public class threadDemo2 extends Thread {

        private int n;
        private String msg;

        public threadDemo2(int n, String msg){
            this.n = n;
            this.msg = msg;
        }

        public void run(){
            for(int i=0; i<n; i++){
                try{
                    Thread.sleep(300);
                }catch (InterruptedException e){
                    System.out.println("Thread interrupted: "+ e.getMessage());
                }
                System.out.println(msg + " "+i + " " + Thread.currentThread().getName());
            }

        }

}


