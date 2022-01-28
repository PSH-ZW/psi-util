package com.nuchange.psiutil.model;

import java.util.ArrayList;
import java.util.List;

public class FormTable {

    private String name;
    private List<FormConcept> concepts;
    private FormControlProperty properties;

    public FormTable(String name) {
        this.name = name;
        concepts = new ArrayList<FormConcept>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FormConcept> getConcepts() {
        return concepts;
    }

    public void setConcepts(List<FormConcept> concepts) {
        this.concepts = concepts;
    }

    public FormControlProperty getProperties() {
        return properties;
    }

    public void setProperties(FormControlProperty properties) {
        this.properties = properties;
    }
}
