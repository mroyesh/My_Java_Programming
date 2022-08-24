package day39_collection.MultiThread;

public class ThreadHelloWorld extends Thread{
    int threadNumber;
    public ThreadHelloWorld(int threadNumber){
        this.threadNumber= threadNumber;
    }
    @Override
    public void run() {
        for(int i=1; i<6;i++){
            System.out.println("Hello World "+ i+ " From thread "+threadNumber);
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
