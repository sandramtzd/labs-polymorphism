public abstract class Media {

    protected String title;
    protected String type;
    protected String genre;

    protected int releaseYear;

    protected boolean isNew;

    protected double cost;

    protected double sellPrice;

    public Media (String title, String type, String genre, int releaseYear, boolean isNew, double cost, double sellPrice){
        this.title = title;
        this.type = type;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.isNew = isNew;
        this.cost = cost;
        this.sellPrice = sellPrice;

    }

    public abstract String tellingStories();

    public double calculateMargin(){
        return this.sellPrice - this.cost;

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
    public boolean isNew(){
        return this.isNew;
    }

    public double getCost(){
        return this.cost;
    }

    public double getSellPrice(){
        return this.sellPrice;
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






}
