package TrainWithDatabase.FLowChart;

import TrainWithDatabase.FLowChart.FlowChaartViewClass;
import TrainWithDatabase.TrainConstants;
import TrainWithDatabase.TrainDetails.TrainDetailsMain;

import java.sql.SQLException;
import java.util.Scanner;

public class FlowChartClass {
    private  Scanner sscannerClassObject = new Scanner(System.in);
    public void methodForFlowChart() throws SQLException {
        t:while(true){
            System.out.println("1.Need to check");
            System.out.println("2.EXIT");
            TrainDetailsMain.trainDetailsExecution("Select * from traindetails ;");

            int choise=sscannerClassObject.nextInt();
            switch (choise){
                case 1: {
                    FlowChaartViewClass.displayTrainExpressPassangers();
                }
                break;

                case 2: {
                    break t;
                }






            }

        }
    }
}
