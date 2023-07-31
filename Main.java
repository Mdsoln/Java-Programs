import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class DayOfTheWeek{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in a valid format");
        String userDate = scanner.nextLine();

        try {
            String day = getUserDate(userDate);
            System.out.println(day);
        }catch (ParseException exception){
            System.out.println("Invalid format of date given");
        }
    }
    public static String getUserDate(String userDate) throws ParseException{
        SimpleDateFormat simple = null;
        if (userDate.matches("\\d{2}/\\d{2}/\\d{4}")){
            simple = new SimpleDateFormat("MM/dd/yyy");
        } else if (userDate.matches("\\d{4}/\\d{2}/\\d{2}")) {
            simple = new SimpleDateFormat("yyy/MM/dd");
        } else if (userDate.matches("[A-Za-z]+ \\d{1,2}, \\d{4}")) {
             simple = new SimpleDateFormat("MMM dd, yyy");
        } else {
            throw new ParseException("Invalid format of the date given",0);
        }

        Date date = simple.parse(userDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        String[] daysOfTheWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int theDay = calendar.get(Calendar.DAY_OF_WEEK)-1;

        return daysOfTheWeek[theDay];
    }
}
