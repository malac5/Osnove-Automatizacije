package TerminIII;

import java.io.Console;

public class KalkulatorConsole {
    public static void main(String[] args) {
        Console terminal=System.console();
        terminal.writer().println("Enter first operand:");
        int x= Integer.parseInt(terminal.readLine());
        terminal.writer().println("Enter second operand:");
        int y= Integer.parseInt(terminal.readLine());
        terminal.writer().println("Result is:");
        terminal.writer().println(x+y);
    }
}
