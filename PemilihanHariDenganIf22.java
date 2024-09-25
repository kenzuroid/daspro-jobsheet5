import java.util.Scanner;

public class PemilihanHariDenganIf22{
 public static  void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int dayName;
    String dayType;

    System.out.println("Masukkan sebuah angka sesuai urutan hari: ");
    dayName = sc.nextInt();

    if (dayName >= 1 && dayName <=5) {
        dayType = "weekday";
    } else if (dayName == 6 || dayName == 7) {
        dayType = "weekend";
    } else {
        dayType = "invalid Number";
    }
    System.err.println(dayName + " is a " + dayType);
    }
 }
