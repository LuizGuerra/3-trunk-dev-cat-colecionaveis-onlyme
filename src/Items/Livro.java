package Items;

import java.util.ArrayList;
import java.util.Date;

public class Livro extends Item {

    String editora;
    Date anoDePublicacao;

    public Livro (int id) {
        this.id = id;
        this.nome = "";
        this.dataDeAquisicao = new Date();
        this.listaDeAutores = new ArrayList();
        this.editora = "";
        this.anoDePublicacao = new Date();
    }

    public Livro (int id, String nome, Date dataDeAquisicao, ArrayList <String> listaDeAutores, String editora, Date anoDePublicacao) {
        this.id = id;
        this.nome = nome;
        this.dataDeAquisicao = dataDeAquisicao;
        this.listaDeAutores = listaDeAutores;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return super() +
                "Livro{" +
                "editora='" + editora + '\'' +
                ", anoDePublicacao=" + anoDePublicacao +
                '}';
    }
}
