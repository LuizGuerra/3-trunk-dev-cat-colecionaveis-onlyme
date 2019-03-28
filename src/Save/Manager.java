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



}