import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    HotelBooking() {
        System.out.println("You are in default constructor.");
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        System.out.println("You are in parameterized constructor.");
        System.out.println(guestName + " will stay in " + roomType + " room for " + nights + " nights");
    }

    // Copy Constructor
    HotelBooking(HotelBooking booking) {
        guestName = booking.guestName;
        roomType = booking.roomType;
        nights = booking.nights;
        System.out.println("You are in copy Constructor.");
        System.out.println(guestName + " will stay in " + roomType + " room for " + nights + " nights");
    }
}

class Booking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the guest Name : ");
        String guestName = input.next();
        System.out.print("Enter the room Type : ");
        String roomType = input.next();
        System.out.print("Enter the nights you need to stay : ");
        int nights = input.nextInt();

        HotelBooking booking1 = new HotelBooking();

        HotelBooking booking2 = new HotelBooking(guestName, roomType, nights);

        HotelBooking booking3 = new HotelBooking(booking2);
    }
}
