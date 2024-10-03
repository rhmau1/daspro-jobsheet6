import java.util.Scanner;
public class Pemilihan2Percobaan110 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);        
        System.out.print("masukkan tahun yang ingin di cek: ");
        int tahun = input10.nextInt();    
        if (tahun % 400 == 0) {
            System.out.println("Tahun kabisat");
        } else {
            // Cek apakah tahun habis dibagi 100
            if (tahun % 100 == 0) {
                System.out.println("Bukan tahun kabisat");
            } else {
                // Cek apakah tahun habis dibagi 4
                if (tahun % 4 == 0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            }
        }        
    }
}
