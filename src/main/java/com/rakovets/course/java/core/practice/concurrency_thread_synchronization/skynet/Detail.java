package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.Objects;

public class Detail {
    @lombok.Getter
    private final DetailType detailType;

    public Detail(DetailType detailType) {
        this.detailType = detailType;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "detailType=" + detailType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Detail detail = (Detail) o;
        return detailType == detail.detailType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailType);
    }
}
