class MyThread extends Thread{
    
    @Override
    public void run(){
        System.out.println("Current Thread name is " + currentThread().getName());
    }
}

public class Main
{
	public static void main(String[] args) {
		MyThread task1 = new MyThread();
		task1.start();
		System.out.println("Main class thread name is " + Thread.currentThread().getName());
	}
}