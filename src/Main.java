import Items.Item;
import Items.CompactDisc;
import Items.DigitalVideoDisc;
import Items.Revista;
import Items.Livro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ls.add("" + i);
        }

        String let = "";

        for (int i = 0; i < ls.size(); i++) {
            if (i == 0) {
                let += ls.get(i);
            } else {
                let += ", " + ls.get(i);
            }
        }
        
    }
}
