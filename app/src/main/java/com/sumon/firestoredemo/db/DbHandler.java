package com.sumon.firestoredemo.db;

import java.util.ArrayList;

public class DbHandler {
    private ArrayList<MyData> myDataArrayList;

    public DbHandler(ArrayList<MyData> myDataArrayList) {

        this.myDataArrayList = myDataArrayList;
    }

    public DbHandler() {
    }

    public ArrayList<MyData> getMyDataArrayList() {
        return myDataArrayList;
    }

    public void setMyDataArrayList(ArrayList<MyData> myDataArrayList) {
        this.myDataArrayList = myDataArrayList;
    }
}
