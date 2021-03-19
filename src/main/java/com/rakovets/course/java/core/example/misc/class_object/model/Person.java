package com.rakovets.course.java.core.example.misc.class_object.model;

public class Person implements Cloneable {
    private final String firstname;
    private final String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return firstname + ' ' + lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstname != null ? !firstname.equals(person.firstname) : person.firstname != null) return false;
        return lastname != null ? lastname.equals(person.lastname) : person.lastname == null;
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() { // @Deprecated(since="9")
        System.out.println(this.toString());
        System.out.println("Call method: finalize()");
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        super.clone();
        return new Person(this.firstname, this.lastname);
    }
}
