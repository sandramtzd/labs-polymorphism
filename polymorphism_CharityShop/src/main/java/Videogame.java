public class Videogame extends Media {

    private String softwareHouse;

    private String platform;

    public Videogame (String title, String type, String genre, int releaseYear, boolean isNew, double cost, double sellPrice, String softwareHouse, String platform){
        super(title, type, genre, releaseYear, isNew, cost, sellPrice);
        this.softwareHouse = softwareHouse;
        this.platform = platform;
    }

    public boolean play(){
        return true;
    }

    public String level(int level){
        return "You are on level " + level;
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

    public boolean videogameIsNew(){
        return this.isNew;
    }

    public double getCost(){
        return this.cost;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public String getSoftwareHouse(){
        return this.softwareHouse;
    }

    public String getPlatform(){
        return this.platform;
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

    public void setSoftwareHouse (String softwareHouse){
        this.softwareHouse = softwareHouse;
    }

    public void setPlatform (String platform){
        this.platform = platform;
    }

}
