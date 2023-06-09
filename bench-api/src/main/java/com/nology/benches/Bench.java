package com.nology.benches;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bench {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String address1;
    private String address2;
    private String city;
    private String postcode;
    private boolean twentyFourHourAccess;
    private String view;
    private boolean accessibility;
    private long capacity;
    private String engravedMessage;
    private boolean memorialBench;
    private boolean shaded;
    private boolean picnicTable;
    private String openingTime;
    private String closingTime;
    private String description;
    private String benchImage;
    private String longitude;
    private String latitude;

    public Bench() {}

    public Bench(long id, String address1, String address2, String city, String postcode, boolean twentyFourHourAccess, String view, boolean accessibility, long capacity, String engravedMessage, boolean memorialBench, boolean shaded, boolean picnicTable, String openingTime, String closingTime, String description, String benchImage, String longitude, String latitude) {
        this.id = id;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postcode = postcode;
        this.twentyFourHourAccess = twentyFourHourAccess;
        this.view = view;
        this.accessibility = accessibility;
        this.capacity = capacity;
        this.engravedMessage = engravedMessage;
        this.memorialBench = memorialBench;
        this.shaded = shaded;
        this.picnicTable = picnicTable;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.description = description;
        this.benchImage = benchImage;
        this.longitude = longitude;
        this.latitude = latitude;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public boolean isTwentyFourHourAccess() {
        return twentyFourHourAccess;
    }

    public void setTwentyFourHourAccess(boolean twentyFourHourAccess) {
        this.twentyFourHourAccess = twentyFourHourAccess;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public boolean isAccessibility() {
        return accessibility;
    }

    public void setAccessibility(boolean accessibility) {
        this.accessibility = accessibility;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public String getEngravedMessage() {
        return engravedMessage;
    }

    public void setEngravedMessage(String engravedMessage) {
        this.engravedMessage = engravedMessage;
    }

    public boolean isMemorialBench() {
        return memorialBench;
    }

    public void setMemorialBench(boolean memorialBench) {
        this.memorialBench = memorialBench;
    }

    public boolean isShaded() {
        return shaded;
    }

    public void setShaded(boolean shaded) {
        this.shaded = shaded;
    }

    public boolean isPicnicTable() {
        return picnicTable;
    }

    public void setPicnicTable(boolean picnicTable) {
        this.picnicTable = picnicTable;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBenchImage() {
        return benchImage;
    }

    public void setBenchImage(String benchImage) {
        this.benchImage = benchImage;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}



