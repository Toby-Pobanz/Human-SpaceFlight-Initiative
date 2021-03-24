import java.io.File;
import java.sql.DriverManager;

//import java.io.*;
public class Main {

    public static void main(String[] args) {
    
    String password = "";
    String username = "Admin";
    Final String DB_URL = "jdbc:derby:AstroDB";

    if("Password.dat" == false) {
        password = new Random().ints(10, 33, 122).mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
        System.out.println(password);
        File f = new File ("password.dat");
        OutputStream output = new FileOutputStream("password.dat");
        output.writeUTF(password);
    }
    Connection conn = DriverManager.getConnection(DB_URL, username, password);

    }

}