import Items.Item;
import Items.CompactDisc;
import Items.DigitalVideoDisc;
import Items.Revista;
import Items.Livro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> ls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ls.add(i);
        }
        System.out.println(ls.toString());
    }
}
