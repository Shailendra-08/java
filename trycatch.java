import java.util.Scanner;

class Negative extends Exception{
    public Negative(String msg){
        super(msg);
    }

}

public class trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number -->");
        n = sc.nextInt();
        try{
            if (n < 0) {
                throw new Negative("Negative exception");
            }
        }catch(Negative e){
            System.out.println(e);
        }
    }
}
