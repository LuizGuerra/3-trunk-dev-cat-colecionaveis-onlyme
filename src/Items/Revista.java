package Items;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Revista extends Item {

    Date anoDePublicacao;
    int volume;
    String editora;
    List <String> principaisAssuntos;

    public Revista (int id) {
        this.id = id;
        this.nome = "";
        this.dataDeAquisicao = new Date();
        this.listaDeAutores = new ArrayList();
        this.anoDePublicacao = new Date();
        this.volume = 0;
        this.editora = "";
        this.principaisAssuntos = new ArrayList();
    }

    public Revista (int id, String nome, Date dataDeAquisicao, ArrayList <String> listaDeAutores, Date anoDePublicacao, int volume, String editora, List <String> principaisAssuntos) {
        this.id = id;
        this.nome = nome;
        this.dataDeAquisicao = dataDeAquisicao;
        this.listaDeAutores = listaDeAutores;
        this.anoDePublicacao = anoDePublicacao;
        this.volume = volume;
        this.editora = editora;
        this.principaisAssuntos = principaisAssuntos;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return super() +
                "Revista{" +
                "anoDePublicacao=" + anoDePublicacao +
                ", volume=" + volume +
                ", editora='" + editora + '\'' +
                ", principaisAssuntos=" + principaisAssuntos +
                '}';
    }
}
