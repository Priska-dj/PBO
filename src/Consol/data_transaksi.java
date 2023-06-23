/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consol;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class data_transaksi extends input {
    transaksi[] tra = new transaksi[100];
    
    int index=0;
        
    public void inserttran(String nama, int no, admin[] menu, int jumlah) {
        transaksi tran = new transaksi();
        tran.setNama(nama);
        tran.setNO(no);
        tran.setadmin(menu);
        tran.setindexa(jumlah);
        tra[index] = tran;
        index++;
    }
    
    public void view(){
        for(int i=0; i<index; i++){
            System.out.println("====DATA PELANGGAN====");
            System.out.println("Nama Pelanggan: " +tra[i].getNama());
            System.out.println("No Meja: " +tra[i].getNO());
            System.out.println("====DATA PEMESANAN====");
            tra[i].cetakMenu();
           // System.out.println("Jumlah pesanan: "+tra[i].getJumlah());
        }
    }
    public DefaultTableModel viewTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Menu");
        model.addColumn("Harga Menu");
        model.addColumn("Jumlah");

        for (int i = 0; i < index; i++) {
            Object[] obj = new Object[3];
            obj[0] = tra[i].getNama();
            obj[1] = tra[i].dm[i].getHarga();
            obj[2] = tra[i].dm[i].getJumlah();
            model.addRow(obj);
        }
        return model;
    }
}
