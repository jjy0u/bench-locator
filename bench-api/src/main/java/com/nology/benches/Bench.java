package com.nology.benches;

public class Bench {
    private long id;
    private String address;
    private String city;
    private String postcode;
    private String twentyFourHourAccess;
    private String view;
    private String accessibility;
    private String capacity;
    private String engravedMessage;
    private String memorialBench;

    public Bench() {
    }

    public Bench(long id, String address, String city, String postcode, String twentyFourHourAccess, String view, String accessibility, String capacity, String engravedMessage, String memorialBench) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.twentyFourHourAccess = twentyFourHourAccess;
        this.view = view;
        this.accessibility = accessibility;
        this.capacity = capacity;
        this.engravedMessage = engravedMessage;
        this.memorialBench = memorialBench;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getTwentyFourHourAccess() {
        return twentyFourHourAccess;
    }

    public void setTwentyFourHourAccess(String twentyFourHourAccess) {
        this.twentyFourHourAccess = twentyFourHourAccess;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getEngravedMessage() {
        return engravedMessage;
    }

    public void setEngravedMessage(String engravedMessage) {
        this.engravedMessage = engravedMessage;
    }

    public String getMemorialBench() {
        return memorialBench;
    }

    public void setMemorialBench(String memorialBench) {
        this.memorialBench = memorialBench;
    }
}
