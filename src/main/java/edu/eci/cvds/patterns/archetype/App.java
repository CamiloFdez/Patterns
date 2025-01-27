package edu.eci.cvds.patterns.archetype;

/**
 * Hello!
 */
public class App {
    public static void main(String[] args) {
        if (args.length <= 0) {
			System.out.println("Hello Stranger.");
        }
        else{
            System.out.println("Hello" + " " + args[0] + " " + args[1]);
        }
    }
}
