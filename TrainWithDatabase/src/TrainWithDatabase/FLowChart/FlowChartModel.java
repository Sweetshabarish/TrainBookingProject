package TrainWithDatabase.FLowChart;
//Select name,location,destination,date,phonenumber,trainnumber,pnrnumber
public class FlowChartModel {
    private String Name;
    private String Location;
    private String Date;
    private int PhoneNumber;
    private int TraiunNumber;
    private String PnrNumber;
    private String Destination;

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getName() {
        return Name;
    }

    public String getLocation() {
        return Location;
    }

    public String getDate() {
        return Date;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public int getTraiunNumber() {
        return TraiunNumber;
    }

    public String getPnrNumber() {
        return PnrNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setTraiunNumber(int traiunNumber) {
        TraiunNumber = traiunNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        PnrNumber = pnrNumber;
    }
}
