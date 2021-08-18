
import java.util.Scanner;

public class BankIO {
    int saldo;
    Scanner masukan =new Scanner(System.in);

public BankIO(int saldo) {
    this.saldo = saldo;
}

void simpanAwal(){
    System.out.println("Saldo Anda Adalah : Rp."+saldo);
}

void simpanUang(int simpan){
    simpan = masukan.nextInt();
    saldo = simpan+saldo;
    System.out.println("Saldo Anda Saat ini Adalah Rp:"+saldo);
}
void ambilUang(int ambil){
    ambil=masukan.nextInt();
    if (saldo <= ambil) {
        System.out.println("Maaf Saldo Anda Kurang !!!!!!!");
    }else saldo = saldo-ambil;
    System.out.println("Saldo Anda Saat ini Adalah Rp:"+saldo);
}
    
}
