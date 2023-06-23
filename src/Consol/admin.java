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
public class admin extends input {
    
    
    public admin(){
        
    }
    public void data(String menu,int harga_menu, int jumlah){
        this.menu=menu;
        this.harga_menu=harga_menu;
        this.jumlah=jumlah;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah=jumlah;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setMenu(String NamaMenu){
        this.menu=NamaMenu;
    }
    
    public String getMenu(){
        return menu;
    }
    
    public void setHarga(int HargaMenu){
        this.harga_menu=HargaMenu;
    }
    
    public int getHarga(){
        return harga_menu;
    }
}
