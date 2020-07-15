public class Booking {
    private Bedroom bedroom;
    private int nights;

    public Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
    public int totalBill(){
        return bedroom.getNightRate() * this.nights;
    }
}
