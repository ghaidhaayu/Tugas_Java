/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

/**
 *
 * @author PC 015
 */
public class Latihan6 {

    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDIUN";
    
    public static void main (String [] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                            + Mamalia.jumlahKambing);
        
    }
    
}
