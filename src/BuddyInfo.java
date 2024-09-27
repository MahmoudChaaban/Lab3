public class BuddyInfo {

    // Instance variables for the BuddyInfo class
    private String name;
    private String address;
    private String phoneNumber;

    // Default constructor
    public BuddyInfo() {
        this.name = "Default Name";
        this.address = "Default Address";
        this.phoneNumber = "000-000-0000";
    }

    // Parameterized constructor
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for address
    public String getAddress() {
        return address;
    }

    // Getter method for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Main method
    public static void main(String[] args) {
        // Create a BuddyInfo object
        BuddyInfo buddy = new BuddyInfo("Matt", "121 Woodridge Crescent", "343 297 8757");

        // Display the BuddyInfo object’s name
        System.out.println("Hello " + buddy.getName());
    }
}