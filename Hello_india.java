class MyThread implements Runnable{
    
    @Override
    public void run(){
        System.out.println("Hello India");
    }
}

public class Main
{
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		Thread  t1 = new Thread(thread1);
		t1.start();
		MyThread thread2 = new MyThread();
		Thread  t2 = new Thread(thread2);
		t2.start();
		MyThread thread3 = new MyThread();
		Thread  t3 = new Thread(thread3);
		t3.start();
		MyThread thread4 = new MyThread();
		Thread  t4 = new Thread(thread4);
		t4.start();
		MyThread thread5 = new MyThread();
		Thread  t5 = new Thread(thread5);
		t5.start();
	}
}