package Items;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalVideoDisc extends Item {

    String tipo;
    String descricao;

    public DigitalVideoDisc (int id) {
        this.id = id;
        this.nome = "";
        this.dataDeAquisicao = new Date();
        this.listaDeAutores = new ArrayList();
        this.tipo = "";
        this.descricao = "";
    }

    public DigitalVideoDisc (int id, String nome, Date dataDeAquisicao, ArrayList <String> listaDeAutores, String tipo, String descricao) {
        this.id = id;
        this.nome = nome;
        this.dataDeAquisicao = dataDeAquisicao;
        this.listaDeAutores = listaDeAutores;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return super() +
                "DigitalVideoDisc{" +
                "tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
