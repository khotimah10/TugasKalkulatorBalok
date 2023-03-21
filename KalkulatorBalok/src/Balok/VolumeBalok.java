/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Balok;
import java.util.Scanner;
    
public class VolumeBalok {
    public static void main(String[] args) {
        // deklarasinya
        float p,l,t;
        
        // membuat scanner baru
        Scanner panjang = new Scanner(System.in);
	Scanner lebar = new Scanner(System.in);
	Scanner tinggi = new Scanner(System.in);
        
		
        System.out.println("=====================================");
	System.out.println("       Program Volume Balok          ");
	System.out.println("=====================================");
                
        // Input Program
        System.out.print("Input Panjang: ");
        p = panjang.nextFloat();
            System.out.print("Input lebar: ");
        l = lebar.nextFloat();
            System.out.print("Input tinggi: ");
        t = tinggi.nextFloat();
        
        // proses
	float vol;
        vol = p * l * t;
        
        // output
        System.out.println("Volume Balok = "+vol+" cm3");
		
    }
}

