import java.util.*;;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		System.out.println("Enter  a multiple");
		int multiple = sc.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.println(i + " * " + multiple + " = " + i*multiple);
		}
	}

}
