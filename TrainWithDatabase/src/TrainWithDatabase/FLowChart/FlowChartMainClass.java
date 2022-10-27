package TrainWithDatabase.FLowChart;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

////Select name,location,destination,date,phonenumber,trainnumber,pnrnumber
public class FlowChartMainClass {
    public  static ArrayList<FlowChartModel> displayPassangers(String disaplayPassangerObject) throws SQLException {

        ResultSet DetailsQuery = ExcetuteQureyThrowDatabase.connectExecuteQuery(disaplayPassangerObject);
        ArrayList<FlowChartModel> flowChartModelArrayListObject=new ArrayList<>();
        while (DetailsQuery.next()) {
            FlowChartModel chartModelObject=new FlowChartModel();

            chartModelObject.setName(DetailsQuery.getString(1));
            chartModelObject.setLocation(DetailsQuery.getString(2));
            chartModelObject.setDestination(DetailsQuery.getString(3));
            chartModelObject.setDate(DetailsQuery.getString(4));
            chartModelObject.setPhoneNumber(DetailsQuery.getInt(5));
            chartModelObject.setTraiunNumber(DetailsQuery.getInt(6));
            chartModelObject.setPnrNumber(DetailsQuery.getString(7));
            flowChartModelArrayListObject.add(chartModelObject);
        //    System.out.println(DetailsQuery.getString(1) + DetailsQuery.getString(2) + DetailsQuery.getString(3) + DetailsQuery.getString(4) + DetailsQuery.getInt(5) + DetailsQuery.getInt(6) + DetailsQuery.getString(7));

        }

        return flowChartModelArrayListObject;
    }
    public static void displayPassaengeQuery(String Query) throws SQLException {
        ArrayList<FlowChartModel> flowChartModelObject=displayPassangers(Query);

        FLowChartView fLowChartViewObject=new FLowChartView();
        FlowChartcontroller flowChartcontrollerObject=new FlowChartcontroller(flowChartModelObject,fLowChartViewObject);
        flowChartcontrollerObject.UpdateFlowChartView(flowChartModelObject);

    }
}
