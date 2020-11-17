package JavaND;

public class Compiler4 {

}

class XCopy { // kompiliuojasi be klaidu, nieko taisyti nereikejo. Rezultatas: 42 84
    public static void main(String[] args) {

        int orig = 42;

        XCopy x = new XCopy();

        int y = x.go(orig);

        System.out.println(orig + " " + y);
    }

    int go(int arg) {

        arg = arg * 2;

        return arg;
    }
}

class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() { // String pakeistas is void
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time:" + tod);
    }
}