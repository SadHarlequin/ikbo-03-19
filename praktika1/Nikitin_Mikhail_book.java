package praktika1;

public class Nikitin_Mikhail_book {
    private String title;
    private int pages;
    private double price;
    private String author;

    public Nikitin_Mikhail_book(double price, String author, String title, int pages) {
        this.price = price;
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", price=" + price + ", pages=" + pages + '}';
    }
}
