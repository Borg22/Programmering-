import java.util.Scanner;

public class tjena {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in 10 heltal:");
		
		
		
		//Läs in tal 1
		int tal1 = input.nextInt() ;
		//Läs in tal 2
		int tal2 = input.nextInt() ;
		//Läs in tal 3
		int tal3 = input.nextInt() ;
		//Läs in tal 4
		int tal4 = input.nextInt() ;
		//Läs in tal 5
		int tal5 = input.nextInt() ;
		//Läs in tal 6
		int tal6 = input.nextInt() ;
		//Läs in tal 7
		int tal7 = input.nextInt() ;
		//Läs in tal 8
		int tal8 = input.nextInt() ;
		//Läs in tal 9
		int tal9 = input.nextInt() ;
		//Läs in tal 10
		int tal10 = input.nextInt() ;
		
		
		
		int summa = tal1 + tal2 + tal3 + tal4 + tal5 + tal6 +tal7 + tal8 + tal9 + tal10 ;
		
		double medel = summa / 10.0;  // 10
		
		int stor = tal1; // 1
		
		if (stor <= tal2) { // 2
			stor = tal2;
		}
		if (stor <= tal3) { // 3
			stor = tal3;
		}
		
		if (stor <= tal4) { // 4
			stor = tal4;
		}
		
		if (stor <= tal5) { // 5
			stor = tal5;
		}
		
		if (stor <= tal6) { // 6
			stor = tal6;
		}
		
		if (stor <= tal7) { // 7
			stor = tal7;
		}
		
		if (stor <= tal8) { // 8
			stor = tal8;
		}
		
		if (stor <= tal9) { // 9
			stor = tal9;
		}
		if (stor <= tal10) { // 10
			stor = tal10;
			
		}
			

	
		
		//System.out.println("Minsta" + minst);
		System.out.println("Medel: " + medel);
		System.out.println("Största: " + stor);
		
		
		
		
	}
}
