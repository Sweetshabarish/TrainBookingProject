package TrainWithDatabase.DatabasePackage;

import java.sql.*;

public class UserStoreDetailsExecutiondatbase {
    public static void userStoreDetails(String a) throws SQLException {
        // DriverManager.registerDriver(org.postgresql.Driver);
        Connection connectObject=null;
        connectObject=DriverManager.getConnection("jdbc:postgresql://localhost:5432/trainbooking","postgres","19e101");
        Statement statementObject=connectObject.createStatement();
        statementObject.execute(a);

        connectObject.close();
    }



}
