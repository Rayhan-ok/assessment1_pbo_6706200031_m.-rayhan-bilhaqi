package Soal2;

public class Mobil {
    private String merk, tahunKeluaran;
    private double harga;
    private int stok;

    public Mobil(String merk, String tahunKeluaran, double harga, int stok){
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    String getMerk(){
        return merk;
    }
    String getTahunKeluaran(){
        return tahunKeluaran;
    }

    double getHarga(){
        return harga;
    }

    int getStok(){
        return stok;
    }
    public void setStok(int stok){
        this.stok = stok;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public void displayInfo(){
        getMerk();
        getHarga();
        getTahunKeluaran();
        getStok();
    }

}
