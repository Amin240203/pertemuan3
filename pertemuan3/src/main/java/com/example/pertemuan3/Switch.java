package com.example.pertemuan3;

public class Switch {
    public static void main(String[]args){
        var nilai = "B";

        switch (nilai){
            case "A":
            System.out.println("Anda Luar biasa");
            break;
            case "B":
            System.out.println("Lulus");
            break;
            case "C":
            System.out.println("Anda Lulus");
            break;
            case "D":
            System.out.println("Anda  Tidak Lulus");
            break;
            default:
            System.out.println("mungkin anda salah jurusan");

        }
    }
}
