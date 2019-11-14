/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5;

/**
 *
 * @author PC 015
 */
public class Latihan5 {

    /**
     * @param args the command line arguments
     */
   int jumlahKambing = 88;
   
   //Method untuk menampilkan jumlah kambing 
   public void getJumlahKambing() {
       System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
     
    }
   public void tambahKambing() {
       jumlahKambing = jumlahKambing +5;
       System.out.println("Jumlah Kambing Setelah ditambah: " + jumlahKambing);
   }
   public static void main(String[] args) {
       Latihan5 kambingSusu = new Latihan5 ();
       
       kambingSusu.getJumlahKambing();
       kambingSusu.tambahKambing();
       kambingSusu.getJumlahKambing();
       
   }
    
}
