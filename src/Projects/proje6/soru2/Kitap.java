package Projects.proje6.soru2;

class Kitap {
    private static int idSayac = 1;
    private int id;
    private String kitapAdi;
    private String yazarAdi;
    private int yayinYili;
    private double fiyat;

    public Kitap(String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinYili = yayinYili;
        this.fiyat = fiyat;
        this.id = idSayac;
        System.out.println("Kitap IDniz: " + idSayac);
        idSayac++;
    }

    public int getId() {
        return id;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (fiyat < 0) {
            throw new IllegalArgumentException("Fiyat negatif olamaz: " + fiyat);
        }
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Kitap [ID=" + id + ", Ad=" + kitapAdi + ", Yazar=" + yazarAdi + ", Yıl=" + yayinYili + ", Fiyat=" + fiyat + " TL]";
    }
}
