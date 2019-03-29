package Items;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class Item {

    int id;
    String nome;
    Date dataDeAquisicao;
    List <String> listaDeAutores;

    @java.lang.Override
    public java.lang.String toString() {
        return "Item{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataDeAquisicao=" + dataDeAquisicao +
                ", listaDeAutores=" + listaDeAutores +
                '}';
    }
}
