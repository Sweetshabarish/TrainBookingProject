package TrainWithDatabase.TrainDetails;
//        ViewClassForTrainDeatils.ExecuteQuery("Select trainname,trainnumber,startlocation,endlocation from traindetails where trainnumber='101101';");
public class TrainDetailsModel {
    private String trainName;
    private String trainNUmber;
    private String startLocation;
    private String endLocation;

    public String getTrainName() {
        return trainName;
    }

    public String getTrainNUmber() {
        return trainNUmber;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setTrainNUmber(String trainNUmber) {
        this.trainNUmber = trainNUmber;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }
}
