package TrainWithDatabase.DateAndSeastPackage;

import TrainWithDatabase.BookingMethods.BookingWOrkingClassDataBase;
import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;
import TrainWithDatabase.TrainConstants;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewClassForTrainDateDetails {
/*
This is view for the Train Details
 */
    public static void trainDateDetailsViewMethod(ArrayList<TrainDateModel> trainDateModelArrayListObject) throws SQLException {
for(TrainDateModel trainDateModelForLoopObject:trainDateModelArrayListObject) {
    System.out.println(TrainConstants.displayDesign);
    System.out.println("Date :" + trainDateModelForLoopObject.getDate());
    System.out.println("Seats :" + trainDateModelForLoopObject.getSeats());
    System.out.println(TrainConstants.displayDesign);
}
        }



}

