package ie.atu;

import java.text.NumberFormat;

public class Gamepass {
    public int gameId;
    public String name;
    public String description;
    public String cost;
    public String sizeGb;
    public String releaseDate;
    public String rating;
    public String language;
    protected static int count = 0;


    public Gamepass(){

    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getSizeGb() {
        return sizeGb;
    }

    public void setSizeGb(String sizeGb) {
        this.sizeGb = sizeGb;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Gamepass{" +
                "gameId=" + gameId +
                ", title='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", sizeGb=" + sizeGb +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating='" + rating + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    public void setCode(String gamepassCode) {
    }
    public static int getCount() {
        return count;
    }
}


