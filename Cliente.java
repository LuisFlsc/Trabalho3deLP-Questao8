public class Cliente {
    String nome;
    int telefone;
    String endereco;
    
    //construtor
    public Cliente (String nome, int telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public String toString() {
        return " O cliente " + nome + " possuí o número " + telefone + " e mora no endereço " + endereco;
    }
}
