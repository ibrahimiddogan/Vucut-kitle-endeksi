import java.util.Scanner;
public class Vucut {
    public static void main(String[] args) {
        int kilo,kitleendeks;
        double boy;
        Scanner alici = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz: ");
        boy = alici.nextInt();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = alici.nextInt();
        kitleendeks= (int) (kilo/(boy*boy));
        System.out.println("Vücüt kitle endeksiniz " + kitleendeks);


    }
}
