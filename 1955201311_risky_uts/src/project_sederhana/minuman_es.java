/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_sederhana;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class minuman_es {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
     
      String pesan;  
      String minuman = "";
         Scanner scan =new Scanner(System.in);
         
         System.out.println("Masukkan pesanan anda !");
         pesan = scan.nextLine();
         
                 switch(minuman){
            case "es teh" :
                System.out.println("es teh");
                String ucapan = "manis atau tawar";
                int jumlah = 0;
                while (jumlah<5){
                System.out.println("minuman es teh");
                jumlah++;
        }
            case"es degan "    :
                System.out.println("es degan ");
                 
                String ucapan1 = "dingin atau manis ";
                int jumlah1 = 0;
       
                while (jumlah1<5){
                System.out.println("minuman es degan ");
                jumlah1++;
        }       
                
            case"es oyen "   :
                System.out.println("es oyen ");
                
                String ucapan2 = "campur atu biasa ";
                int jumlah2 = 0;
                while (jumlah2<5){
                System.out.println("minuman es oyen");
                jumlah2++;
        }
            default :
                System.out.println("maaf minuman tidak ada ");
                break;
                
                 }
}
    }
    
    


    
    
   
