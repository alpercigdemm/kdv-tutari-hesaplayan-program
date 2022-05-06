# Kdv Tutarı Hesaplayan Program

*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
*(Not : KDV tutarını 18% olarak alın)

* KDV'siz Fiyat = 10;

* KDV'li Fiyat = 11.8;

* KDV tutarı = 1.8;

## Ödev 

* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

**Cevap**

```
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


```
www.patika.dev
