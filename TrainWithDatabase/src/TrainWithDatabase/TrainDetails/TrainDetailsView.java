package TrainWithDatabase.TrainDetails;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TrainDetailsView {
    public void printTrainDetails(ArrayList<TrainDetailsModel> trainMOdelObject) throws SQLException {
            for(TrainDetailsModel trainDetailsForLoopObject:trainMOdelObject) {
                  System.out.println("Train Name: " + trainDetailsForLoopObject.getTrainName() + " Train Number: " +trainDetailsForLoopObject.getTrainNUmber()  + " Start Location: " +trainDetailsForLoopObject.getStartLocation()  + " End Location: " + trainDetailsForLoopObject.getEndLocation());
            }


    }
}
