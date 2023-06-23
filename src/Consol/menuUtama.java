/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consol;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class menuUtama {

    int pilih, pilih1, pilih2, pilih3;
    Scanner input = new Scanner(System.in);
    data_barang db = new data_barang();
    data_kasir ksr = new data_kasir();
    data_transaksi trsk = new data_transaksi();
    String user = null, password = null;

    public void proses() {
        do {
            System.out.println("1. Login Admin");
            System.out.println("2. Login Kasir");
            System.out.println("3. exit");
            System.out.print("Masukan pilihan : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("UserName : ");
                    String user = input.next();
                    System.out.print("Password : ");
                    String password = input.next();
                    do {
                        db.menu();
                        System.out.print("pilih : ");
                        pilih1 = input.nextInt();
                        if (pilih1 == 1) {
                            do {
                                System.out.println("1. Input Barang");
                                System.out.println("2. Registrasi Kasir");
                                System.out.println("3. exit");
                                System.out.println("pilih : ");
                                pilih2 = input.nextInt();
                                if (pilih2 == 1) {
                                    System.out.print("Nama menu: ");
                                    String nama = input.next();
                                    System.out.print("Harga menu : ");
                                    int harga_menu = input.nextInt();
                                    db.insert(nama, harga_menu, harga_menu);
                                } else if (pilih2 == 2) {
                                    System.out.print("Nama kasir : ");
                                    String nama = input.next();
                                    System.out.print("Alamat kasir : ");
                                    String alamat = input.next();
                                    System.out.print("No hp : ");
                                    String no = input.next();
                                    System.out.print("Email : ");
                                    String email = input.next();
                                    System.out.print("Password : ");
                                    String passwd = input.next();
                                    ksr.insertDataKasir(nama, alamat, no, email, passwd);
                                }
                            } while (pilih2 < 3);
                        } else if (pilih1 == 2) {
                            do {
                                System.out.println("1. Update data Barang");
                                System.out.println("2. Update data Kasir");
                                System.out.println("3. exit");
                                System.out.print("pilih : ");
                                pilih2 = input.nextInt();
                                if (pilih2 == 1) {
                                    System.out.print("Masukan nama yang mau diupdate: ");
                                    String cari = input.next();
                                    System.out.print("Kode : ");
                                    String kode = input.next();
                                    System.out.print("Nama menu : ");
                                    String nama = input.next();
                                    System.out.print("Harga menu : ");
                                    int harga = input.nextInt();
                                    db.updateData(cari, nama, harga);
                                } else if (pilih2 == 2) {
                                    System.out.print("Nama kasir yang mau di update: ");
                                    String nama1 = input.next();
                                    System.out.println("Nama kasir : ");
                                    String nama = input.next();
                                    System.out.println("Alamat kasir : ");
                                    String alamat = input.next();
                                    System.out.println("No hp : ");
                                    String no = input.next();
                                    System.out.println("Email : ");
                                    String email = input.next();
                                    System.out.println("Password : ");
                                    String passwd = input.next();
                                    ksr.updateData(nama1, nama, alamat, no, email, passwd);
                                }
                            } while (pilih2 < 3);
                        } else if (pilih1 == 3) {
                            do {
                                System.out.println("1. Hapus data Barang");
                                System.out.println("2. Hapus data Kasir");
                                System.out.println("3. exit");
                                System.out.println("pilih : ");
                                pilih2 = input.nextInt();
                                if (pilih2 == 1) {
                                    System.out.print("Masukan nama makanan yang mau dihapus: ");
                                    String cari = input.next();
                                    db.delete(cari);
                                } else if (pilih2 == 2) {
                                    System.out.print("Masukan nama kasir yang mau dihapus: ");
                                    String nama2 = input.next();
                                    ksr.delete(nama2);
                                }
                            } while (pilih2 < 3);
                        } else if (pilih1 == 4) {
                            do {
                                System.out.println("1. view data makanan");
                                System.out.println("2. view data kasir");
                                System.out.println("3. exit");
                                System.out.print("pilih : ");
                                pilih3 = input.nextInt();
                                if (pilih3 == 1) {
                                    db.view();
                                } else if (pilih3 == 2) {
                                    ksr.view();
                                }
                            } while (pilih3 < 3);
                        }
                    } while (pilih1 < 5);
                    break;
                case 2:
                    System.out.print("UserName : ");
                    String us = input.next();
                    System.out.print("Password : ");
                    String psswd = input.next();
                    kasir kr = ksr.log(us, psswd);
                    if (ksr.cek=true) {
                        do {
                            System.out.println("1. Input Pesanan");
                            System.out.println("2. view");
                            System.out.println("3. exit");
                            System.out.println("pilih : ");
                            pilih3 = input.nextInt();
                            if (pilih3 == 1) {
                                System.out.print("Nama Pelanggan : ");
                                String pelanggan = input.next();
                                System.out.print("No meja : ");
                                int meja = input.nextInt();
                                int jmlh = 0;
                                int i=0;
                                admin[] ad = new admin[100];
                                String lagi;
                                do {
                                    System.out.println("menu pesanan : ");
                                    String menu1 = input.next();
                                    db.cek2(menu1);
                                    if (db.cek == true) {
                                        admin pp = db.Obj(menu1);
                                        System.out.print("jumlah menu : ");
                                        String menu2 = input.next();
                                        ad[i] = pp;
                                        db.cek = false;
                                    } else {
                                        System.out.println("Menu kosong");
                                    }
                                    i++;
                                    jmlh++;
                                    System.out.println("Input lagi : ");
                                    lagi = input.next();
                                } while (lagi.equals("y"));
                                trsk.inserttran(pelanggan, meja, ad, jmlh);
                            } else if (pilih3 == 2) {
                                trsk.view();
                            }
                        } while (pilih3 < 3);
                    }
            }
        } while (pilih < 3);
        System.out.println("Terima Kasih");
    }
}
