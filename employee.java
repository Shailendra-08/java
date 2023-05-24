import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class employee {

    public static void main(String[] args) {

        int salary,tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        salary = sc.nextInt();


        if (salary > 50000 && salary<=60000) {
            tax = salary * 10 /100;
            salary = salary - tax;
            
        }else if(salary > 60000 && salary<=150000){
            tax = salary * 20 /100;
            salary = salary - tax;

        }else if(salary > 150000){
            tax = salary * 30 /100;
            salary = salary - tax;

        }else{
            System.out.println("bhok me ja");
        }

        System.out.println(salary);
        
    }
}
