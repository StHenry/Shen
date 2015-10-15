package Day29;

class MyRunnable1 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.print("@");
		}
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.print("&");
		}
	}
}

public class exp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable1 mr1 = new MyRunnable1();
		MyRunnable2 mr2 = new MyRunnable2();
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		t1.start();
		t2.start();
	}

}
