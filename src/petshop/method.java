
package petshop;

import java.util.Scanner;


public class method {
    //Deklarasi variabel
    String penutup = "Terima kasih sudah berbelanja";
    int pilihan;
    int uang;
    //method void
    void harga(){
        System.out.println("1. Paket kucing : RP.200000");
        System.out.println("2. Paket anjing : RP.300000");
        System.out.println("3. Paket burung : RP.200000");
        System.out.println("Nb : Paket berisi makanan,kandang,dan perlengkapan lainnya");
    }
    //method void
    void kasir(){
        //Scanner dengan variabel "input"
        Scanner input =  new Scanner (System.in);
        //User memasukan pilihan
        System.out.print("Masukan Pilihan anda : ");
        pilihan=input.nextInt();
        //Percabangan Pilihan menu paket dan berbagai bentuk operasi bilangan
        switch (pilihan){
            case 1:
                //Pilihan 1 menandakan user memilih paket kucing dan melakukan proses pembayaran 
                //Jika uang yang dimasukan user adalah pas maka akan bertuliskan "uang anda pas"
                //jika uang yang dimasukan user kurang maka akan bertuliskan "uang anda kurang"
                //jika uang yang dimasukan user melebihi uang yang menjadi pesanannya maka akan bertuliskan "kembalian anda"
                System.out.println("Pilihan anda adalah paket kucing");
                System.out.print("Masukan uang anda Rp : ");
                uang=input.nextInt();
                if (uang == 200000){
                    System.out.println("uang anda pas ");
                }else if(uang < 200000){
                    System.out.println(" uang anda kurang Rp: "+(200000-uang));
                }else if (uang>200000){
                System.out.println("Kembalian anda Rp: "+(uang-200000));
                break;
                
            }
                //Pilihan 1 menandakan user memilih paket anjing dan melakukan proses pembayaran 
                //Jika uang yang dimasukan user adalah pas maka akan bertuliskan "uang anda pas"
                //jika uang yang dimasukan user kurang maka akan bertuliskan "uang anda kurang"
                //jika uang yang dimasukan user melebihi uang yang menjadi pesanannya maka akan bertuliskan "kembalian anda"
            case 2:
                System.out.println("Pilihan anda adalah paket anjing");
                System.out.print("Masukan uang anda Rp : ");
                uang=input.nextInt();
                if (uang == 300000){
                    System.out.println("uang anda pas ");
                }else if(uang < 300000){
                    System.out.println(" uang anda kurang Rp: "+(300000-uang));
                }else if (uang>300000){
                System.out.println("Kembalian anda Rp: "+(uang-300000));
                break;
            }
                //Pilihan 1 menandakan user memilih paket burung dan melakukan proses pembayaran 
                //Jika uang yang dimasukan user adalah pas maka akan bertuliskan "uang anda pas"
                //jika uang yang dimasukan user kurang maka akan bertuliskan "uang anda kurang"
                //jika uang yang dimasukan user melebihi uang yang menjadi pesanannya maka akan bertuliskan "kembalian anda"
            case 3:
                System.out.println("Pilihan anda adalah paket burung");
                System.out.print("Masukan uang anda Rp : ");
                uang=input.nextInt();
                if (uang == 200000){
                    System.out.println("uang anda pas ");
                }else if(uang < 200000){
                    System.out.println(" uang anda kurang Rp: "+(200000-uang));
                }else if (uang>200000){
                System.out.println("Kembalian anda Rp: "+(uang-200000));
                break;
            }
    }
    
    }
    //Method nonvoid
    String penutupan(){
        return penutup;
    }
}
