package types.nesne_referans;

public class main {
    public static void main(String[] args) {

        //Bu main class icersinide stack ve heap yapılarından bahsedilmiştir
        /**
         * Javada nesnelere sadece referanslarıyla erişilebiliriz
         * Referanslar , nesnelere souy erişim mekanızmasıdır
         * Bir nesnenin birden fazla referansı olabilir
         * Bir referans farklı zamanlarda aynı tipten nesneyi gösterebilir
         *
         * Car car1 = new Car()
         * Car car2 = new Car()
         *
         * referansta aynı zamanda değiken
         * referans degişkenler complex variable(karmaşık tip) denir classlardan olustururuz
         *
         *
         * */

        ///Soru 1
        //  i=15 ne olur
    int i=5;
    int j=i;
    i=7;
    System.out.println(i);
    // sonuc :7 cıkar
        // burdaki sebep ilkel değikenlerin sabite degeri olur
        //ilkel deişkenlere degere sahip olur onları göstermez
        // referans değiskenlerin degerinin gösterdikleri nesne (gercek nesnenin adresi ) olur
        //referanslar adresi gösterir ve adres ataması yapılır

      String s1 = new String("a");
      String s2 = new String("b");
      String tmp=s1;  // tmp ->"a"   // s1 in gösterdigi nesneyi göster yani memory adresini göster sahip olmaz gösterir
      s1=s2;   //s1 ->b
      s2=tmp; // s2 ->a

        System.out.println("s1"+s1);
        System.out.println("s2-"+s2);

        // primitivelerin degerleri var degere sahip olur
        // referansların nesneleri vardır  adresi gösterir

        //null
        /*
        *Bir referans herhangi bir nesneyi göstermek zorunda degildir
        * bur durumda null dır
        * ilkel degişkenlere null atanamaz
        * */
        //Referansı olmayan nesneye kayıp nesne denir
        /// kayıp nesneler bellek sızıntısı (memory leak) olusturmaması için çöp toplayıcı garbace collector tarafından toplanır








    }
}
