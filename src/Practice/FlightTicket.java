package Practice;

public class FlightTicket {

    String type;
    String departureLocation;
    String arrivalLocation;

    public FlightTicket(String type, String departureLocation, String arrivalLocation) {
        setType(type);
        setDepartureLocation(departureLocation);
       setArrivalLocation(arrivalLocation);
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("First") || type.equalsIgnoreCase("Bussines") || type.equalsIgnoreCase("economy")){
            this.type = type;
        }
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
}
