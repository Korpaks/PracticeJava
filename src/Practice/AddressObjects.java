package Practice;

public class AddressObjects {
    public static void main(String[] args) {
        //There is no no arg constructor so we have to give args
        AddressTask address = new AddressTask("some street", "Sant Barbara", "CA", "931127", "USA");
        System.out.println(address);

        //write data --> use setter
        address.setCity("Los Angeles");

        //read data -- use getter
        System.out.println(address.getCity());

        //make country name READ ONLY --> delete setter for country

        //make zip code Write only --> delete getter for zip code
    }
}
