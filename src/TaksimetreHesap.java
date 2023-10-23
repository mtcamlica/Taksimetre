import java.util.Scanner;

public class TaksimetreHesap {
    public static void main(String[] args) {
        int km;
        int taksiAcilis = 10;
        int minTaksiTutar = 20;
        double kmBasi = 2.20;
        double toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gidilecek mesafe bilgisini girin (örn: 3 km): ");
        km = input.nextInt();

        if (km < 5)
            toplamTutar = minTaksiTutar;
        else
            toplamTutar = (km * kmBasi) + taksiAcilis;

        System.out.print("Taksimetre Ücreti: " + toplamTutar);
    }
}
