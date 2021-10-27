package Soal1;

public class Aplikasi {
    private int noTransaksi;
    private String noResi;
    private String namaEkspedisi;
    private double ongkosKirim;
    private String namaPengirim;
    private String alamatPengirim;
    private String namaPenerima;
    private String alamatPenerima;
    private double nominalAsuransi = 40000.0;


    public Aplikasi(int noTransaksi, String noResi, String namaEkspedisi, double ongkosKirim,
                    String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima,
                    double nominalAsuransi) {
            this.noTransaksi = noTransaksi;
            this.noResi = noResi;
            this.namaEkspedisi = namaEkspedisi;
            this.ongkosKirim = ongkosKirim;
            this.namaPengirim = namaPengirim;
            this.alamatPengirim = alamatPengirim;
            this.namaPenerima = namaPenerima;
            this.alamatPenerima = alamatPenerima;
            this.nominalAsuransi = nominalAsuransi;
        }

    public Aplikasi(int noTransaksi, String noResi, String namaEkspedisi, double ongkosKirim,
                    String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
    }

        public int getNoTransaksi(){return this.noTransaksi;}
        public String getNoResi() {
            return this.noResi;
        }
        public String getNamaEkspedisi() {
            return this.namaEkspedisi;
        }
        public double getOngkosKirim() {return this.ongkosKirim;}
        public String getNamaPengirim() {
        return this.namaPengirim;
    }
        public String getAlamatPengirim() {
        return this.alamatPengirim;
    }
        public String getNamaPenerima() {
        return this.namaPenerima;
    }
        public String getAlamatPenerima() {
        return this.alamatPenerima;
    }
        public double getNominalAsuransi() { return this.nominalAsuransi; }
}


