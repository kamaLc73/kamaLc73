package Threads_Test;
public class MyThread extends Thread {
	public MyThread() {
	}
	public void run(){
		for (int i = 0; i < 3; i++) {
			try {
				System.out.print(Thread.currentThread().getName()+ " --> " + i + " \n");
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
