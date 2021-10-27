package Soal1;

public class Main {
    public static void main(String[] args) {
        Aplikasi a1 = new Aplikasi(1, "N0001", "JNE", 21000.0,
                "Dropship1", "Surabaya", "Bejo", "DayeuhKolot",
                40000.0);
        System.out.println("Asuransi dan Dropship");
        System.out.println("No Transaksi :" + a1.getNoTransaksi());
        System.out.println("No Resi :" +a1.getNoResi());
        System.out.println("Nama Ekspedisi :"+ a1.getNamaEkspedisi());
        System.out.println("Ongkos Kirim :"+a1.getOngkosKirim());
        System.out.println("Nama Pengirim :"+a1.getNamaPengirim());
        System.out.println("Alamat Pengirim :"+a1.getAlamatPengirim());
        System.out.println("Nama Penerima :"+a1.getNamaPenerima());
        System.out.println("Alamat Penerima :"+a1.getAlamatPenerima());
        System.out.println("Nominal Asuransi :"+a1.getNominalAsuransi());

        System.out.println();
        Aplikasi a2 = new Aplikasi(2, "N0003", "J&T", 16000.0,
                "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot",
                40000.0);
        System.out.println("Asuransi");
        System.out.println("No Transaksi :" + a2.getNoTransaksi());
        System.out.println("No Resi :" +a2.getNoResi());
        System.out.println("Nama Ekspedisi :"+ a2.getNamaEkspedisi());
        System.out.println("Ongkos Kirim :"+a2.getOngkosKirim());
        System.out.println("Nama Pengirim :"+a2.getNamaPengirim());
        System.out.println("Alamat Pengirim :"+a2.getAlamatPengirim());
        System.out.println("Nama Penerima :"+a2.getNamaPenerima());
        System.out.println("Alamat Penerima :"+a2.getAlamatPenerima());
        System.out.println("Nominal Asuransi :"+a2.getNominalAsuransi());

        System.out.println();
        Aplikasi a3 = new Aplikasi(3, "N0004", "Pos Indonesia", 23000.0,
                "Eiger", "Bandung Kopo", "Bambang", "DayeuhKolot");
        System.out.println("Normal");
        System.out.println("No Transaksi :" + a3.getNoTransaksi());
        System.out.println("No Resi :" +a3.getNoResi());
        System.out.println("Nama Ekspedisi :"+ a3.getNamaEkspedisi());
        System.out.println("Ongkos Kirim :"+a3.getOngkosKirim());
        System.out.println("Nama Pengirim :"+a3.getNamaPengirim());
        System.out.println("Alamat Pengirim :"+a3.getAlamatPengirim());
        System.out.println("Nama Penerima :"+a3.getNamaPenerima());
        System.out.println("Alamat Penerima :"+a3.getAlamatPenerima());

        System.out.println();
        Aplikasi a4 = new Aplikasi(1, "N0002", "siCepat", 24000.0,
                "Dropship2", "Pontianak", "Joko", "DayeuhKolot");
        System.out.println("Dropship");
        System.out.println("No Transaksi :" + a4.getNoTransaksi());
        System.out.println("No Resi :" +a4.getNoResi());
        System.out.println("Nama Ekspedisi :"+ a4.getNamaEkspedisi());
        System.out.println("Ongkos Kirim :"+a4.getOngkosKirim());
        System.out.println("Nama Pengirim :"+a4.getNamaPengirim());
        System.out.println("Alamat Pengirim :"+a4.getAlamatPengirim());
        System.out.println("Nama Penerima :"+a4.getNamaPenerima());
        System.out.println("Alamat Penerima :"+a4.getAlamatPenerima());
    }
}
