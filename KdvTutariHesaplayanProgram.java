import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ucret Tutarinizi Giriniz: ");
        tutar = inp.nextDouble();

        kdvTutar =tutar*kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Orani: " + kdvOran);
        System.out.println("KDV Tutari: " + kdvTutar);
        System.out.println("KDV'li Tutari: " + kdvliTutar);


        String sonuc = (tutar <= 1000) ? String.valueOf((kdvliTutar)) : String.valueOf(tutar+(tutar * 0.8));
        System.out.println(sonuc);
    }
}
