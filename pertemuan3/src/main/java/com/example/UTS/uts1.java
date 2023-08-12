package com.example.UTS;
class CustomerHotel {
    private String nama;
    private int umur;

    public CustomerHotel(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getumur() {
        return umur;
    }
}

class Tamu extends CustomerHotel {
    private String noktp;
    private String alamat;
    private String nomor_kamar;

    public Tamu(String nama, int umur, String noktp, String alamat, String nomor_kamar) {
        super(nama, umur);
        this.noktp = noktp;
        this.alamat = alamat;
        this.nomor_kamar = nomor_kamar;
    }

    public String getnoktp() {
        return noktp;
    }
    public String getalamat(){
        return alamat;
    }
    public String getnomor(){
        return nomor_kamar;
    }
}


class DataTamu extends CustomerHotel {
    private String info_tamu;
    private String waktu_in;
    private String waktu_out;
    private String info_bayar;
    private String makan;

    public DataTamu(String nama, int umur, String info_tamu, String waktu_in, String waktu_out, String info_bayar, String makan) {
        super(nama, umur);
        this.info_tamu = info_tamu;
        this.waktu_in = waktu_in;
        this.waktu_out = waktu_out;
        this.info_bayar = info_bayar;
        this.makan = makan;
    }

    public String getinfo_tamu() {
        return info_tamu;
    }
    public String getwaktu_in(){
        return waktu_in;
    }
    public String getwaktu_out(){
        return waktu_out;
    }
    public String getinfo_bayar(){
        return info_bayar;
    }
    public String getmakan(){
        return makan;
    }
}
public class uts1 {
    public static void main(String[] args) {
        Tamu Tamu = new Tamu("Ujank", 20, "123456", "jogja","15");
        DataTamu DataTamu = new DataTamu("Budi", 35, "98765","11 agustus","15 agustus","Lunas", "Sate Kuda");

        System.out.println("Tamu: " + Tamu.getNama() + " noktp: " + Tamu.getnoktp() + " Alamat : "+ Tamu.getalamat() +" Nomor Kamar : "+ Tamu.getnomor() +"");
        System.out.println("DataTamu: " + DataTamu.getNama() + " info_tamu: " + DataTamu.getinfo_tamu() + " Waktu CheckIn : " +DataTamu.getwaktu_in()+ " Waktu CheckOut : "+DataTamu.getwaktu_out()+" Informasi Pembayaran : "+DataTamu.getinfo_bayar()+" Pesananan Makanan : " +DataTamu.getmakan()+"");
    }
}
