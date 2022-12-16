import java.time.LocalDate;

public class Pedido {
    int numero;
    Cliente cliente;
    LocalDate dataP;
    LocalDate dataE;
    float preco;
    boolean prazo;
    
    public void Expresso(){
        this.preco = this.preco + (preco/5);
    }
    
    public void verificarprazo(){
        if (this.dataP.compareTo(this.dataE) == 0){
            this.prazo = false;
        }
        else{
            this.prazo = true;
        }
    }
    
    //construtor
    public Pedido(int numero, Cliente cliente, LocalDate dataP, LocalDate dataE, float preco){
        this.numero = numero;
        this.cliente = cliente;
        this.dataP = dataP;
        this.dataE = dataE;
        this.preco = preco;
    }
    
    //redefinicao do toString
    public String toString() {
        return " O cliente " + cliente.nome + " fez um pedido no valor de " + preco + " dinheiros e foi entregue " + (prazo ? "fora do prazo " : "no prazo."); 
    }
}
