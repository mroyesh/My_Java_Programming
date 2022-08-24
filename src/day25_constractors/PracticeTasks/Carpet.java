package day25_constractors.PracticeTasks;

public class Carpet {
    public static void main(String[] args) {

    }
    public int width;
    public int length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        double totalPrice= (width*length)*unitPrice;
        if( isPersian ) totalPrice+=200;
        return totalPrice;

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total price is=" +calcCost() +
                '}';
    }
}
