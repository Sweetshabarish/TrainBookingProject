package TrainWithDatabase.FLowChart;


import java.sql.SQLException;
import java.util.Scanner;

public class FlowChaartViewClass {
    public static void displayTrainExpressPassangers() throws SQLException {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("Pls Enter the Train number need to check");
        String trainFromTheUser=scannerObject.next();
        FlowChartMainClass.displayPassaengeQuery(" Select name,location,destination,date,phonenumber,trainnumber,pnrnumber from userdetails where trainnumber='"+trainFromTheUser+"';");

    }




}
