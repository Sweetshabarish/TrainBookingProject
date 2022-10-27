package TrainWithDatabase.TrainDetails;

import java.sql.SQLException;
import java.util.ArrayList;

public class TrainDetailsController {
    private ArrayList<TrainDetailsModel> trainDetailsObject;
    private TrainDetailsView trainDetailsViewObject;

    public TrainDetailsController(ArrayList<TrainDetailsModel> trainDetailsObject, TrainDetailsView trainDetailsViewObject){
        this.trainDetailsObject=trainDetailsObject;
        this.trainDetailsViewObject=trainDetailsViewObject;
    }

    public void setTrainName(String Trainname){
        trainDetailsObject.get(0).setTrainName(Trainname);
    }
    public void setTrainNumber(String TrainNumber){
        trainDetailsObject.get(0).setTrainNUmber(TrainNumber);
    }
    public void setStratLocation(String stratLocation){
        trainDetailsObject.get(0).setStartLocation(stratLocation);
    }
    public void setEndLocation(String endLocation){
        trainDetailsObject.get(0).setEndLocation(endLocation);
    }
    public String getTrainName(){
        return trainDetailsObject.get(0).getTrainName();
    }
    public String getTrainNumber(){
        return trainDetailsObject.get(0).getTrainNUmber();
    }
    public String getStartLocation(){
        return trainDetailsObject.get(0).getStartLocation();
    }
    public String getEndLocation(){
        return trainDetailsObject.get(0).getEndLocation();
    }
    public void TrainDeatilsUpdate(ArrayList<TrainDetailsModel> trainDetailsModelObject) throws SQLException {
        trainDetailsViewObject.printTrainDetails(trainDetailsModelObject);
    }


}
