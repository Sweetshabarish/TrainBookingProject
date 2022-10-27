package TrainWithDatabase;

import TrainWithDatabase.BookingMethods.BookingWorking;
import TrainWithDatabase.FLowChart.FlowChartClass;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws ParseException, SQLException {
        Scanner scannerObject=new Scanner(System.in);
        t:while(true){
            System.out.println("1.Add Train Details");
            System.out.println("2.Add Date and Seats With Train Number");
            System.out.println("3.Book the ticket");
            System.out.println("4.View the Tickets Of Particular Train");
            System.out.println("5.Exit");
            int choise=scannerObject.nextInt();
            switch(choise){
                case 1:{
                    TrainDatabase trainClassObject=new TrainDatabase();
                    trainClassObject.TrainBookDetailsStoringDBL();
                    break;
                }
                case 2:{
                     DateSeats dateSeatsClassObject=new DateSeats();
                    DateSeats.methodForDateSeats();
                     break;
                }
                case 3:{
                    BookingWorking bookingWorkingClassObject=new BookingWorking();
                    bookingWorkingClassObject.TrainCLassworkingmethod();
                    break;
                }
                case 4:{
                    FlowChartClass flowChartClassObject=new FlowChartClass();
                    flowChartClassObject.methodForFlowChart();
                    break;
                }
                case 5:{
                    break t;
                }
            }

        }
    }
}
