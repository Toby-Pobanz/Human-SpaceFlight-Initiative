
import java.sql.*;
import java.util.*;

import java.io.*;
public class Main {

    
    public static void main(String[] args) {
    
    String password = "";
    String username = "Admin";
    String DB_URL = "jdbc:derby:AstroDB";
    

    try {
    if(isFileExists("password.dat")) {
        System.out.println("file is true");
        
    }
    else {
        password = new Random().ints(10, 33, 122).collect(StringBuilder::new,
        StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
        System.out.println(password);
        File F = new File ("password.dat");
        FileOutputStream fstream = new FileOutputStream(F);
        DataOutputStream output = new DataOutputStream(fstream);
        output.writeUTF(password);
        output.close();
    }
    }
    catch( IOException e) {
        System.out.println("it went wrong");
        System.out.print(e);
    }
    //Connection conn = DriverManager.getConnection(DB_URL, username, password);
    System.out.println("The end");
    System.out.println("password: " + password);
    }

}