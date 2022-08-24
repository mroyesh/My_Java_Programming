package day30_inheritance.TaskSolutions.CryptoTask;

public class Doge extends CryptoToken{
    public Doge(double price, double quantity, double marketCap, double volume, double circulationsSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulationsSupply, isMineable);
    }
}
