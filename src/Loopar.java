import java.util.Scanner;

public class Loopar {

	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	int summa = 0	;
		
	for (int i = 0; i < 100; i +=1) {
		summa = summa + i;
		
		System.out.println(summa);
	}
}
}
