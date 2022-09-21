import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double phi = 3.14;

        System.out.println();
        System.out.print("Masukkan jari-jari lingkaran (cm) = ");
        int r = scan.nextInt(); // r = jari-jari
        System.out.println();

        App obj = new App();
        System.out.println(obj.keliling(r, phi));
        System.out.println(obj.luas(r, phi));
    }

    public static double keliling(double r, double phi) {
        double hasil = 2 * phi * r;
        return hasil;
    }

    public static double luas(double r, double phi) {
        double hasil = phi * r * r;
        return hasil;
    }

}
