package valiedLeapYear;

public class LeapYearSeeking {
    public int leapYearCal(int year){
        int x=0;
        if (year%4==0 && year%100!=0 ||year%400==0){
            System.out.println( year +"is a leap year");
            x=2;
        }else {
            System.out.println(year +"Not a leap year");
            x=4;
        }

        return x;
    }
}
