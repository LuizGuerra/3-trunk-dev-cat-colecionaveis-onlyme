package Save;

import Items.CompactDisc;
import Items.DigitalVideoDisc;
import Items.Livro;
import Items.Revista;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    List <CompactDisc> cdList;
    List <DigitalVideoDisc> dvdList;
    List <Livro> livroList;
    List <Revista> revistaList;

    public Manager () {
        this.cdList = new ArrayList<>();
        this.dvdList = new ArrayList<>();
        this.livroList = new ArrayList<>();
        this.revistaList = new ArrayList<>();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Manager{" +
                "cdList=" + cdList.toString() +
                ", dvdList=" + dvdList.toString() +
                ", livroList=" + livroList.toString() +
                ", revistaList=" + revistaList.toString() +
                '}';
    }

    public getByItemEspecifico (TipoDeItem tdi) {

    }

}