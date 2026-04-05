package Projects.Proje4.ProjeSoru3;

public enum EkUcret {
    KATEGORI_1(0.10), KATEGORI_2(0.20), KATEGORI_3(0.30);

    private final double birimFiyat;

    EkUcret(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }
}