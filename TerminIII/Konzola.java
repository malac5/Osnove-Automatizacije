package TerminIII;

import java.io.Console;

public class Konzola {
    public static void main(String [] args) {
        Console c2= System.console();
        String line = c2.readLine();
        c2.writer().println("Hello" + line);

    }
}
