class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Booked";
        this.price = 0.0;
    }

    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers");
        ticket.bookTicket("A10", 12.5);
        ticket.displayTicketDetails();
    }
}
