package com.example.a105219056_uts_yogiyo;

public class KatalogRestoran {

    private int resId;
    private String filename;
    private double ratingResto;
    private String waktuResto;
    private String jarakResto;
    private String biayaKirimResto;
    private String ringkasanMenuResto;
    private int jumlahRatingResto;

    public KatalogRestoran(int _resId, String _filename, double _ratingResto, String _waktuResto,
                           String _jarakResto, String _biayaKirimResto, String _ringkasanMenuResto, int _jumlahRatingResto){
        resId = _resId;
        filename = _filename;
        ratingResto = _ratingResto;
        waktuResto = _waktuResto;
        jarakResto = _jarakResto;
        biayaKirimResto = _biayaKirimResto;
        ringkasanMenuResto = _ringkasanMenuResto;
        jumlahRatingResto = _jumlahRatingResto;
    }
    public int getResID() {
        return resId;
    }

    public void setResID(int resId) {
        this.resId = resId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public double getRatingResto() { return ratingResto; }

    public void setRatingResto(double ratingResto) { this.ratingResto = ratingResto; }

    public String getWaktuResto() { return waktuResto; }

    public void setWaktuResto(String waktuResto) { this.waktuResto = waktuResto;}

    public String getJarakResto() { return jarakResto;}

    public void setJarakResto(String jarakResto) { this.jarakResto = jarakResto;}

    public String getBiayaKirimResto() { return biayaKirimResto;}

    public void setBiayaKirimResto(String biayaKirimResto) { this.biayaKirimResto = biayaKirimResto;}

    public String getRingkasanMenuResto() { return ringkasanMenuResto;}

    public void setRingkasanMenuResto(String ringkasanMenuResto) { this.ringkasanMenuResto = ringkasanMenuResto;}

    public int getJumlahRatingResto() { return jumlahRatingResto;}

    public void setJumlahRatingResto(int jumlahRatingResto) { this.jumlahRatingResto = jumlahRatingResto;}
}
