package com.nuchange.psiutil.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ConceptAnswer {
    private String uuid;
    private FormConcept name;

    public FormConcept getName() {
        return name;
    }

    public void setName(FormConcept name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
