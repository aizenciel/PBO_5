/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal2;

import java.util.Scanner;
/**
 *
 * @author Bintang Danuarta
 */
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM : ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa : ");
        String namaMahasiswa = input.nextLine();

        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        Mahasiswa mahasiswa = new Mahasiswa(npm, namaMahasiswa, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
        double nilaiAkhir = mahasiswa.hitungNilaiAkhir();
        String grade = Nilai.tentukanGrade(nilaiAkhir);
        String keterangan = Nilai.tentukanKeterangan(nilaiAkhir);

        System.out.println();
        System.out.println("NPM Mahasiswa : " + mahasiswa.getNPM());
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNamaMahasiswa());
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
    
    

