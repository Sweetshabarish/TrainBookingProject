package TrainWithDatabase.BookingMethods;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;
import TrainWithDatabase.DateAndSeastPackage.DateMain;
import TrainWithDatabase.DatabasePackage.DateStoreDetailsDatabaseExcecution;
import TrainWithDatabase.FileUserDatabase;
import TrainWithDatabase.PnrNumber;
import TrainWithDatabase.TrainConstants;
import TrainWithDatabase.TrainDetails.TrainDetailsMain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public  class BookingWOrkingClassDataBase {
    private static Scanner sscannerClassObject = new Scanner(System.in);//Scanner oobject is created for getting the input from the user

    static PnrNumber generateNumberObject = new PnrNumber();//getting this object for generaitng the pnrnumber
    public static String TrainNumber;//Getting train Number from thr user

    public static void BookingMethod() throws SQLException {

        System.out.println(TrainConstants.enterTheTrainNumber);//Took from the train constant class for entering the train number
        TrainNumber = sscannerClassObject.next();//getting train number form the user
          ResultSet resultSetObjectForDateCheck = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select * from traindetails;");

          while (resultSetObjectForDateCheck.next()) {
              if (TrainNumber.equals(resultSetObjectForDateCheck.getString(2))) {
                  System.out.println(TrainConstants.displayDesign);//display the desigin from the trainconstants class
                  System.out.println();
                  TrainDetailsMain.trainDetailsExecution("Select trainname,trainnumber,startlocation,endlocation from traindetails where trainnumber='" + TrainNumber + "';");//the query will passed to TrainDetailClass where query will execute and gives output.

                  System.out.println();
                  System.out.println(TrainConstants.displayDesign);
                  System.out.println(TrainConstants.dateAndTimeDisplay);//display  date and time constatnt from the train constants
                  System.out.println("__________________________");

                  DateMain.dateEexcutionMethod("Select date,seats from datedetails where trainnumber='" + TrainNumber + "'; ");//the Qury is passed Date Main class ,where the Query will execute,and show the date ,seats of the particular train ,thorugh customer input
                  System.out.println(TrainConstants.displayDesign);

                  System.out.println(TrainConstants.displayDesign);
                  t1:
                  while (true) {
                      System.out.println("1:Want to Book");
                      System.out.println("2:Need to check another train?");

                      String PnrnUmberStoring = " ";//to store pnr number
                      int option = sscannerClassObject.nextInt();
                      if (option == 1) {


                          System.out.println(TrainConstants.enterTheDate);
                          String gettingdatefromuser = sscannerClassObject.next();//to get date from the user
                          ResultSet resultSetObject = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select * from datedetails;");
                          int StoredSeats = 0;
                          while (resultSetObject.next()) {
                              if (gettingdatefromuser.equals(resultSetObject.getString(3)) && TrainNumber.equals(resultSetObject.getString(1))) {
                                  ResultSet seats = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select seats from datedetails where trainnumber='" + TrainNumber + "' and date='" + gettingdatefromuser + "' ;");
                                  while (seats.next()) {
                                      StoredSeats = seats.getInt(1);
                                  }
                                  System.out.println(TrainConstants.enterNumberofSeats);
                                  int seatsnumber = sscannerClassObject.nextInt();
                                  if (seatsnumber <= 4) {//the one user can book 4 ticket at a time,one pnr can contain 4 tickets

                                      PnrnUmberStoring = CheckPnrNumber.checkPnrNumber(generateNumberObject.getPnrNumber());//gets a pnr number from pnrgenrating class and it will check wheater pnr generated is already exist or not.

                                      StoredSeats = StoredSeats - seatsnumber;
                                      for (int innerindex = 0; innerindex < seatsnumber; innerindex++) {
                                          FileUserDatabase.AddlList(PnrnUmberStoring);//here the process will start.where this will ask the customer details and number of the tickets to book and store in ticket object
                                          TrainBookingDeatilsStroingModuleDatabase.methodForTrainBooking();

                                      }

//						   TrainObject.setPnr(PnrnUmberStoring);
                                      System.out.println(TrainConstants.yourPnrNumber + PnrnUmberStoring);
                                      System.out.println(TrainConstants.leftSeatsAre + StoredSeats);
                                      String p = "UPDATE datedetails SET seats = " + StoredSeats + " WHERE date='" + gettingdatefromuser + "' and trainnumber='" + TrainNumber + "';";
                                      DateStoreDetailsDatabaseExcecution.dateStoreDetails(p);
                                  } else {
                                      System.out.println(TrainConstants.youCanBook$Tickets);
                                  }

                              }


                          }
                          break;


                      }


                      if (option == 2) {
                          break t1;
                      }
                  }
              }
              else {
                  System.out.println("Please enter the train number as mentioned");
                  break;
              }
          }

        }
    }





