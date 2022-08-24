package day28_encapsulation.PracticeTasks;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if ( name.isEmpty() || name.isBlank() ) {
            System.out.println("name can not be blank or empty");
            System.exit(1);
        } else {
            for (int i = 0; i < name.length(); i++) {
                if ( !Character.isLetterOrDigit(name.charAt(i))
                        && !name.substring(i, i + 1).equals(" ") || !Character.isLetter(name.charAt(0))){
                    System.err.println("Invalid name entry "+name);
                    System.exit(1);
                }
            }
        }


        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if ( unitPrice < 0 ) {
            System.err.println("Invalid entry for unit price: "+unitPrice);
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            System.err.println("Quantity can not be negative" +quantity);
            System.exit(1);
        }else if(name.equalsIgnoreCase("toilet paper")&& quantity>1){
            System.err.println("limited one per person");
            System.exit(1);

        }



        this.quantity = quantity;
    }



    public double calcCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + getName() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                ", Total Cost=" + calcCost() +
                '}';
    }
}
