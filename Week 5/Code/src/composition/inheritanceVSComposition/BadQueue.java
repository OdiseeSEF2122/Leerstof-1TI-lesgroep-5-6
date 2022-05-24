package composition.inheritanceVSComposition;

import java.awt.*;

/**
 * A queue implemented by inheritance of a list
 * this breaks several features of a List
 */
public class BadQueue extends List {
    @Override
    public String getItem(int index) {
        //ignore the index because we may only return the first element
        //this breaks the intent of the getItem(index) method
        return super.getItem(0);
    }
    @Override
    public synchronized String[] getItems() {
        //only return the list element iso all elements
        String[] ret= {super.getItem(0)};
        return ret;
    }
    @Override
    public void add(String item, int index) {
        //ignore the index
        super.add(item, getItemCount());
    }
}
