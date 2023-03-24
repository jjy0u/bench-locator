package com.nology.benches;

public class Bench {
    private long id;
    private String address;
    private String city;
    private String postcode;
    private boolean twentyFourHourAccess;
    private String view;
    private boolean accessibility;
    private long capacity;
    private String engravedMessage;
    private boolean memorialBench;

    public Bench() {
    }

    public Bench(long id, String address, String city, String postcode, boolean twentyFourHourAccess, String view, boolean accessibility, long capacity, String engravedMessage, boolean memorialBench) {
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
}
