package day30_inheritance.PhoneTask;

public class Book {

    private String title, Type, author;
    private double price;


    public Book(String title, String type, String author, double price) {
        setTitle(title);
        setTitle(type);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price<0){
            System.out.println("Invalid price "+ price);
            System.exit(1);
        }
        this.price = price;
    }

    public String toString() {
        return getClass().getSimpleName() +
                "title='" + title + '\'' +
                ", Type='" + Type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
