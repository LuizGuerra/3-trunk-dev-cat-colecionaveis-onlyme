package Items;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class Item {

    int id;
    String nome;
    Date dataDeAquisicao;
    List <String> listaDeAutores;

    public String toString () {
        return ("Id: " + this.id + ", nome: " + this.nome + ", data de aquisição: " + this.dataDeAquisicao +
                "Lista de Autores: : " + this.listaDeAutores.toString() );
    }

}
