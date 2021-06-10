/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class MethodVoidMain {

    String jenis;
    String nama;

    public static void main(String[] args) {

        MethodVoidMain Bahan = new MethodVoidMain();
        System.out.println("Sayur");
        Bahan.Sayur();
        System.out.println("Buah");
        Bahan.Buah();
    }

    void Sayur() {
        nama = "Sayur";
        jenis = "Sawi, wortel, brokoli, bayam";
        System.out.println("Disini kami menjual berbagai " + nama);
        System.out.println(nama + " yang kami jual antara lain adalah = " + jenis);
    }

    void Buah() {
        nama = "Buah";
        jenis = "Mangga, Apel, Semangka, Melon";
        System.out.println("Disini kami menjual berbagai " + nama);
        System.out.println(nama + " yang kami jual antara lain adalah = " + jenis);
    }

}
