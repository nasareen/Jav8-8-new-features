public class RunnableLambda {

    public static void main(String... strings){
        Runnable lambda = () ->{

            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+ ": "+ i);
            }
        };

        Thread thread = new Thread(lambda);
        //thread.run() -- will execute in the main thread.
        thread.start();
    }


}
