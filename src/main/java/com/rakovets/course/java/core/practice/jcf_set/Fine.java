package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Objects;

public class Fine {
    private long id;
    private User user;
    private Region region;
    private FineType fineType;

    public Fine(User user, Region region, FineType fineType) {
        this.user = user;
        this.region = region;
        this.fineType = fineType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public FineType getFineType() {
        return fineType;
    }

    public void setFineType(FineType fineType) {
        this.fineType = fineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fine fine = (Fine) o;
        return id == fine.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Fine{" +
                "id=" + id +
                ", person=" + user +
                ", region=" + region +
                ", typesFines=" + fineType +
                '}';
    }
}
