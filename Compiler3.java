package JavaND;

public class Compiler3 {
}

class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books(); // trukstama eilute uzduotyje
        myBooks[1] = new Books(); // trukstama eilute uzduotyje
        myBooks[2] = new Books(); // trukstama eilute uzduotyje
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}

class Hobbits {

    String name;

    public static void main(String[] args) {

        Hobbits[] h = new Hobbits[3];
        int z = 0; // Knygoj siuloma pradeti nuo -1

        while (z < 3) { // pakeista while is z < 4 i z < 3; knygoje siuloma while (z < 2) ir z = z+1
                        // palikti 44 eilutej
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            if (z == 3) {
                h[z].name = "bilbo";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z = z + 1; // perkelta is 44 eilutes
        }
    }
}