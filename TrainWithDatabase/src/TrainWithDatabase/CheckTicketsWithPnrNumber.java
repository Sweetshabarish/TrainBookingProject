package TrainWithDatabase;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;
import TrainWithDatabase.FLowChart.FlowChartMainClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckTicketsWithPnrNumber {
   static  Scanner scannerObject = new Scanner(System.in);

    public static  void checkTicketsWithPnrNumber() throws SQLException {
        System.out.println("Enter the Pnr Number: ");
        String gettingPnrNumberFromUser = scannerObject.next();
        ResultSet resultSetObjectForDateCheck = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select * from userdetails;");

        while (resultSetObjectForDateCheck.next()) {
            if (gettingPnrNumberFromUser.equals(resultSetObjectForDateCheck.getString(7))) {
                FlowChartMainClass.displayPassaengeQuery(" Select name,location,destination,date,phonenumber,trainnumber,pnrnumber from userdetails where pnrnumber='"+gettingPnrNumberFromUser+"';");
            }

        }
    }
}
