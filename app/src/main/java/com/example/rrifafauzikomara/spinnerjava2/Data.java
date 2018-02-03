package com.example.rrifafauzikomara.spinnerjava2;

/**
 * Created by R Rifa Fauzi Komara on 10/01/2018.
 */

public class Data {
    private String id_kendaraan, kode_kendaraan;

    public Data() {
    }

    public Data(String id_kendaraan, String kode_kendaraan) {
        this.id_kendaraan = id_kendaraan;
        this.kode_kendaraan = kode_kendaraan;
    }

    public String getId() {
        return id_kendaraan;
    }

    public void setId(String id_kendaraan) {
        this.id_kendaraan = id_kendaraan;
    }

    public String getKendaraan() {
        return kode_kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kode_kendaraan = kendaraan;
    }

}

