package TrainWithDatabase.FLowChart;

import TrainWithDatabase.TrainConstants;

import java.util.ArrayList;

public class FLowChartView {
    public static void flowChartViewMethod(ArrayList<FlowChartModel> flowChartModelObject){
        for(FlowChartModel flowChartModelForloopObject:flowChartModelObject) {
            System.out.println(TrainConstants.displayDesign);
            System.out.println("NAME: " + flowChartModelForloopObject.getName());
            System.out.println("LOCATION: " + flowChartModelForloopObject.getLocation());
            System.out.println("DESTINATION: " + flowChartModelForloopObject.getDestination());
            System.out.println("DATE: " +flowChartModelForloopObject.getDate() );
            System.out.println("PHONE NUMBER: " + flowChartModelForloopObject.getPhoneNumber());
            System.out.println("TRAIN NUMBER: " + flowChartModelForloopObject.getTraiunNumber());
            System.out.println("PNR NUMBER: " + flowChartModelForloopObject.getPnrNumber());
            System.out.println(TrainConstants.displayDesign);
        }
    }


}
