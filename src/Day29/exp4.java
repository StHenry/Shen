package Day29;

class XianCheng1 extends Thread{
	public void run(){
		System.out.print("通过继承Thread定义线程");
	}
}

class XianCheng2 implements Runnable{
	public void run(){
		System.out.print("通过实现Runnable定义线程");
	}
}

public class exp4{
	public static void main(String[] args){
		/*
		XianCheng1 x = new XianCheng1();
		x.run();
		*/
		
		XianCheng1 x = new XianCheng1();
		x.start();
		
		
		
		/*
		XianCheng2 x = new XianCheng2();
		Thread t = new Thread(x);
		t.start();
		*/
		
	}
	
}