package TrainWithDatabase.DateAndSeastPackage;
/*
Model Class
 */
public class TrainDateModel {
    private String Date;
    private int Seats;

//getter methods
    public int getSeats() {
        return Seats;
    }

    public String getDate() {
        return Date;
    }
//setter methods
    public void setDate(String date) {
        Date = date;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }
}
