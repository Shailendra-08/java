import java.util.Scanner;

public class loweupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String-->");
        String input = sc.nextLine();

        int uppercase = 0;
        int loweupper = 0;


        for(char c: input.toCharArray()){
            if(Character.isUpperCase(c)){
                uppercase++;
            }else if(Character.isLowerCase(c)){
                loweupper++;
            }
            }
            System.out.println(uppercase);
            System.out.println(loweupper);


        }
        
    }

    

