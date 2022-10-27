package TrainWithDatabase;
import TrainWithDatabase.BookingMethods.TrainBookingDeatilsStroingModuleDatabase;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * This is File USer class where we going to store the deatils of each customer and going to display it when another class is called that method
 */
public class FileUserDatabase {
    /*
     * Create arraylist object for storing the deatils
     */
    static ArrayList<TrainBookingDeatilsStroingModuleDatabase> arraylistobject=new ArrayList<>();
    static Scanner scannerobject=new Scanner(System.in);
    ArrayList<TrainBookingDeatilsStroingModuleDatabase> getUserDetails() {
        return arraylistobject;
    }

    public static  ArrayList<TrainBookingDeatilsStroingModuleDatabase> AddlList(String pnr) {//getting value from the ticket booking class for storing the pnr number for particulur user

        /*
         * Pnr number object is created for storing the pnr number in trainbooking class through arrayobject.
         */
        TrainBookingDeatilsStroingModuleDatabase pnrNumber = new TrainBookingDeatilsStroingModuleDatabase(true);
        pnrNumber.setPnr(pnr);
        arraylistobject.add(pnrNumber);


        return arraylistobject;


    }
    static void FileDisplay() {
        AddlList(null);


    }


}
