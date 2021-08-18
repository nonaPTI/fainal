    import java.util.Scanner;

public class BankMenu {
    public static void main(String[]args){
        int ambil = 0,simpan = 0;
        Scanner pilih = new Scanner(System.in);
        BankIO bk = new BankIO(1000000);
        
    
    System.out.println("Selamat Datang di Bank UMK");
    for (int i = 1; i >=1 ; i++){
        System.out.println("\n");
        System.out.println("Menu ATM");
        System.out.println("1. Cek Saldo 2. Simpan Uang 3. ambil Uang");
        System.out.println("pilih Menu ATM : ");
        int menu = pilih.nextInt();
            if(menu == 1){
                bk.simpanAwal();
            }else if (menu == 2 ){
                System.out.println("Masukan Uang yang Akan Disimpan : Rp.");
                bk.simpanUang(simpan);
            }else if (menu == 3){
                System.out.println("Masukan Uang yang Akan Diambil Rp.");
                bk.ambilUang(ambil);
            }else if (menu > 3){
                System.out.println("Menu Tidak Ada");
                System.out.print("Ulangi Pilih Menu ATM : ");
            }else
                break;
    }
    }
    
}
