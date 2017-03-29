package Exceptionhandling;

public class ThrowsEx {
	void mro() throws InterruptedException{
		System.out.println("sleeping mode");
		Thread.sleep(3000);
		System.out.println("sleeping mode");

	}
void mandalofficer() throws InterruptedException{
	mro();
}
void eseva() throws InterruptedException{
	mandalofficer();
}
//In mainmethod exception rises,JVM handles the exception
	public static void main(String[] args) throws InterruptedException {
ThrowsEx t = new ThrowsEx();
t.eseva();
}
}
