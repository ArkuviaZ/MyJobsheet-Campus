
import java.util.Scanner;

public class PemilihanHari01 {

    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;
        //input
        System.out.print("Input day name: ");
        dayName = sc.nextLine();
        //eksekusi
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday" :
            case "sunday" :
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }
        System.out.println(dayName + " is a " + dayType);
    }
}
