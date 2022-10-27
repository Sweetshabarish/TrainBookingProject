package TrainWithDatabase.DateAndSeastPackage;

import java.sql.SQLException;
import java.util.ArrayList;
/*
THis is the class where model and  view class will combined together to execute.
View Class -> ViewClassForTrainDateDetails;
Model Class-> TrainDateModel
 */
public class TrainDateController {

        private ArrayList<TrainDateModel> dateModel;
        private ViewClassForTrainDateDetails dateView;

        public TrainDateController(ArrayList<TrainDateModel> dateModel, ViewClassForTrainDateDetails dateView){
            this.dateModel = dateModel;
            this.dateView = dateView;
        }

        public void setDate(String date){
            dateModel.get(0).setDate(date);
        }

        public String getDate(){
            return dateModel.get(0).getDate();
        }

        public void setSeats(int seats){
            dateModel.get(0).setSeats(seats);
        }

        public int getSeats(){
            return dateModel.get(0).getSeats();
        }

        public void updateView( ArrayList<TrainDateModel> trainDateModelArrayListObject) throws SQLException {
            dateView.trainDateDetailsViewMethod(trainDateModelArrayListObject);
        }
    }

