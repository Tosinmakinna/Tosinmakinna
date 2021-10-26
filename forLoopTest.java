import java.util.Scanner;
public class forLoopTest {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Are you my master? Type 1 for yes or 2 for no.");
	int a = sc.nextInt();
		if(a==1){
			for(int i = 0; i<3; i++){
				System.out.println("Welcome Master.");
			}
			for(int j = 0; j<25; j++){
				System.out.println("Forgive me Master. I have failed you.");
			}
		}else{
			System.out.println("Umm then gtf. Rude.");
		}
	}
}