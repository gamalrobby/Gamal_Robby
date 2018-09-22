/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan5.kambingglobal;

/**
 *
 * @author Destroy Eyes 
 * NAMA  : A Gamal Robby Abdulkarim 
 * KELAS : PBO2 
 * NIM   : 10117071
 * Deskripsi Program : Program ini berisi perintah menampilakan jumlah
 * kambing saat program pertama x berjalan dan hasil kambing setelah di tambah
 */
public class KambingGlobal {

//variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;

    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing : " + jumlahKambing);
    }

    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah: "
                + jumlahKambing);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        //Menampilkan Jumlah Kambiing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();

    }

}
