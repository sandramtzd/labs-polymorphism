public class Book extends Media {

    private String publisher;

    private String author;

    public Book (String title, String type, String genre, int releaseYear, boolean isNew, double cost, double sellPrice, String publisher, String author){
        super(title, type, genre, releaseYear, isNew, cost, sellPrice);
        this.publisher = publisher;
        this.author = author;

    }

    public String tellingStories(){
        return "I am not interactive but imaginative experience";
    }

    public boolean read(){
        return true;
    }

    public boolean signCopy(){
        return false;
    }


    public String changeChapter(int numChapter){
        return "Chapter " + numChapter;
    }

    //    GETTERS

    public String getTitle(){
        return this.title;
    }

    public String getType(){
        return this.type;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getReleaseYear(){
        return this.releaseYear;

    }

    public boolean bookIsNew(){
        return this.isNew;
    }

    public double getCost(){
        return this.cost;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public String getAuthor(){
        return this.author;
    }

    //    SETTERS

    public void setTitle(String title){
        this.title = title;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setGenre(String genre){
        this.genre = genre;

    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setNewStatus(boolean isNew){
        this.isNew = isNew;

    }

    public void setCost (double cost){
        this.cost = cost;
    }

    public void setSellPrice (double sellPrice){
        this.sellPrice = sellPrice;
    }

    public void setPublisher (String publisher){
        this.publisher = publisher;
    }

    public void setAuthor (String author){
        this.author = author ;
    }



}
