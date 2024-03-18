import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri Tanımla
        int mat, fizik, kimya, turkce, tarih, muzik ;
        //kullanıcıdan değerleri almak için scanner sınıfı tanımlandı
        Scanner input = new Scanner(System.in) ;
        // kullanıcıdan verileri alma komutları
        System.out.print ("Matematik Notunuzu Giriniz   : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz       : ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz       : ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz      : ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz       : ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz       : ");
        muzik = input.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik ;
        double ortalama = toplam / 6 ;
        System.out.println("Genel Not Ortalamanız : " + ortalama);
        //Genel not ortalaması 60 veya 60 tan büyük ise geçti değilse kaldı
        boolean sonuc = ortalama >= 60 ;
        String str = sonuc ? "GEÇTİ" : "KALDI";
        System.out.print(str);

    }
}
