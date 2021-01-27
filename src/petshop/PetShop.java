
package petshop;


public class PetShop {

    
    public static void main(String[] args) {
        //Output method main
        System.out.println("Selamat datang di pet shop");
        //Pemberian objek untuk peanggilan dengan obejek "oke"
        method oke=new method();
        //Pemanggilan method void
        oke.harga();
        oke.kasir();
        //Pemanggilan method nonvoid
        System.out.println(oke.penutupan());
    }
    
}
