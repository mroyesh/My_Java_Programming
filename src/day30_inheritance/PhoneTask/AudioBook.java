package day30_inheritance.PhoneTask;

public class AudioBook  extends  Book{

    private String length, narrator;


    public AudioBook(String title, String type, String author, double price, String length, String narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {

        this.length = length;
    }

    public String getNarrator() {

        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String toString() {
        return getClass().getSimpleName() +
                "length='" + length + '\'' +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
