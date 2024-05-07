
package kiragaji;
import java.util.Scanner;
public class Kiragaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int bilpelanggan; 
        double gaji = 0;
        
        System.out.println("Masukkan bilangan pelanggan : ");
        bilpelanggan = input.nextInt();
        
        if (bilpelanggan >= 40){
            gaji = 10000;
        } else if (bilpelanggan >= 30 && bilpelanggan <= 39){
            gaji = 8000;
        } else if (bilpelanggan >= 20 && bilpelanggan <= 29){
            gaji = 6000;
        } else if (bilpelanggan >= 10 && bilpelanggan <= 19){
            gaji = 4000;
        } else if (bilpelanggan >= 1 && bilpelanggan <= 9){
            gaji = 2000;
        }
        
        double jumlah_gaji = 1100 + gaji;
        System.out.println("Jumlah pelanggan :" + bilpelanggan);
        System.out.println("Jumlah gaji :  " + jumlah_gaji);
    }
    
}
