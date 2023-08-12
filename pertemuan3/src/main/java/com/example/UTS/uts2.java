package com.example.UTS;

import java.util.Scanner;

public class uts2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        String hasil = beriPenilaian(nilai);
        System.out.println("Hasil penilaian: " + hasil);

        scanner.close();
    }
    public static String beriPenilaian(int nilai) {
    if (nilai >= 80 && nilai <= 100) {
        return "A";
    } else if (nilai >= 77 && nilai <= 79) {
        return "A-";
    } else if (nilai >= 75 && nilai <= 76) {
        return "A/B";
    } else if (nilai >= 72 && nilai <= 73) {
        return "B+";
    } else if(nilai >= 70 && nilai <= 71){
        return "B";
    } else if(nilai >= 67 && nilai <=69){
        return "B-";
    } else if(nilai >= 65 && nilai <=66){
        return "B/C";
    } else if (nilai >= 62 && nilai <=64){
        return "C+";
    } else if (nilai >= 60 && nilai <=61){
        return"C";
    } else if (nilai >= 55 && nilai <=59){
        return "C-";
    } else if (nilai >= 50 && nilai <=54){
        return "C/D";
    } else if (nilai >= 45 && nilai <=49){
        return "D+";
    } else if (nilai >= 40 && nilai <=44){
        return "D";
    }else{
        return "E";
    }
}
}

