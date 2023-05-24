package practical;
import java.util.Scanner;

import javafx.scene.paint.Stop;

public class Date {

    int day;
    int month;
    int year;

    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isvalidmonth(){
        return month>=1 && month <=12;
    }

    
    public void displayday(){
        int nextday = day + 1;
        int nextmonth = month;
        int nextyear = year;

        if(month == 2){
            if(nextday > 28){
                nextday = 1;
                nextmonth++;
            }
        }else{
            int[] dayinmonth ={31, 28 ,31 ,30 ,31 ,30,31,31,30,31,30,31};
            int maxday = dayinmonth[month - 1];

            if(nextday > maxday){
                nextday = 1;
                nextmonth++;

            }
        }

        if(month > 12){
            nextmonth=1;
            nextyear++;
        }

        System.out.println("Next Day:"+ nextday + "/" + nextmonth + "/ " + nextyear);
    }


    public static void main(String[] args) {
        int day=0,month=0,year=0;
        Scanner sc = new Scanner(System.in);
        day= sc.nextInt();
        month= sc.nextInt();
        year= sc.nextInt();
        Date d = new Date(day,month, year);
        // d.isvalidmonth();
        d.displayday();
    }
    
}
