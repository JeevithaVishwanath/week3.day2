package week3.day2;

public class Desktop extends Computer{

	public void desktopsize() {
		
		System.out.println("desktop");
	}
	
	public static void main(String[] args) {
		
		Desktop system=new Desktop();
		system.computermodel();
		system.desktopsize();
	}
}
