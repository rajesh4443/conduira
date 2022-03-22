class MyThread implements Runnable{
    
    @Override
    public void run(){
        System.out.println("Current Thread name is " + Thread.currentThread().getName());
    }
}

public class Main
{
	public static void main(String[] args) {
		MyThread task1 = new MyThread();
		Thread thread1 = new Thread(task1);
		thread1.start();
		System.out.println("Main class thread name is " + Thread.currentThread().getName());
	}
}
