package JavaND;

public class CodeMagnets3 {

}

class TestArrays {

    public static void main(String[] args) {
        String[] islands = new String[4];
        islands[0] = "Bermuda";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        islands[1] = "Fiji";
        int y = 0;

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        int ref;
        while (y < 4) {
            ref = index[y];
            y = y + 1;
            System.out.print("island = ");
            System.out.println(islands[ref]);
        }

    }
}
