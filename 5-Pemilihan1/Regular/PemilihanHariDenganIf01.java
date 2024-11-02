import java.util.Scanner;

public class PemilihanHariDenganIf01 {
    public static void main(String[] args) {
        //deklarasi
        Scanner sc = new Scanner(System.in);
        int dayName;
        String dayType;
        //input
        System.out.print("Input number: ");
        dayName = sc.nextInt();
        //eksekusi
        if (dayName>=1 && dayName<=5) {
            dayType = "weekday";
        }
        else if (dayName >= 6 && dayName <= 7) {
            dayType = "weekend";
        }
        else {
            dayType = "invalid number";
        }
        //ouput
        System.out.println(dayName + " is a " + dayType);

        // switch (dayName) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         dayType = "weekday";
        //         break;
        //     case 6:
        //     case 7:
        //         dayType = "weekend";
        //         break;
        //     default:
        //         dayType = "invalid number";
        // }
        
        
    }
}
