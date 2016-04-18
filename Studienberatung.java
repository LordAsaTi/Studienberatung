import java.util.*;

public class Studienberatung{
	
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String antwort = scanner.next();
		
		if(antwort.equals("ja")){
			System.out.println("Bist du wissbegierdig?")
			String antwort2 = scanner.next();
		}
		else if(antwort.equals("nein")){
			System.out.println("Hast du Fachabitur?");
			String antwort2 = scanner.next();
			if(antwort2.equals("ja")){
				System.out.println("Hast du eine Berufsausbildung?")
				antwort3 = scanner.next();
			}
		}
	}
}