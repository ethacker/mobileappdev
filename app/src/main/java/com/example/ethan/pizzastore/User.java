package com.example.david.pizzastorecalc;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    String a;
    ArrayList<String> toppingsList = new ArrayList<String>();
    public User(String a) {
        super();
        this.a = a;


    }
}
