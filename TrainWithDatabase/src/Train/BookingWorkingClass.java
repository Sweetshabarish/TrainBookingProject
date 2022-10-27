package Train;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookingWorkingClass {
//	TrainBooking TrainObject=new TrainBooking(false);

    TrainStoringDetailsClass storingClassObject=new TrainStoringDetailsClass();//this storingCLassobject used for store the customer tickets

    DisplayTrainDeatilsClass dateTrainDetailsobject=new DisplayTrainDeatilsClass();//the object is created for displaying the train date details
    private Scanner sscannerClassObject=new Scanner(System.in);//Scanner oobject is created for getting the input from the user
    GeneratePnrNumber generateNumberObject=new GeneratePnrNumber();

    TrainDetailsDisplayClass trainDetailsDisplayClassObject=new TrainDetailsDisplayClass();// this object is created for displaying train details

    void TrainCLassworkingmethod() throws SQLException {

        t:while(true) {
            System.out.println("=========================================================");

            System.out.println();
            System.out.println("1.Venkatagiri Express");
            System.out.println("2.Chatrapathi Exprees");
            System.out.println("3.Exit");
            System.out.println("---------------------------------------------------------");
            System.out.println();
            int choise =sscannerClassObject.nextInt();
            switch(choise) {
                /*
                 * if case 1 means .traain 1 will activate to get the booking the process
                 */
                case 1:
                {
                    System.out.println("1:Venkatagiri Express");
                    TrainDetailsDisplayClass trainclassdisplayobject=new TrainDetailsDisplayClass();//this object class is used for the train deatils from to ,date etc
                    trainclassdisplayobject.venkatGiriExpressDisplay();;//this method will display above detals
                    /*
                     * below for loop is used for displaying the date and seats availablity
                     */
                    for(int index=0;index<dateTrainDetailsobject.trainObject.venkatGiriExpress.dateobject.size();index++) {
                        System.out.print( dateTrainDetailsobject.trainObject.venkatGiriExpress.dateobject.get(index).getDate());
                        System.out.println(" "+dateTrainDetailsobject.trainObject.venkatGiriExpress.dateobject.get(index).getSeats());

                    }
                    System.out.println("================================================");

                    ArrayList<TrainClass>arrayobject=trainclassdisplayobject.AddList();
                    t1:while(true) {
                        System.out.println("1:Want to Book");
                        System.out.println("2:Need to check another train?");
                        String PnrnUmberStoring=" ";//to store pnr number
                        int option=sscannerClassObject.nextInt();
                        if(option==1) {
                            System.out.println("Enter the Date");
                            String gettingdatefromuser=sscannerClassObject.next();//to get date from the user



                            /*
                             * below for loop works like
                             * it will check the input date from the user to the arraylist in DateDetailClass ,if the date present in the class,it will show the seats and we can book through it
                             */
                            for(int index=0;index<dateTrainDetailsobject.trainObject.venkatGiriExpress  .dateobject.size();index++) {
                                if(dateTrainDetailsobject.trainObject.venkatGiriExpress.getDateobject().get(index).getDate().equals(gettingdatefromuser)) {

                                    Integer gettigseatsfromdate = dateTrainDetailsobject.trainObject.venkatGiriExpress.getDateobject().get(index).getSeats();
                                    System.out.println("Enter the number of seats to book");
                                    int seatsnumber=sscannerClassObject.nextInt();
                                    if(seatsnumber<=4) {//the one user can book 4 ticket at a time,one pnr can contain 4 tickets
                                        PnrnUmberStoring =generateNumberObject.getPnrNumber();//gets a pnr number from pnrgenrating class
                                        gettigseatsfromdate=	gettigseatsfromdate-seatsnumber;
                                        for(int innerindex=0;innerindex<seatsnumber;innerindex++) {
                                            FileUserClass.AddlList(PnrnUmberStoring);//here the process will start.where this will ask the customer details and number of the tickets to book and store in ticket object
                                            TrainBookingDeatilsStroingModule.method();


                                        }

//						   TrainObject.setPnr(PnrnUmberStoring);
                                        System.out.println("Your Pnr Number:*Note iT*: "+PnrnUmberStoring);
//					     System.out.println(generatenumberobject.getPnr());

                                        dateTrainDetailsobject.trainObject.venkatGiriExpress.getDateobject().get(index).setSeats(gettigseatsfromdate);;
                                        //System.out.println(object1);
                                        System.out.println("Left Seats are: "+gettigseatsfromdate);

                                    }else {
                                        System.out.println("You can BOOK 4 seats at on time");
                                    }


                                    break;
                                }

                            }


                        }else if(option==2){
                            break t1;
                        }
                    }
                    break;
                }
                case 2:
                {
                    String PnrNumberStoring=" ";
                    System.out.println("2:Chatrapathi Express");
                    TrainDetailsDisplayClass trainclassdisplayobject=new TrainDetailsDisplayClass();
                    trainDetailsDisplayClassObject.chatrapathiExpressDisplay();
                    /*
                     * below for loop is used for displaying the date and seats availablity
                     */
                    for(int index=0;index<dateTrainDetailsobject.trainObject.chatrapathiExprees.dateobject.size();index++) {
                        System.out.print( dateTrainDetailsobject.trainObject.chatrapathiExprees.dateobject.get(index).getDate());
                        System.out.println(" "+dateTrainDetailsobject.trainObject.chatrapathiExprees.dateobject.get(index).getSeats());

                    }

                    ArrayList<TrainClass>arrayobject1=trainclassdisplayobject.AddList();
                    t1:while(true) {
                        System.out.println("1:Want to Book");
                        System.out.println("2:Need to check another train?");

                        int option=sscannerClassObject.nextInt();
                        if(option==1) {
                            System.out.println("Enter the Date");
                            String gettingdatefromuser=sscannerClassObject.next();


                            /*
                             * below for loop works like
                             * it will check the input date from the user to the arraylist in DateDetailClass ,if the date present in the class,it will show the seats and we can book through it
                             */


                            for(int index=0;index<dateTrainDetailsobject.trainObject.chatrapathiExprees.dateobject.size();index++) {
                                if(dateTrainDetailsobject.trainObject.chatrapathiExprees.getDateobject().get(index).getDate().equals(gettingdatefromuser)) {

                                    Integer gettigseatsfromdate = dateTrainDetailsobject.trainObject.chatrapathiExprees.getDateobject().get(index).getSeats();
                                    System.out.println("Enter the number of seats to book");
                                    int seatsnumber=sscannerClassObject.nextInt();
                                    if(seatsnumber<=4) {//the one user can book 4 ticket at a time,one pnr can contain 4 tickets
                                        PnrNumberStoring =generateNumberObject.getPnrNumber();//gets a pnr number from pnrgenrating class
                                        gettigseatsfromdate=	gettigseatsfromdate-seatsnumber;
                                        for(int innerindex=0;innerindex<seatsnumber;innerindex++) {
                                            FileUserClass.AddlList(PnrNumberStoring);//here the process will start.where this will ask the customer details and number of the tickets to book and store in the ticket object

                                        }
                                        System.out.println("Your PNR number : *Pls Note It*: "+PnrNumberStoring);
                                        //object1.put(gettingdatefromuser, gettigseatsfromdate);
                                        dateTrainDetailsobject.trainObject.chatrapathiExprees.getDateobject().get(index).setSeats(gettigseatsfromdate);;
                                        //System.out.println(object1);
                                        System.out.println("Left Seats are: "+gettigseatsfromdate);

                                    }else {
                                        System.out.println("You can BOOK 4 seats at on time");
                                    }


                                    break;
                                }


                            }


                        }else if(option==2) {
                            break t1;
                        }
                    }
                    break;
                }

                case 3:
                    break t;


            }

        }
    }
}
