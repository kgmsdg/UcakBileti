import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        double km, yas, kmFyt = 0.10, nTutar, yInd = 0, iTutar, gdInd, tTutar;
        int yTipi;

        Scanner inp = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 = Tek yön, 2 = Gidiş dönüş)  : ");
        yTipi = inp.nextInt();

        nTutar = km * kmFyt;

        if (yas < 12) {
            yInd = nTutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yInd = nTutar * 0.10;
        } else if (yas >= 65) {
            yInd = nTutar * 0.30;
        }
        iTutar = nTutar - yInd;

        switch (yTipi) {
            case 1:
                gdInd = iTutar * 0;
                tTutar = iTutar - gdInd;
                System.out.print("\nToplam tutar : " + df.format(tTutar) + "TL");
                break;
            case 2:
                gdInd = iTutar * 0.20;
                tTutar = iTutar - gdInd;
                tTutar = tTutar * 2;
                System.out.print("\nToplam tutar : " + df.format(tTutar) + "TL");
                break;

            default:
                System.out.println("\nHatalı veri girdiniz!");
                break;
        }
    }
}
