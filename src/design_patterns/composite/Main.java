package design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("Documents");
        folder.add(new FileItem("notes.txt", 10));
        folder.add(new FileItem("photo.jpg", 50));

        System.out.println(folder.getName() + " size: " + folder.getSize());
    }
}

interface FileSystemItem {
    String getName();

    int getSize();
}

class FileItem implements FileSystemItem {
    private final String name;
    private final int size;

    FileItem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}

class Folder implements FileSystemItem {
    private final String name;
    private final List<FileSystemItem> items = new ArrayList<>();

    Folder(String name) {
        this.name = name;
    }

    void add(FileSystemItem item) {
        items.add(item);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int total = 0;
        for (FileSystemItem item : items) {
            total += item.getSize();
        }
        return total;
    }
}

