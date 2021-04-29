package com.rakovets.course.java.core.practice.jcf_set;

public class Client {
    private String login;
    private int password;

    public Client(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
