package br.com.kmis.uber;

public class Location {
    private double X;
    private double Y;
    private String title;
    private String uuid_motorista;

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUuid_motorista() {
        return uuid_motorista;
    }

    public void setUuid_motorista(String uuid_motorista) {
        this.uuid_motorista = uuid_motorista;
    }
}
