package TrainWithDatabase.DatabasePackage;

import java.sql.*;

public class ExcetuteQureyThrowDatabase {
    public static ResultSet connectExecuteQuery(String query) throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
        Connection connectObject = null;
        try {
            Class.forName("org.postgresql.Driver");
            connectObject = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trainbooking", "postgres", "19e101");
            Statement statementObject=connectObject.createStatement();
            //System.out.println(query);
            ResultSet resultSetObject=statementObject.executeQuery(query);
            connectObject.close();
            return resultSetObject;
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return null;
    }
}
