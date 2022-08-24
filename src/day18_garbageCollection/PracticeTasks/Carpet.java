package day18_garbageCollection.PracticeTasks;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public void setInfo(double width, double length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {

            double total = 200 + (width * length * unitPrice);
            return isPersian ? total + 200 : total;
        }
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ",cost=" + calcCost()+
                '}';
    }
}


/*public int width;
    public int length;
    public int unitPrice;
    public boolean isPersian;

    public void setInfo(int width, int length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        if(!isPersian){
            return width*length* unitPrice;
        }else{
            return 200+(width*length*unitPrice);
        }
*/



