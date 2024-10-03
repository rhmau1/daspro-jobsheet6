import java.util.Scanner;
public class Pemilihan2Percobaan110java {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        
        System.out.print("masukkan tahun yang ingin di cek: ");
        int tahun = input10.nextInt();
        
        if((tahun % 4) == 0) {
            if((tahun % 100) != 0)
                System.out.println("tahun kabisat");                        
        }else
            System.out.println("bukan tahun kabisat");
        
    }
}
