package Train;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
/*
 * This class is created for storing the train details in the some methods.
 */
public class TrainStoringDetailsClass {

    //public TrainClass(String TrainName,String TrainStops[],String TrainNumber,String StartLocation,String EndLocation,String Date[])
    //ArrayList<Train.DateStroingClass2> object1=
    DateStroingClass object=new DateStroingClass();
    DateStroingClass objectone=new DateStroingClass();


    TrainClass venkatGiriExpress=new TrainClass("Venkatagiri Express","101001","BENGALURU","CHENNAI",object.Dateaddingmethod());//dateß
    TrainClass chatrapathiExprees=new TrainClass("Chatrapathi Express", "100101","Hubali","Yesvanthpuru",objectone.Dateaddingmethod());

    ArrayList<TrainClass> Arraylistobject=new ArrayList<>();
    ArrayList<TrainClass> AddList() {
        Arraylistobject.add(venkatGiriExpress);
        Arraylistobject.add(chatrapathiExprees);
        return Arraylistobject;
    }



}
