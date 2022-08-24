package day30_inheritance.PhoneTask;

public class EBook extends Book {

    private String size;
    private int pages;


    public EBook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages<0){
            System.out.println("page can not set to "+ pages);

            System.exit(1);
        }
        this.pages = pages;
    }

    public void readBook(){
        System.out.println( getTitle()+" is a great book to read the "+ getAuthor()+ " is a famous writer.");
    }


}