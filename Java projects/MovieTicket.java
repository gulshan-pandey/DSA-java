public class MovieTicket {

    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;

        // Set costPerTicket based on movieId
        switch (movieId) {
            case 111:
                costPerTicket = 7;
                break;
            case 112:
                costPerTicket = 8;
                break;
            case 113:
                costPerTicket = 8.5;
                break;
            default:
                // Throw an exception or handle invalid movieId here
                System.out.println("Invalid movieId");
        }
    }

    public double calculateTotalAmount() {
        double totalBeforeTax = costPerTicket * noOfSeats;
        double tax = totalBeforeTax * 0.02;
        double totalAmount = totalBeforeTax + tax;
        return Math.round(totalAmount);
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket(111, 2);
        System.out.println("Total amount for ticket1: $" + ticket1.calculateTotalAmount());

        MovieTicket ticket2 = new MovieTicket(112, 3);
        System.out.println("Total amount for ticket2: $" + ticket2.calculateTotalAmount());
    }
}
