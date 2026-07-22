package design_patterns.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        NameCollection names = new NameCollection(new String[]{"Asha", "Ravi", "Meera"});

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class NameCollection implements Iterable<String> {
    private final String[] names;

    NameCollection(String[] names) {
        this.names = names;
    }

    public Iterator<String> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        private int index;

        public boolean hasNext() {
            return index < names.length;
        }

        public String next() {
            return names[index++];
        }
    }
}

