package TrainWithDatabase.BookingMethods;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;
import TrainWithDatabase.PnrNumber;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckPnrNumber {
    public static  String checkPnrNumber(String Pnr) throws SQLException {
        String storePnrNumwber="";
        ResultSet resultSetObjectForDateCheck = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select * from userdetails;");

        while (resultSetObjectForDateCheck.next()) {
            if (Pnr.equals(resultSetObjectForDateCheck.getString(7))) {
                storePnrNumwber= PnrNumber.getPnrNumber();
                return storePnrNumwber;
            }
        }
        return Pnr;
    }


}
