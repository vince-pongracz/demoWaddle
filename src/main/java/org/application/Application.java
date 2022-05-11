package org.application;

import com.google.gson.GsonBuilder;

import java.util.Calendar;

public class Application {

    public static void main(String[] args) {

        //Bug here, won't compile:
        System.out.println("Welcome in gradle");

        var ex = new ExampleClass(0, "0 Measurement", Calendar.getInstance().getTime());
        var builder = new GsonBuilder();
        var gsonRepresentation = builder.setPrettyPrinting().create();
        var json = gsonRepresentation.toJson(ex);

        System.out.println(json);
    }
}

