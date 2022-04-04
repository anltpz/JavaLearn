package types.veri_degisken_tip;

public class main {
    public static void main(String[] args) {

        // Değiskenler degerlere atanır
        //Bu değerler üzerinden işlemler yapılır
        // veriler işlemcilerde işlenir ve yeni degerler üretilir

        // Tip Nedir ?
        //
        // Bir değişkenin alabilecegi degerler kümesine tip denir
        //Tipler degerler kümesinin tabiatına uygun kurallara sahiptirler
        //

        // tipler 2 ye ayrılır
         //  1-İlkel tipler
         // 2- Karmaşık tipler

        // İlkel tipler
        // tek degerden olusur
        //metotları yoktur
        // int  a=5 metodu yoktur asagıdaki car örneginde Car sınıfının sorumlulukları vardır
        // atomictir parcalayamayız

            // ilkel tip sıralması
        // byte, short , int long , float , double ,char , boolean
        // sadece boolean mantıksal bir tip geri kalanlar sayısaldır
        // char dısında diger bütün 6 sayısal tip de işaretlidir
        // pozitif ve negatif deger alabilir
        //char karakter tipidir ve her karakterin sıfır yada pozitif tam sayı degeri vardır

        // 6 sayısal tipin 4'ü tam sayı 2 si gerçek sayıdır
        //Tam sayılar
        // 1-byte ,
        // 2-short ,
        // 3-int
        // 4-long

        //gercek sayılar
        // 1-float
        // 2-double

        //Complex tip
        // parcaları vardır
        // ilkel ve bileşik tipten olusur
        //class enum ve interface anahtar kelimeleri ile olusturulabilir


        System.out.println("Hello World!");

        //boolean
        boolean flag =false;
        boolean isClosed=true;
        boolean isCreated;

        //char karakter tipi
        //Negatif deger almaz
        //0-- 65,535 aralıgında
        // unicode karakter setini kullanır
        // karakterlerin sayısal tipi vardır

        // 'a'  => 97
        // 'A'  => 65
        // '9'  => 57
        // ' '  => 32
        char firsLetter ='b';
        char c;


    }

}
class Car
{
    public String make;  // sınıf tipidir  --> String, public final class String tipinin nesnesidir
    public String model; //sınıf tipidir
    public String year; // sınıf tipidir
    public int speed;  // ilkel tip
    public int distance ; // ilkel tip

    //Metotları olabilir

    public void stop()
    {
        speed=0;
    }

}
