import java.util.Scanner;

public class Main {
public static void main(String args[] ){
	int a;
	int b;
	String operation;
	int answer;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome to the calculator");
	System.out.println("Enter the first Number : ");
	a=scanner.nextInt();
	System.out.println("Enter the second Number : ");
	b=scanner.nextInt();
	System.out.println("Enter the Operation : ");
	operation=scanner.next();
	if ("+".equals(operation)){
		answer=a+b;
		System.out.println("Answer is "+answer);
	}
	else{
		System.out.println("Unsupported Format");
	}
	
	
}

}
private static int add( int a, int b) {
return a + b;
}
}
