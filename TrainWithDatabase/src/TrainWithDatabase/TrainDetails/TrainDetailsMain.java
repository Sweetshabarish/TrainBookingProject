package TrainWithDatabase.TrainDetails;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TrainDetailsMain {
    public static void trainDetailsExecution(String Query) throws SQLException {

        ArrayList<TrainDetailsModel> trainDetailsModelObject=ExecuteQuery(Query);
        TrainDetailsView trainDetailsViewClassObject=new TrainDetailsView();
        TrainDetailsController trainDetailsControllerClaassObject=new TrainDetailsController(trainDetailsModelObject,trainDetailsViewClassObject);
        trainDetailsControllerClaassObject.TrainDeatilsUpdate(trainDetailsModelObject);


    }
    public static ArrayList<TrainDetailsModel> ExecuteQuery(String query) throws SQLException {

        ResultSet DetailsQuery= ExcetuteQureyThrowDatabase.connectExecuteQuery(query);
        ArrayList<TrainDetailsModel> trainDetailsModelArrayListObject=new ArrayList<>();
        while(DetailsQuery.next()){
            TrainDetailsModel trainDetailsModelClassObject=new TrainDetailsModel();
            trainDetailsModelClassObject.setTrainName(DetailsQuery.getString(1));
            trainDetailsModelClassObject.setTrainNUmber(DetailsQuery.getString(2));
            trainDetailsModelClassObject.setStartLocation(DetailsQuery.getString(3));
            trainDetailsModelClassObject.setEndLocation(DetailsQuery.getString(4));
            trainDetailsModelArrayListObject.add(trainDetailsModelClassObject);


        }

        return trainDetailsModelArrayListObject;
    }


}
