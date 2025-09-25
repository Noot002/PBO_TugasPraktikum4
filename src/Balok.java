/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Balok extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume(){
        return panjang * lebar * tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    @Override
    public void tampilkanNama(){
        System.out.println("Bangun Ruang: Balok");
        System.out.println("Panjang: " + panjang + ", lebar: " + lebar + ", tinggi: " + tinggi);
    }
}
