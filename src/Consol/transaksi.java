/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consol;

/**
 *
 * @author ACER
 */
public class transaksi extends input {
    admin[] dm;
    public int indexa = 0;
    public int indexj = 0;

    public void transaksi() {
    }
    
    public void setNama(String nama){
        this.nama_pelanggan=nama;
    }
    
    String getNama() {
        return nama_pelanggan;
    }
  
    public void setNO(int No){
        this.no=No;
    }
    int getNO() {
        return no;
    }
    public void settot(int tot) {
        this.Tot = tot;
    }

    int gettot() {
        return Tot;
    }

    public void setadmin(admin[] ad) {
        this.dm = ad;
        indexa++;
    }

    public admin[] getadmin() {
        return dm;
    }
    
    public void setindexa(int in) {
        this.indexa = in;
    }

    int getindexa() {
        return indexa;
    }
    
    public void setindexj(int jm) {
        this.indexj = jm;
    }

    int getindexj() {
        return indexj;
    }
    
    public void cetakMenu(){
        for(int i=0; i<indexa; i++){
            System.out.println("Nama menu: "+dm[i].getMenu());
            System.out.println("Harga menu: "+dm[i].getHarga());
            System.out.println("Jumlah Pesanan :"+dm[i].getJumlah());
        }  
    }
}
