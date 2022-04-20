package com.nuchange.psiutil.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FormConcept {
    private String name;
    private String uuid;
    private String parentUuid;
    private Boolean addMore;
    private List<ConceptAnswer> answers;

    public List<ConceptAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<ConceptAnswer> answers) {
        this.answers = answers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getAddMore() {
        return addMore;
    }

    public void setAddMore(Boolean addMore) {
        this.addMore = addMore;
    }

    public String getParentUuid() {
        return parentUuid == null? "" : parentUuid;
    }

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }
}
