import java.time.LocalDate;

public void SalvarCliente(Cliente C){
    String ArqCliente = "ArqClientes.txt";
        
    String nome = C.nome;
    int numero = C.numero;
    String endereco = C.endereço;
        
    String print = nome+";"+numero+";"+endereco;
    Arquivo.Write(ArqCliente,print);
}

public void SalvarPedido(Pedido P){
    String ArqPedido = "ArqPedidos.txt";
        
    int numero = P.numero;
    Cliente cliente = P.cliente;
    LocalDate datap = P.dataP;
    LocalDate datae = P.dataE;
    float preco = P.preco;
    boolean prazo = P.prazo;
        
    String print = numero+";"+cliente+";"+datap+";"+datae+";"+preco+";"+prazo;
    Arquivo.Write(ArqPedido,print);
}
    
public void LerCliente(Cliente C){
    String conteudo = Arquivo.Read(ArqCliente);
    C.nome = conteudo.split(";")[0];
    C.telefone = conteudo.split(";")[1];
    C.endereço = conteudo.split(";")[2];
}
    
public void LerPedido(Pedido P){
    String conteudo = Arquivo.Read(ArqPedido);
    C.numero = conteudo.split(";")[0];
    C.cliente = conteudo.split(";")[1];
    C.dataP = conteudo.split(";")[2];
    C.dataE = conteudo.split(";")[3];
    C.preco = conteudo.split(";")[4];
    C.prazo = conteudo.split(";")[5];
}
