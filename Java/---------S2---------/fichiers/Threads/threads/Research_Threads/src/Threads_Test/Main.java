package Threads_Test;
public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		
		Thread t0 = new Thread(new Run_interface());
		Thread t1 = new Thread(new Run_interface());
		
		t0.setName("Thread num_0");
		t1.setName("Thread num_1");
		
		System.out.println(t0.toString());
		System.out.println(t1.toString());
		
		System.out.println(t0.getName() +" : "+ t0.getState());
		System.out.println(t1.getName() +" : "+ t1.getState());
		
		t0.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t0.start();
		t1.start();
		
		System.out.println(t0.getName() +" : "+ t0.getState());
		System.out.println(t1.getName() +" : "+ t1.getState());
		
		t0.sleep(1000);
		t1.sleep(1000);
		
		System.out.println(t0.getName() +" : "+ t0.getState());
		System.out.println(t1.getName() +" : "+ t1.getState());
		
		t0.join();
		t1.join();

		System.out.println(t0.getName() +" : "+ t0.getState());
		System.out.println(t1.getName() +" : "+ t1.getState());	
	}
}
