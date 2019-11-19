package ConceptMultithread;

class Printer {
	 public static void print(String arg[])

	{
		for (int i = 0; i < arg.length; i++) {

			System.out.println(arg[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
}

class Example1 extends Thread {
	String a[] = { "John", "Jerry", "Tom" };

	public void run() {
		System.out.println("Thread Name "+Thread.currentThread().getName());
		Printer.print(a);
	}
}

class Example2 extends Thread {
	
	String a[] = { "Peter", "Rose", "Edward" };

	public void run() {
		System.out.println("Thread Name "+Thread.currentThread().getName());
		Printer.print(a);
	}
}

public class SynchronizationExample {
	public static void main(String arg[]) throws InterruptedException {

		Example1 example1 = new Example1();
		Example2 example2 = new Example2();
		example1.start();
		example2.start();
	}
}
