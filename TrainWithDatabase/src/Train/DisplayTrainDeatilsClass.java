package Train;
/*
 * This class is created for displaying the train name and deatils in main class
 */
public class DisplayTrainDeatilsClass {
    TrainStoringDetailsClass trainObject=new TrainStoringDetailsClass();
    void dsiplay() {
        System.out.println("================================================");
        System.out.println("               TRAIN NAMES");
        System.out.println("               ------------");
        System.out.println("================================================");
        System.out.println();
        System.out.println("Train Name: "+trainObject.venkatGiriExpress.getTrainName());
        System.out.println("Train Number: "+trainObject.venkatGiriExpress.getTrainNumber());
        System.out.println("Starting Location: "+trainObject.venkatGiriExpress.getStartLocation());
        System.out.println("EndLocation: "+trainObject.venkatGiriExpress.EndLocation);

        System.out.println();
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println();
        System.out.println("Train Name: "+trainObject.chatrapathiExprees.getTrainName());
        System.out.println("Train Number: "+trainObject.chatrapathiExprees.getTrainNumber());
        System.out.println("Starting Location: "+trainObject.chatrapathiExprees.getStartLocation());
        System.out.println("EndLocation: "+trainObject.chatrapathiExprees.EndLocation);

        System.out.println();
        System.out.println("================================================");
    }

}