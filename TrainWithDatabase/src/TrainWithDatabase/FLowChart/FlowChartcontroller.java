package TrainWithDatabase.FLowChart;
//Select name,location,destination,date,phonenumber,trainnumber,pnrnumber

import java.util.ArrayList;

public class FlowChartcontroller {
    private static ArrayList<FlowChartModel> flowChartModelObject;
    private static FLowChartView flowChaartViewObject;

    public FlowChartcontroller(ArrayList<FlowChartModel> flowChartModelObject, FLowChartView flowChaartViewObject){
        this.flowChartModelObject=flowChartModelObject;
        this.flowChaartViewObject=flowChaartViewObject;
    }
    public void setName(String Name){
        flowChartModelObject.get(0).setName(Name);
    }
    public void setLocation (String Location){
        flowChartModelObject.get(0).setLocation(Location);
    }
    public void setDestination(String Destination){
        flowChartModelObject.get(0).setDestination(Destination);
    }
    public void setDate(String Date){
        flowChartModelObject.get(0).setDate(Date);
    }
    public void setPhoneNumber(int PhonmeNumber){
        flowChartModelObject.get(0).setPhoneNumber(PhonmeNumber);
    }
    public void setTrainNumber(int TrainNumber){
        flowChartModelObject.get(0).setTraiunNumber(TrainNumber);
    }
    public void setPnrNumber(String PnrNumber){
        flowChartModelObject.get(0).setName(PnrNumber);
    }

    public String getName(){
        return flowChartModelObject.get(0).getName();
    }

    public String getDestination(){
        return flowChartModelObject.get(0).getDestination();
    }

    public String getLocation(){
        return flowChartModelObject.get(0).getLocation();
    }
    public int getTraiNumber(){
        return flowChartModelObject.get(0).getTraiunNumber();
    }
    public String getLoaction(){
        return flowChartModelObject.get(0).getLocation();
    }
    public int getPhoneNumber(){
        return flowChartModelObject.get(0).getPhoneNumber();
    }

    public String getDate(){
        return flowChartModelObject.get(0).getDate();
    }

    public static void UpdateFlowChartView(ArrayList<FlowChartModel> flowChartModelObject){
        flowChaartViewObject.flowChartViewMethod(flowChartModelObject);
    }

}
