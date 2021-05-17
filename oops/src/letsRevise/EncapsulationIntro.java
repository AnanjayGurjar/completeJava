package letsRevise;
import java.util.Scanner;

public class EncapsulationIntro {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.setPrize(96);
		System.out.println(l1.getPrize());
		

	}

}

class Laptop{
	
	int ram;
	private int prize;
	
	public int getPrize() {
		return prize;
	}
	
	
	public void setPrize(int prize) {
		System.out.println("Enter the password here : ");
		Scanner sc = new Scanner(System.in);
		int password = sc.nextInt();
		
		if(password == 123) {
		this.prize = prize;
		
		System.out.println("Prize has been set to " + prize);
		}
		else {
			System.out.println("You cannot set the prize");
		}
	}
	
	
	
}
