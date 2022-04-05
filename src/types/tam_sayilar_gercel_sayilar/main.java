package types.tam_sayilar_gercel_sayilar;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {

        //Tam sayi tiplerinde varsılan tip 'int'dir
        /**
         *  int yerine byte yada sort kullanmayın
         *  kullanıldıgı durumda int degerine en düsük int seviyesine cekilir bos kalan yerler 0 ile doldurulur
         *
         *
         * */

        /**
         * Gerçek sayılarda varsayılan tip doubledir
         * double olarak belirtmek istersek sayı ssouna d yazılır
         * float oalrak belirmek istersek f yazılır
         *virgülden sonra 20 yada 30 hane gibi yapılarıda görmek isterseniz bigdecimla kullanmak mantıklı
         * virgülden sonra 3 yada 4 hane gidicekseniz double yeterlidir
         *
         * */


        float pi = 3.14f;
        float e =2.71828f;
        double daire =1.22;
        double daire2 =123.0d;
        double lenght =10.0d;
        double alan =343.34d;

      // asagıda yazılan e üstel ifadeyi temsil eder sadece double ve floatta geçerlidir
        double sayi =1.6e-19;
        System.out.println(sayi);

        // yüksek sayilari daha rahat okuma için alttan cizgi ile yazılabilir
        //Not----> altta ciziyi(_) basta ve sonda kullanma
        int d =10_000_00000;
        double dd=34434_3434.0565_343;




                //uzunluk(bit cinsinden)         alt sınır                             üst sınır
        //byte     8                             -128                                   127
        //short    16                            -32.768                                +32.767
        //int      32                            -2.147.483.648                         +2.147.483.648
        //long     64                            9,223,372,036,854,775,807              9,223,372,036,854,775,807




        /** @param i  i bir degişkendir 5 degeri atanmıstır*/
        int i=5;
        /** @param i  l bir degişkendir 47 degeri atanmıstır tipi longdur  */
        long l =47;
        long ll=47l;




    }
}
