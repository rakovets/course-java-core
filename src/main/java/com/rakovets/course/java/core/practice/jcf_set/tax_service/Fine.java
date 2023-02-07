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

    public Fine() {
    }

    @Override
    public String toString() {
        return this.type + " FINE: id " + this.id + " " + this.fineDetails + " " + this.sum + " BYN\n";
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected Fines getType() {
        return type;
    }

    protected void setType(Fines type) {
        this.type = type;
    }

    public Integer getSum() {
        return sum;
    }

    protected void setSum(Integer sum) {
        this.sum = sum;
    }

    public String getFineDetails() {
        return fineDetails;
    }

    protected void setFineDetails(String fineDetails) {
        this.fineDetails = fineDetails;
    }
}
