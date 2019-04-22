package com.sumon.firestoredemo.db;

import java.util.ArrayList;

public class DbHandler {
    private ArrayList<MyData> response;

    public DbHandler() {
    }

    public DbHandler(ArrayList<MyData> response) {
        this.response = response;
    }

    public ArrayList<MyData> getResponse() {
        return response;
    }

    public void setResponse(ArrayList<MyData> response) {
        this.response = response;
    }
}
