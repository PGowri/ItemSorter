package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        ArrayList<Item> unsorted = new ArrayList<>(Arrays.asList(items));
        unsorted.sort(comparator);
        return unsorted.toArray(new Item[items.length]);
    }
}
