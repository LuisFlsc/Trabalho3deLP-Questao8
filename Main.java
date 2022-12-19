import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Cliente CA = new Cliente("Fulano",9999,"Rua A");
        Cliente CB = new Cliente("Ciclano",8888,"Rua B");
        Pedido P1 = new Pedido(1,CA,LocalDate.now(),LocalDate.parse("2022-12-19"),500);
        Pedido P2 = new Pedido(2,CB,LocalDate.now(),LocalDate.parse("2022-12-19"),500);
        P2.Expresso();
        P1.verificarprazo();
        P2.verificarprazo();
        
        System.out.println(CA.toString());
        System.out.println(P1.toString());
        System.out.println(CB.toString());
        System.out.println(P2.toString());
        
        /*
        Cliente CC;
        salvarCliente(CA);
        lerCliente(CC);
        
        Pedido P3;
        salvarPedido(P1);
        lerPedido(P3);
        */
    }
}
