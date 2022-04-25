package models;

import java.time.LocalDate;

import helpers.Enums.Species;

public class Pet extends Identifiable {
    private String name;
    private Species species;
    private double weight;
    private long chipId;
    private double height;
    private double width;
    private double length;
    private LocalDate birthDate;
    private User owner;

    public Pet(String name, Species species, double weight, long chipId, double height, double width, double length, LocalDate birthDate, User owner, String id) {
        super(id);
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.chipId = chipId;
        this.height = height;
        this.width = width;
        this.length = length;
        this.birthDate = birthDate;
        this.owner = owner;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return this.species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getChipId() {
        return this.chipId;
    }

    public void setChipId(long chipId) {
        this.chipId = chipId;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public User getOwner() {
        return this.owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
    
}
