package com.company;

import java.util.EventObject;

public class FormEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    private String name;
    private String occupation;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String pName, String pOccupation) {
        super(source);
        this.name = pName;

        this.occupation = pOccupation;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

}
