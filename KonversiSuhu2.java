jetbrains://idea/navigate/reference?project=TUGAS 4&fqn=Konversi_Suhu_Gagas3f.KonversiSuhu2
C:\Users\USER\IdeaProjects\TUGAS 4\src\Konversi_Suhu_Gagas3f\KonversiSuhu2.java

  package Konversi_Suhu_Gagas3f;

public class KonversiSuhu2 extends KonversiSuhu {
    public int fahrenheitToReamur(int fahrenheit) {
        int suhuCelcius = (fahrenheit - 32) * 5 / 9;
        return suhuCelcius * 4/5;
    };

}
