
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int apartmentPrice;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.apartmentPrice = squareMeters * pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        return this.squareMeters>otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment){
        if(moreExpensiveThan(otherApartment)){
            return this.apartmentPrice - otherApartment.apartmentPrice;
        } else {
            return otherApartment.apartmentPrice - this.apartmentPrice;
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.apartmentPrice > otherApartment.apartmentPrice;
    }
    
}
