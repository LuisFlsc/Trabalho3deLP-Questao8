import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Cliente CA = new Cliente("Fulano",9999,"Rua A");
        Cliente CB = new Cliente("Ciclano",8888,"Rua B");
        //Usei o LocalDate.parse para definir uma data a fim de testar
        //Mas de acordo com a questão o certo seria o primeiro argumento de data receber um LocalDate.now
        Pedido P1 = new Pedido(1,CA,LocalDate.parse("2022-12-16"),LocalDate.parse("2022-12-16"),500);
        Pedido P2 = new Pedido(2,CB,LocalDate.parse("2022-12-16"),LocalDate.parse("2022-12-16"),500);
        P2.Expresso();
        P1.verificarprazo();
        P2.verificarprazo();
        
        System.out.println(P1.toString());
        System.out.println(P2.toString());
    }
}
