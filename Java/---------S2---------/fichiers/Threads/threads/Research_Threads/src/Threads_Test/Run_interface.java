package Threads_Test;
public class Run_interface  implements Runnable {
	public Run_interface() {
	}
	@Override
	public void run(){
		for (int i = 0; i < 3; i++) {
			try {
				System.out.print(Thread.currentThread().getName()+ " --> " + i + " \n");
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
