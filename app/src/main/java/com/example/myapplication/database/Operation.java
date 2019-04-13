package com.example.myapplication.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Operation {
    @PrimaryKey
    public long id;

    public Type type;

    public long date;

    public float cost;
}
