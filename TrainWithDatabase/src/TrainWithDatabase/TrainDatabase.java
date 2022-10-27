package TrainWithDatabase;

import TrainWithDatabase.DatabasePackage.TrainStroreDetailsDatabseExcecution;

import java.sql.SQLException;
import java.util.Scanner;
/*
 * this module is created for creating the structure for getting the train deatils
 */

public class TrainDatabase {
    Scanner scannerCLasssObject=new Scanner(System.in);
    public String TrainName;

    public String TrainNumber;
    String StartLocation;
    String EndLocation;

    //ArrayList<TrainBookingDeatilsStroingModule> Tickets;
    //ArrayList<TrainBookingDeatilsStroingModule> VenkatGririExpressTickets;
    //ArrayList<TrainBookingDeatilsStroingModule> ChatraPathiExpressTickets;

    //int seats;

    public TrainDatabase() {
        setTrainName();
        setTrainNumber();
        setStartLocation();
       setEndLocation();
        //	this.Tickets=arrayList;
//		this.ChatraPathiExpressTickets=ChatraPathiExpressTickets;
//		this.VenkatGririExpressTickets=VenkatGririExpressTickets;
//




    }


    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName() {
        System.out.println("Enter the Train Name: ");
        TrainName = scannerCLasssObject.nextLine();
    }





    public String getTrainNumber() {
        return TrainNumber;
    }

    public void setTrainNumber() {

        System.out.println("Enter the Train Number");
        TrainNumber = scannerCLasssObject.next();
    }

    public String getStartLocation() {
        return StartLocation;
    }

    public void setStartLocation() {
        System.out.println("Enter the Start Location");
        StartLocation = scannerCLasssObject.next();
    }

    public String getEndLocation() {
        return EndLocation;
    }

    public void setEndLocation() {
        System.out.println("Enter the End Location: ");
        EndLocation = scannerCLasssObject.next();
    }








//	public ArrayList<TrainBookingDeatilsStroingModule> getVenkatGririExpressTickets() {
//		return VenkatGririExpressTickets;
//	}
//
//
//	public void setVenkatGririExpressTickets(ArrayList<TrainBookingDeatilsStroingModule> venkatGririExpressTickets) {
//		VenkatGririExpressTickets = venkatGririExpressTickets;
//	}
//
//
//	public ArrayList<TrainBookingDeatilsStroingModule> getChatraPathiExpressTickets() {
//		return ChatraPathiExpressTickets;
//	}
//
//
//	public void setChatraPathiExpressTickets(ArrayList<TrainBookingDeatilsStroingModule> chatraPathiExpressTickets) {
//		ChatraPathiExpressTickets = chatraPathiExpressTickets;
//	}
//

//	public ArrayList<TrainBookingDeatilsStroingModule> getTickets() {
//		return Tickets;
//	}
//
//
//	public void setTickets(ArrayList<TrainBookingDeatilsStroingModule> tickets) {
//		Tickets = tickets;
//	}


    @Override
    public String toString() {
        return "TrainName=" + TrainName +"\n"+
                "TrainNumber="+ TrainNumber+"\n" +
                "StartLocation=" + StartLocation +"\n "+"EndLocation=" + EndLocation  ;
    }

    void TrainBookDetailsStoringDBL() throws SQLException {
        TrainStroreDetailsDatabseExcecution.trainStoreDetails("insert into TrainDetails(TrainName,TrainNumber,StartLocation,EndLocation)values('"+ TrainName+"','"+TrainNumber+"','"+StartLocation+"','"+EndLocation+"')");
    }



}
