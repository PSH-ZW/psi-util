package com.nuchange.psiutil.model;

public class ObsType {

    private String uuid;
    private String controlType;
    private String parentType;
    private FormLabel label;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public FormLabel getLabel() {
        return label;
    }

    public void setLabel(FormLabel label) {
        this.label = label;
    }
}
