/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consol;

import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class data_barang {

    Scanner input = new Scanner(System.in);
    int index = 0;
    boolean cek=false;
    int semen, semen2, semen3;
    admin[] ad = new admin[100];

    public void insert(String menu, int harga_menu, int jmlh) {
        admin dd = new admin();
        dd.data(menu, harga_menu,jmlh);
        ad[index] = dd;
        index++;
    }

    public void updateData(String cari_nama, String menu, int harga_menu) {
        for (int i = 0; i < index; i++) {
            if (cari_nama.equals(ad[i].menu)) {
                ad[i].setMenu(menu);
                ad[i].setHarga(harga_menu);
            }
        }
    }

    public void delete(String nama) {
        for (int i = 0; i < index; i++) {
            if (index == 0) {
                System.err.println("Data tidak ada");
                break;
            } else if (nama.equals(ad[i].getMenu())) {
                for (int j = i; j < index; j++) {
                    ad[j] = ad[j + 1];
                }
                index = index - 1;
                break;
            }
        }
    }

    public void view() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nama menu : " + ad[i].getMenu());
            System.out.println("Harga menu : " + ad[i].getHarga());
        }
    }

    public void cek2(String menu) {
        for (int i = 0; i < index; i++) {
            if (ad[i].getMenu().equals(menu)) {
                cek=true;
                System.out.println("hayuuuuu");
            }
        }  
    }
    
 public admin Obj(String kode){
        admin mk=null;
        for(int i=0; i<index; i++){
            if(kode.equals(ad[i].getMenu())){
                mk = ad[i];
            }
        }
        return mk;
    }

//1
    public void hargaTotal(int harga) {

    }

    public void menu() {
        System.out.println("1. insert");
        System.out.println("2. update");
        System.out.println("3. delete");
        System.out.println("4. view");
        System.out.println("5. exit");
    }

    public DefaultTableModel viewTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama menu");
        model.addColumn("Harga Menu");

        for (int i = 0; i < index; i++) {
            Object[] obj = new Object[2];
            obj[0] = ad[i].getMenu();
            obj[1] = ad[i].getHarga();
            model.addRow(obj);
        }
        return model;
    }

}
