import java.util.Scanner;
public class password_checker
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a valid password");
        String password=sc.nextLine();
        int strength=0;
        boolean hasupper=false;
        boolean haslower=false;
        boolean hasdigits=false;
        boolean hascharacter=false;

        if(password.length()>=8)
        {
            strength++;

        }
        for(int i=0;i<password.length();i++)
        {
            char ch=password.charAt(i);

            if(Character.isUpperCase(ch))
            {
                hasupper=true;
            }
            if(Character.isLowerCase(ch))
            {
                haslower=true;
            }
            if(Character.isDigit(ch))
            {
                hasdigits=true;
            }
            else hascharacter=true;
        }
        if (hasupper) strength++;
        if (haslower) strength++;
        if (hasdigits) strength++;
        if (hascharacter) strength++;

        System.out.println("\n--- PASSWORD REPORT ---");

        if (strength <= 2) {
            System.out.println("Weak Password ❌");
        } 
        else if (strength == 3 || strength == 4) {
            System.out.println("Medium Password ⚠️");
        } 
        else {
            System.out.println("Strong Password ✅");
        }

        System.out.println("strength: " + strength + "/5");

        sc.close();
    }
}
 