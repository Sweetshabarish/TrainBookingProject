package Train;
import java.sql.*;
import java.util.Scanner;
public class UserDatabaseClass {
    public static void userStoreDetails(String a) throws SQLException {
        Scanner sc=new Scanner(System.in);
        // DriverManager.registerDriver(org.postgresql.Driver);
        Connection c=null;
        c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/train1","postgres","19e101");
        Statement st=c.createStatement();
         st.execute(a);

        c.close();
    }
    public static void trainStoreDetails(String a) throws SQLException {
        Scanner sc=new Scanner(System.in);
        // DriverManager.registerDriver(org.postgresql.Driver);
        Connection c=null;
        c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/train1","postgres","19e101");
        Statement st=c.createStatement();
        st.execute(a);

        c.close();
    }
}
