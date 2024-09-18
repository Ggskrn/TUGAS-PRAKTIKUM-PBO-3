jetbrains://idea/navigate/reference?project=TUGAS 4&fqn=Konversi_Suhu_Gagas3f.DemoKonversiSuhu
C:\Users\USER\IdeaProjects\TUGAS 4\src\Konversi_Suhu_Gagas3f\DemoKonversiSuhu.java

  package Konversi_Suhu_Gagas3f;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu ks = new KonversiSuhu2();
        ks.setSuhuCelcius(30);
        System.out.println("Dalam Fahrenheit : " + ks.getSuhuCelcius());
        System.out.println("Dalam Reamur : " + ks.getSuhuCelcius());
        int fahrenheit = 25;
        System.out.println("Dalam Reamur : " + ks.getSuhuCelcius() );
    }
}
