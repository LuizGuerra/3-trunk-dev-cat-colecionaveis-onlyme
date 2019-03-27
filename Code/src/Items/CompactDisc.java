package Items;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompactDisc extends Item {

    String generoMusical;
    List <String> nomeDasMusicas;

    public CompactDisc (int id) {
        this.id = id;
        this.nome = "";
        this.dataDeAquisicao = new Date();
        this.listaDeAutores = new ArrayList();
        this.generoMusical = "";
        this.nomeDasMusicas = new ArrayList();
    }

    public CompactDisc (int id, String nome, Date dataDeAquisicao, ArrayList <String> listaDeAutores, String generoMusical, ArrayList <String> nomeDasMusicas) {
        this.id = id;
        this.nome = nome;
        this.dataDeAquisicao = dataDeAquisicao;
        this.listaDeAutores = listaDeAutores;
        this.generoMusical = generoMusical;
        this.nomeDasMusicas = nomeDasMusicas;
    }

}
