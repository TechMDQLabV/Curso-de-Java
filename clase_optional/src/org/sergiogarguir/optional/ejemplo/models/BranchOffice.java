package org.sergiogarguir.optional.ejemplo.models;

public class BranchOffice {
    private String name;
    private String geoX;
    private String geoY;

    public BranchOffice() {
    }

    public BranchOffice(String name, String geoX, String geoY) {
        this.name = name;
        this.geoX = geoX;
        this.geoY = geoY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeoX() {
        return geoX;
    }

    public void setGeoX(String geoX) {
        this.geoX = geoX;
    }

    public String getGeoY() {
        return geoY;
    }

    public void setGeoY(String geoY) {
        this.geoY = geoY;
    }

    @Override
    public String toString() {
        return "BranchOffice{" +
                "name='" + name + '\'' +
                ", geoX='" + geoX + '\'' +
                ", geoY='" + geoY + '\'' +
                '}';
    }
}
