jetbrains://idea/navigate/reference?project=TUGAS 4&fqn=Konversi_Suhu_Gagas3f.KonversiSuhu
C:\Users\USER\IdeaProjects\TUGAS 4\src\Konversi_Suhu_Gagas3f\KonversiSuhu.java

  package Konversi_Suhu_Gagas3f;

public class KonversiSuhu {
    private int suhuCelcius;

    public void setSuhuCelcius(int suhuCelcius) {
        this.suhuCelcius = suhuCelcius;
    }
    public int getSuhuCelcius() {
        return suhuCelcius;
    }
    public int celciusToFahrenheit() {
        return (suhuCelcius * 9/5) + 32;
    }
    public int celciusToReamur() {
        return suhuCelcius *4/5;
    }
}
