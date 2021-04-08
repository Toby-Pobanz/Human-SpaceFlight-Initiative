
import java.sql.*;
import java.util.*;

//import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;

public class Main {
    
public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException { 
    String password = "";
    String username = "Admin";
    String DB_URL = "jdbc:mysql://localhost:3306/astrodb";
    
    //File f = new File("password.dat"); 

    Path path = Paths.get("password.dat"); 

    try {
    if(Files.exists(path)) {
        System.out.println("file is true");

        

        
    }
    else {
        password = new Random().ints(10, 33, 122).collect(StringBuilder::new,
        StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
        System.out.println(password);
        byte[] bytes = password.getBytes(Charset.forName("UTF-8"));
        File F = new File ("password.dat");
        FileOutputStream fstream = new FileOutputStream(F);
        DataOutputStream output = new DataOutputStream(fstream);
        //output.writeUTF(password);
        //output.writeBytes(password);
        //output.write(bytes);
        //fstream.write(bytes);
        Files.write(Paths.get("password.dat"), bytes);
        System.out.println("bytes: " + bytes);

        output.close();
    }
    }
    catch( IOException e) {
        System.out.println("it went wrong");
        System.out.print(e);
    }
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection conn = null;
    //C:\Users\000191368\Desktop\Human SpaceFlight Initiative\myDatabase\mysql\data\astrodb
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/astrodb", "root", "Tobias2004");
    System.out.println("The end");
    System.out.println("password: " + password);
    String sqlStatement = "SELECT * FROM Astro";
    Statement stmt = conn.createStatement();
    ResultSet result = stmt.executeQuery(sqlStatement);
    System.out.println(result);
    }

}
