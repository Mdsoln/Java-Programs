import java.util.Scanner;

class MilitaryTime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Time in 12hours(Eg 1:34 PM) to be converted to 24hours");
        String time = scanner.nextLine();

        String[] givenTime = time.split(" ");
        String actualTime = givenTime[0];
        String indicator = givenTime[1];

        String[] userTime = actualTime.split(":");
        int hours = Integer.parseInt(userTime[0]);
        int minutes = Integer.parseInt(userTime[1]);

        if (indicator.equalsIgnoreCase("PM") && hours != 12){
            hours += 12;
        } else if (indicator.equalsIgnoreCase("AM") && hours == 12) {
            hours += 0;
        }

        String times = String.format("%02d:%02d",hours,minutes);

        System.out.println(times);
    }
}