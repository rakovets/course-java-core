package com.rakovets.course.java.core.practice.lambda_expressions.TV;

public class ProjectTV {
    private String manufacture;
    private String modelName;
    private Integer yearOfRelease;
    private Integer diagonal;
    private Integer price;

    public ProjectTV(String manufacture, String modelName, Integer yearOfRelease, Integer diagonal, Integer price) {
        this.manufacture = manufacture;
        this.modelName = modelName;
        this.yearOfRelease = yearOfRelease;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModelName() {
        return modelName;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public Integer getDiagonal() {
        return diagonal;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TV  " + "Manufacture = " + manufacture
                + ", Model = " + modelName
                + ", Year of release = " + yearOfRelease
                + ", Diagonal = " + diagonal
                + ", Price = " + price;
    }
}
