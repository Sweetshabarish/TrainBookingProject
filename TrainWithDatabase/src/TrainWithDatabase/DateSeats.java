package TrainWithDatabase;

import TrainWithDatabase.DatabasePackage.DateStoreDetailsDatabaseExcecution;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class DateSeats {
    Scanner scannerObject=new Scanner(System.in);
    static String date;
    static int seats;
    static String TrainNumber;
    public DateSeats() throws ParseException {
        setTrainNumber();
        setDate();

        setSeats();

    }

    public String getDate() {
        return date;
    }

    public void setDate() throws ParseException {
        System.out.println("Eneter the date: ");
         date=scannerObject.next();

    }

    public int getSeats() {
        return seats;
    }

    public void setSeats() {
      System.out.println("Enter the sets: ");
      seats=scannerObject.nextInt();
    }
    public void setTrainNumber(){
        System.out.println("Enter the TrainNumber");
        TrainNumber=scannerObject.nextLine();

    }
    static void methodForDateSeats() throws SQLException {


        String p = "insert into datedetails(TrainNumber,Date,Seats)values('" + TrainNumber + "','" + date + "','" + seats + "')";
        DateStoreDetailsDatabaseExcecution.dateStoreDetails(p);
    }
}
