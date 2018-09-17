package com.liebersonsantos.apistarwarsmpv.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SwApiResult implements Parcelable{

    @SerializedName("title")
    private String title;
    @SerializedName("episodeId")
    private int episodeId;
    @SerializedName("openingCrawl")
    private String openingCrawl;
    @SerializedName("diretor")
    private String diretor;
    @SerializedName("producer")
    private String producer;
    @SerializedName("releaseDate")
    private String releaseDate;
    @SerializedName("characters")
    private List<String> characters;
    @SerializedName("planets")
    private List<String> planets;
    @SerializedName("starships")
    private List<String> starships;
    @SerializedName("vehicles")
    private List<String> vehicles;
    @SerializedName(" species")
    private List<String> species;
    @SerializedName("created")
    private String created;
    @SerializedName("edited")
    private String edited;
    @SerializedName("url")
    private String url;

    public SwApiResult() {
    }

    public SwApiResult(String title, int episodeId, String openingCrawl, String diretor, String producer, String releaseDate, List<String> characters, List<String> planets, List<String> starships, List<String> vehicles, List<String> species, String created, String edited, String url) {
        this.title = title;
        this.episodeId = episodeId;
        this.openingCrawl = openingCrawl;
        this.diretor = diretor;
        this.producer = producer;
        this.releaseDate = releaseDate;
        this.characters = characters;
        this.planets = planets;
        this.starships = starships;
        this.vehicles = vehicles;
        this.species = species;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    protected SwApiResult(Parcel in) {
        title = in.readString();
        episodeId = in.readInt();
        openingCrawl = in.readString();
        diretor = in.readString();
        producer = in.readString();
        releaseDate = in.readString();
        characters = in.createStringArrayList();
        planets = in.createStringArrayList();
        starships = in.createStringArrayList();
        vehicles = in.createStringArrayList();
        species = in.createStringArrayList();
        created = in.readString();
        edited = in.readString();
        url = in.readString();
    }

    public static final Creator<SwApiResult> CREATOR = new Creator<SwApiResult>() {
        @Override
        public SwApiResult createFromParcel(Parcel in) {
            return new SwApiResult(in);
        }

        @Override
        public SwApiResult[] newArray(int size) {
            return new SwApiResult[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeInt(episodeId);
        dest.writeString(openingCrawl);
        dest.writeString(diretor);
        dest.writeString(producer);
        dest.writeString(releaseDate);
        dest.writeStringList(characters);
        dest.writeStringList(planets);
        dest.writeStringList(starships);
        dest.writeStringList(vehicles);
        dest.writeStringList(species);
        dest.writeString(created);
        dest.writeString(edited);
        dest.writeString(url);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public void setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public List<String> getPlanets() {
        return planets;
    }

    public void setPlanets(List<String> planets) {
        this.planets = planets;
    }

    public List<String> getStarships() {
        return starships;
    }

    public void setStarships(List<String> starships) {
        this.starships = starships;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
