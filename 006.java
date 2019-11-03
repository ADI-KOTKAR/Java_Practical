import java.util.*;

class Main
{
	
		
	
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter String: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		int vowels=0,consonants=0,digits=0,spaces=0;
        for(int i = 0; i < s.length(); ++i)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
    }
	
		
	
}