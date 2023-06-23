/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consol;

import javax.swing.table.DefaultTableModel;

public class data_kasir {

    kasir[] kk = new kasir[100];
    int index = 0;
    boolean cek = false;

    public void insertDataKasir(String nama_kasir, String alamat, String no, String email, String password) {
        kasir kk2 = new kasir();
        kk2.dataKasir(nama_kasir, alamat, no, email, password);
        kk[index] = kk2;
        index++;
    }

    public void updateData(String cari_nama, String nama_kasir, String alamat, String no, String email, String password) {
        for (int i = 0; i < index; i++) {
            if (cari_nama.equals(kk[i].getNama())) {
                kk[i].setNama(nama_kasir);
                kk[i].setAlamat(alamat);
                kk[i].setNoHp(no);
                kk[i].setEmail(email);
                kk[i].setPassword(password);
            }
        }
    }

    public void delete(String nama) {
        for (int i = 0; i < index; i++) {
            if (index == 0) {
                System.err.println("Data tidak ada");
                break;
            } else if (nama.equals(kk[i].getNama())) {
                for (int j = i; j < index; j++) {
                    kk[j] = kk[j + 1];
                }
                index = index - 1;
                break;
            }
        }
    }

    public void view() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nama kasir : " + kk[i].getNama());
            System.out.println("Alamat kasir: " + kk[i].getAlamat());
            System.out.println("No Hp kasir : " + kk[i].getNoHp());
            System.out.println("Email : " + kk[i].getEmail());
        }
    }

    public kasir log(String user1, String password1) {
        kasir log = null;
        for (int i = 0; i < index; i++) {
            if (kk[i].getNama().equals(user1) && kk[i].getPassword().equals(password1)) {
                log = kk[i];
            }
        }
         return log;
    }
    
    public DefaultTableModel viewTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Kasir");
        model.addColumn("Alamat Kasir");
        model.addColumn("No Hp");
        model.addColumn("Email");
        model.addColumn("Password");

        for (int i = 0; i < index; i++) {
            Object[] obj = new Object[5];
            obj[0] = kk[i].getNama();
            obj[1] = kk[i].getAlamat();
            obj[2] = kk[i].getNoHp();
            obj[3] = kk[i].getEmail();
            obj[4] = kk[i].getPassword();
            model.addRow(obj);
        }
        return model;
    }
}