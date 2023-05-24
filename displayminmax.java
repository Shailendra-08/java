// import java.util.Scanner;

// public class displayminmax {
//     public static void main(String[] args) {
//         int a,b;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number 1 -->");
//         a= sc.nextInt();

//         System.out.println("Enter number 2 -->");
//         b= sc.nextInt();

//         if(a>b){
//             System.out.println("Number 1 is Max-->"+ a);
//             System.out.println("Number 2 is min-->"+ b);

//         }else{
//             System.out.println("Number 2 is Max-->"+b);
//             System.out.println("Number 1 is min-->"+ a);
//         }
//     }
    
// }


// import java.util.Scanner;

// public class displayminmax {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the value of n
//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();

//         // Read n numbers
//         int[] numbers = new int[n];
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter number " + (i + 1) + ": ");
//             numbers[i] = scanner.nextInt();
//         }

//         // Find minimum and maximum
//         int minNum = numbers[0];
//         int maxNum = numbers[0];
//         for (int i = 1; i < n; i++) {
//             if (numbers[i] < minNum) {
//                 minNum = numbers[i];
//             }
//             if (numbers[i] > maxNum) {
//                 maxNum = numbers[i];
//             }
//         }

//         // Display the result
//         System.out.println("Minimum number: " + minNum);
//         System.out.println("Maximum number: " + maxNum);

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class displayminmax{
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int n;
        System.out.print("Enter the number of element in the array-->");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n != 0){
            int value=0;
            value =sc.nextInt();
            if (value < min) {
                min = value;        
            }
            if (value > max) {
                max = value;
            }

            n=n-1;

        }

        System.out.println("min-->"+min+" max-->"+ max);

    }
}