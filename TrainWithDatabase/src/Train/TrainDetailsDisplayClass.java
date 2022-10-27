package Train;

import java.util.ArrayList;
import java.util.Date;
/*
 * This Class is created for displaying the Train1details and ther dates
 */
public class TrainDetailsDisplayClass {



    DateStroingClass dateCLassObject=new DateStroingClass();




    TrainClass venkatGiriExpress=new TrainClass(Constants.VENKATGIRI_EXPRESS,"101001","BENGALURU","CHENNAI",dateCLassObject.Dateaddingmethod());
    TrainClass chatrapathiExpress=new TrainClass(Constants.CHATRAPATHI_EXPRESS, "100101","Hubali","Yesvanthpuru",dateCLassObject.Dateaddingmethod());


    ArrayList<TrainClass> Arraylistobject=new ArrayList<>();
    ArrayList<TrainClass> AddList() {

        Arraylistobject.add(venkatGiriExpress);
        Arraylistobject.add(chatrapathiExpress);

        return Arraylistobject;
    }


    void venkatGiriExpressDisplay() {
        System.out.println("================================================");
        System.out.println();
        System.out.println("Train Name: "+venkatGiriExpress.getTrainName());
        System.out.println("Train Number: "+venkatGiriExpress.getTrainNumber());
        System.out.println("Starting Location: "+venkatGiriExpress.getStartLocation());
        System.out.println("EndLocation: "+venkatGiriExpress.getEndLocation());

        System.out.println();
        System.out.println("================================================");
    }
    void chatrapathiExpressDisplay() {
        System.out.println("================================================");
        System.out.println();
        System.out.println("Train Name: "+chatrapathiExpress.getTrainName());
        System.out.println("Train Number: "+chatrapathiExpress.getTrainNumber());
        System.out.println("Starting Location: "+chatrapathiExpress.getStartLocation());
        System.out.println("EndLocation: "+chatrapathiExpress.getEndLocation());

        System.out.println();
        System.out.println("================================================");

    }


}
