package org.sergiogarguir.optional.ejemplo.enums;

import java.util.Random;

public enum BranchOfficeEnum {
    MADERO("Puerto Madero", "X123123123", "Y123123123"),
    RETIRO("Retiro", "X13123132", "Y12313213"),
    OTRA( "Otra", "X154654", "Y1464546");



    private final String name;
    private final String geoX;
    private final String geoY;

    private BranchOfficeEnum(String name, String geoX, String geoY){
        this.name = name;
        this.geoX = geoX;
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
