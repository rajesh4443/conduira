class MyThread extends Thread{
    
    @Override
    public void run(){
        System.out.println("Hello All");
    }
}

public class Main
{
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();
		MyThread thread2 = new MyThread();
		thread2.start();
		MyThread thread3 = new MyThread();
		thread3.start();
		MyThread thread4 = new MyThread();
		thread4.start();
		MyThread thread5 = new MyThread();
		thread5.start();
	}
}