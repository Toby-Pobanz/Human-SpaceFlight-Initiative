import java.io.*;
import java.util.Scanner;


public class Astrobuilder {
    public static void astroInfo() throws Exception{

    Scanner sc = new Scanner(new File("astroInfo.csv"));
    sc.useDelimiter(",");
    while (sc.hasNext()) {
        System.out.println(sc.next());
    }
    }
}
