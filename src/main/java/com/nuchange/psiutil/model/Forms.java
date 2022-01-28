package com.nuchange.psiutil.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Forms {
    private String name;
    private String uuid;
    List<FormControl> controls;

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

    public List<FormControl> getControls() {
        return controls;
    }

    public void setControls(List<FormControl> controls) {
        this.controls = controls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Forms forms = (Forms) o;
        return uuid.equals(forms.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
