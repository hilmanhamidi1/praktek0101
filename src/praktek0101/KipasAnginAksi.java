/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek0101;

/**
 *
 * @author GMR
 */
public class KipasAnginAksi {
    public static void main(String[] args) {
        
    KipasAngin A = new KipasAngin();
    KipasAngin B = new KipasAngin();
    KipasAngin C = new KipasAngin();

    A.Ukuran    ="Besar";
    A.Kecepatan ="Cepat";
    A.Harga     ="1.000.000";
    A.Warna     ="Hitam";
    A.Merk      ="Maspion";

    B.Ukuran    ="Sedang";
    B.Kecepatan ="Sedang";
    B.Harga     ="500.000";
    B.Warna     ="Putih";
    B.Merk      ="GMC";
    
    C.Ukuran    ="Kecil";
    C.Kecepatan ="Lambat";
    C.Harga     ="150.000";
    C.Warna     ="Kuning";
    C.Merk      ="Miyako";
    
    A.tampildata();
    B.tampildata();
    C.tampildata();
    }

    }
  
}
