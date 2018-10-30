package com.example.amikom.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Person {
    private int idPerson;
    private String nama;
    private String alamat;
    private String email;
    private int jenisKelamin;
    private long nomerHp;
    private long nomerWa;
    private boolean isDosen;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(int jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public long getNomerHp() {
        return nomerHp;
    }

    public void setNomerHp(long nomerHp) {
        this.nomerHp = nomerHp;
    }

    public long getNomerWa() {
        return nomerWa;
    }

    public void setNomerWa(long nomerWa) {
        this.nomerWa = nomerWa;
    }

    public boolean isDosen() {
        return isDosen;
    }

    public void setDosen(boolean dosen) {
        isDosen = dosen;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
}
