package org.example.pojo;

public class Wallet {
    private int uid;
    private double detail;
    private User user;

    public Wallet() {
    }

    public Wallet(int uid, double detail, User user) {
        this.uid = uid;
        this.detail = detail;
        this.user = user;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getDetail() {
        return detail;
    }

    public void setDetail(double detail) {
        this.detail = detail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "uid=" + uid +
                ", detail=" + detail +
                ", user=" + user +
                '}';
    }
}
