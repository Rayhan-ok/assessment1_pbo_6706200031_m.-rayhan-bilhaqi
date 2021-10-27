package Soal2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowroomJaya {
    private ArrayList<Mobil> arrMobil;

    public static void main(String[] args) {
        Mobil a1 = new Mobil("Avanza","2018",150000000.0,1);
        a1.setHarga(150000000.0);
        a1.setStok(1);

        System.out.println(a1.getMerk() +" "+ a1.getTahunKeluaran());

    }


    ArrayList<Mobil> getArrMobil(){
        return arrMobil;
    }

}
