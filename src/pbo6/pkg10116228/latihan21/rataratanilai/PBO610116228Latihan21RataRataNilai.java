/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan21.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA : Gandy Christian Situmorang
 * KELAS: PBO-6
 * NIM  : 10116228
 * Deskripsi Program: Program ini berisi program yang menampilkan rata-rata
 * nilai mahasiswa
 */
public class PBO610116228Latihan21RataRataNilai {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nBanyak, jml, nilai[];
        float rata, jumlah = 0;

        System.out.print("Masukan Jumlah Mahasiswa : ");
        nBanyak = input.nextInt();

        nilai = new int[nBanyak];

        for (int i = 0; i <= nBanyak - 1; i++) {
            System.out.print("Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }
        for (int j = 0; j <= nBanyak - 1; j++) {
            jumlah = jumlah + nilai[j];
        }

        rata = jumlah / nBanyak;
        System.out.println();
        System.out.println("Maka, rata rata nilainya adalah " + rata);
        System.out.println("Devoloped by  GandyCS");
    }
