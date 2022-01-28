package com.nuchange.psiutil.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FormControl {
    private Integer id;
    private String type;
    private FormLabel label;
    //TODO: these were not used earlier therefore commenting out due to name conflict
    private FormControlProperty properties;
    private FormConcept concept;
    List<FormControl> controls;
    private Boolean addMore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FormConcept getConcept() {
        return concept;
    }

    public void setConcept(FormConcept concept) {
        this.concept = concept;
    }

    public List<FormControl> getControls() {
        return controls;
    }

    public void setControls(List<FormControl> controls) {
        this.controls = controls;
    }

    //TODO: these were not used earlier therefore commenting out due to name conflict

    public FormControlProperty getProperties() {
        return properties;
    }

    public void setProperties(FormControlProperty properties) {
        this.properties = properties;
    }

    /*public FormCotrolProperty getProperties() {
        return properties;
    }

    public void setProperties(FormCotrolProperty properties) {
        this.properties = properties;
    }*/

    public FormLabel getLabel() {
        return label;
    }

    public void setLabel(FormLabel label) {
        this.label = label;
    }

    public Boolean getAddMore() {
        return addMore;
    }

    public void setAddMore(Boolean addMore) {
        this.addMore = addMore;
    }
}
