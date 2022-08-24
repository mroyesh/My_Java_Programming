package day30_inheritance.TaskSolutions.CryptoTask;

public class CryptoToken {
    private double price, quantity, marketCap, volume, circulationsSupply;
    private  boolean isMineable;

    public CryptoToken(double price, double quantity, double marketCap, double volume, double circulationsSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setVolume(volume);
        setCirculationsSupply(circulationsSupply);
        setMineable(isMineable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.out.println("Invalid price"+ price);
        }
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if (quantity<0){
            System.out.println("Quantity can not set to "+ quantity);
        }
        this.quantity = quantity;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if( marketCap==0){
            System.out.println("Market cup can not set "+ marketCap);
        }
        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCirculationsSupply() {
        return circulationsSupply;
    }

    public void setCirculationsSupply(double circulationsSupply) {
        this.circulationsSupply = this.circulationsSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice(){
        return  price* quantity;

    }

    public String toString() {
        return getClass().getSimpleName() +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulationsSupply=" + circulationsSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
