import java.io.File;
import java.sql.DriverManager;
import java.util.*;

import java.io.*;
public class Main {

    public static void main(String[] args) {
    
    String password = "";
    String username = "Admin";
    String DB_URL = "jdbc:derby:AstroDB";
    


    if(new File("password.dat").exists()) {

    }
    else {
        password = new Random().ints(10, 33, 122).collect(StringBuilder::new,
        StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
        System.out.println(password);
        File F = new File ("password.dat");
        OutputStream output = new FileOutputStream("password.dat");
        output.writeUTF(password);
    }
    Connection conn = DriverManager.getConnection(DB_URL, username, password);

    }

}