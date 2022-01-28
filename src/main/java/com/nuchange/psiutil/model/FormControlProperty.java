package com.nuchange.psiutil.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FormControlProperty {

    private Boolean mandatory;
    private Boolean notes;
    private Boolean addMore;
    private Boolean multiSelect;

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Boolean getNotes() {
        return notes;
    }

    public void setNotes(Boolean notes) {
        this.notes = notes;
    }

    public Boolean getAddMore() {
        return addMore;
    }

    public void setAddMore(Boolean addMore) {
        this.addMore = addMore;
    }

    public Boolean getMultiSelect() {
        return multiSelect;
    }

    public void setMultiSelect(Boolean multiSelect) {
        this.multiSelect = multiSelect;
    }
}
