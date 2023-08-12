package com.example.UTS;

public class uts4 {
    public static void main(String[] args) {
        var customer = new uts3();
        customer.name = "Amin Febryansyah";
        customer.address = "Cilacap";

        customer.infoTamu();
        customer.waktuCheckin("11 Agustus");
        customer.waktuCheckout("15 Agustus");
        customer.informasiPembayaran(100000);
        customer.pesananMakanan("Sate Kuda");

    }
}
