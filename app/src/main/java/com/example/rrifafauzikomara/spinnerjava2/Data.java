package com.example.rrifafauzikomara.spinnerjava2;

/**
 * Created by R Rifa Fauzi Komara on 10/01/2018.
 */

public class Data {
    private String id, kode_kendaraan;

    public Data() {
    }

    public Data(String id, String kode_kendaraan) {
        this.id = id;
        this.kode_kendaraan = kode_kendaraan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKendaraan() {
        return kode_kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kode_kendaraan = kendaraan;
    }

}

