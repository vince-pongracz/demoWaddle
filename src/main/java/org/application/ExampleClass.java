package org.application;

import java.util.Date;
import java.util.List;

public class ExampleClass {
    public ExampleClass(int ID, String name, Date captureDate) {
        this.ID = ID;
        Name = name;
        this.captureDate = captureDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Double> getExamples() {
        return examples;
    }

    public void setExamples(List<Double> examples) {
        this.examples = examples;
    }
    public Date getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(Date captureDate) {
        this.captureDate = captureDate;
    }


    private int ID;
    private String Name;
    private List<Double> examples;
    private Date captureDate;
}
