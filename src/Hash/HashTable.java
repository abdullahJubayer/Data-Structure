package Hash;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Entry>[] lists = new LinkedList[5];


    public void put(int key, String val) {
        var item = getOrCreateItem(key);
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = val;
            return;
        }
        item.addLast(new Entry(key, val));
    }

    public String get(int key) {
        var entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();
        getItem(key).remove(entry);
    }

    private int hash(int key) {
        return key % lists.length;
    }

    private Entry getEntry(int key) {
        int index = hash(key);
        var items = lists[index];
        if (items != null)
            for (Entry e : items) {
                if (e.key == key)
                    return e;
            }
        return null;
    }

    private LinkedList<Entry> getItem(int key) {
        return lists[hash(key)];
    }

    private LinkedList<Entry> getOrCreateItem(int key) {
        var index = hash(key);
        var item = lists[index];
        if (item == null)
            lists[index] = new LinkedList<>();
        return item;
    }


    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(0, "10");
        table.put(1, "20");
        table.put(10, "20");
        table.put(11, "20");

        table.remove(11);
    }
}
