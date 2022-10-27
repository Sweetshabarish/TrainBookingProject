package TrainWithDatabase.BookingMethods;

import TrainWithDatabase.TrainConstants;
import TrainWithDatabase.TrainDetails.TrainDetailsController;
import TrainWithDatabase.TrainDetails.TrainDetailsMain;

import java.sql.SQLException;
import java.util.Scanner;
/*
This Class is created for accessing the booking method with some options
 */
public class BookingWorking {



    private Scanner sscannerClassObject = new Scanner(System.in);//Scanner oobject is created for getting the input from the user






    public void TrainCLassworkingmethod() throws SQLException {

        t:
        while (true) {
            System.out.println(TrainConstants.displayDesign);//It display the design

            System.out.println(TrainConstants.displayDesign);//It display the design
            TrainDetailsMain.trainDetailsExecution("Select * from traindetails ;");//This Class is appended from the TrainDetailsMain class,the send query will be executed amd show the all trains detaila
            System.out.println("1.BOOK ");//option one will for the booking method for train .
            System.out.println("2.Exit");//exits the booking process.
            System.out.println("---------------------------------------------------------");
            System.out.println();
            int choise = sscannerClassObject.nextInt();//getting the input form the user to run the methods

            switch (choise) {
                /*
                 * if case 1 means .traain 1 will activate to get the booking the process
                 */
                case 1: {
                    BookingWOrkingClassDataBase.BookingMethod();//THis method is appended from the BookingWorkingClassDabaBase Class ,where booking process will run
                    break;


                }
                case 2: {

                    break t;//break the loop




                }

            }
        }
    }
}