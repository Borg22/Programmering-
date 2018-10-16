 
public class steg3 {
	

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.println(volume(sc.nextDouble()));
        
        //System.out.println(reverse(sc.nextLine()));
        
        System.out.println(count(sc.nextLine(), sc.next().charAt(0)));
        
        //System.out.println(sjorovare(sc.nextLine()));
        


}
    public static double volume(double radius) {
        
        double volume = radius * radius * radius * 3.14 * 4 / 3;
        
        
        return volume;

	}
}
