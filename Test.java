import java.io.Console;
import java.util.Scanner;




public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz:");
        int yil = input.nextInt();
        int sonuc = yil%12;
        switch(sonuc) {
            case 0:
                System.out.print("Çin Zodyağı Burcunuz:" + "Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz:" + "Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz:" + "Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz:" + "Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz:" + "Fare");
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz:" + "Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz:" + "Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz:" + "Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz:"+"Ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz:"+"Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz:"+"At");
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz:"+"Koyun");
                break;
        }
    }
}




