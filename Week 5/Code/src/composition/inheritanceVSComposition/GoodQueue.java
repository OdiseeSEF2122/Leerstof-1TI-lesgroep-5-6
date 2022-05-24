package composition.inheritanceVSComposition;

import java.awt.*;

/** A queue implemented by composition of a list */
public class GoodQueue {
    private List elements;
    public String getNextItem() {
        return elements.getItem(0);
    }
    public void add(String item) {
        elements.add(item, elements.getItemCount());
    }
}
