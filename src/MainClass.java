/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MainClass {
    public static void main(String[] args){
        BangunRuang[] daftarBangun = new BangunRuang[2];
        daftarBangun[0] = new Kubus(5.0);
        daftarBangun[1] = new Balok(10.0, 4.0, 6.0);
        
        System.out.println("=== Hasil Perhitungan Bangun Ruang (Polimorfisme) ===");
        
        for (BangunRuang bangun : daftarBangun){
            bangun.tampilkanNama();
            double volume = bangun.hitungVolume();
            double luasPermukaan = bangun.hitungLuasPermukaan();
            
            System.out.printf("Volume: %.2f\n", volume);
            System.out.printf("Luas Permukaan: %.2f\n", luasPermukaan);
            System.out.println("-------------------------------------------------");
        }
    }
}
