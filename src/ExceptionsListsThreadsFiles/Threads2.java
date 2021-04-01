package ExceptionsListsThreadsFiles;

public class Threads2 {
    public static void main(String[] args) {
        class A implements Runnable{
            public void run()
            {
                System.out.println("Bye");
            }
        }
        class App{
            void main(String[] args) {
                Thread ob =new Thread(new A());
            }
        }
    }
}
