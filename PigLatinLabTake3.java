import java.util.Scanner;

public class PigLatinLabTake3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);
		
		String choice = "yes";
		
		while (choice.equalsIgnoreCase("yes"))
		{
			choice = translateWord(scan1, choice);
		}
		
	}

	public static String translateWord(Scanner scan1, String choice) {
		String userInputWord = "";
		char z = 0;
		
		
System.out.println("Please enter a word to be translated");
userInputWord = scan1.nextLine();
String lowerCaseUserWord = userInputWord.toLowerCase();
z = lowerCaseUserWord.charAt(0);
		

		if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u')
			
		{
			System.out.println(lowerCaseUserWord + "way");
			
		}
		
		else {
			int length = lowerCaseUserWord.length() -1;
			for (int i = 0; i<=length; i++) 
			{
				z =lowerCaseUserWord.charAt(i);
				
				if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u')
				{
					int firstVowelPosition = lowerCaseUserWord.indexOf(z); 
					String substring1 = lowerCaseUserWord.substring(0, firstVowelPosition);
					String substring2 = lowerCaseUserWord.substring(firstVowelPosition);
					
					System.out.println(substring2 + substring1 + "ay");
					break;
				}
			
			}
				
				
			
		}
		
		
		
		System.out.println("Continue?");
		choice = scan1.nextLine();
		return choice;
	}
	
	
		
	}


