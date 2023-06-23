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
public class kasir {

    private String nama_kasir;
    private String alamat;
    private String noHp;
    private String email;
    private String password;
    public boolean cek = false;

    public kasir() {

    }

    public void dataKasir(String Nama_kasir, String alamat, String no, String email, String Password) {
        this.nama_kasir = Nama_kasir;
        this.alamat = alamat;
        this.noHp = no;
        this.email = email;
        this.password = Password;
    }

    public void setNama(String nama_kasir) {
        this.nama_kasir = nama_kasir;
    }

    public String getNama() {
        return nama_kasir;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    String getAlamat() {
        return alamat;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    String getNoHp() {
        return noHp;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String getEmail() {
        return email;
    }
}