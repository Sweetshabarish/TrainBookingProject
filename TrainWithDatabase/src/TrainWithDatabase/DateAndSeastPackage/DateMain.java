package TrainWithDatabase.DateAndSeastPackage;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DateMain {
public static void dateEexcutionMethod(String Query) throws SQLException {

    ArrayList<TrainDateModel> dateModelObject=trianDateDetails(Query);
    ViewClassForTrainDateDetails viewDateObject=new ViewClassForTrainDateDetails();
    TrainDateController dateControllerClassObject=new TrainDateController(dateModelObject,viewDateObject);
    dateControllerClassObject.updateView(dateModelObject);




}

    public static ArrayList<TrainDateModel> trianDateDetails(String query) throws SQLException {

        ResultSet DateQuery= ExcetuteQureyThrowDatabase.connectExecuteQuery(query);
        ArrayList<TrainDateModel> trainDateModelArrayListObject=new ArrayList<>();
        while(DateQuery.next()){
            TrainDateModel dateModelObject=new TrainDateModel();
            dateModelObject.setDate(DateQuery.getString(1));
            dateModelObject.setSeats(DateQuery.getInt(2));
            trainDateModelArrayListObject.add(dateModelObject);

        }
        return trainDateModelArrayListObject;
    }
}
