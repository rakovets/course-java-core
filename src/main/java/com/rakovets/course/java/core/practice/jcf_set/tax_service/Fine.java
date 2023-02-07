package com.rakovets.course.java.core.practice.jcf_set.tax_service;

public class Fine {
    private String id;
    private Fines type;
    private Integer sum;
    private String fineDetails;

    public Fine(Fines type, Integer sum, String fineDetails) {
        this.type = type;
        this.sum = sum;
        this.fineDetails = fineDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fines getType() {
        return type;
    }

    public void setType(Fines type) {
        this.type = type;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public String getFineDetails() {
        return fineDetails;
    }

    public void setFineDetails(String fineDetails) {
        this.fineDetails = fineDetails;
    }
}
