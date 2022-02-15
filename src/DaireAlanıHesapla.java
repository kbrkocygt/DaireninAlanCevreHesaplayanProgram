import java.util.Scanner;

public class DaireAlanıHesapla {
    public static void main(String[] args) {
        /*Kübra Koçyiğit */
        Scanner inp = new Scanner(System.in);

        int  r , merkezAci;
        double pi = 3.14;

        System.out.print("Yarıçapı Giriniz : ");
        r = inp.nextInt();

        System.out.print("Merkez Açıyı Giriniz : ");
        merkezAci = inp.nextInt();

        double alan  = (pi * (r*r) * merkezAci) / 360 ;
        System.out.print("Alan : " + alan);
    }
}
