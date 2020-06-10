package com.telenor.assignment.model;

import org.hibernate.annotations.common.reflection.XProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="property")
public class Property implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "propCatId")
    private PropertyCategory propCatId;


    @Column (name = "property")
    private String property;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PropertyCategory getPropCatId() {
        return propCatId;
    }

    public void setPropCatId(PropertyCategory propCatId) {
        this.propCatId = propCatId;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", propCatId=" + propCatId +
                ", property='" + property + '\'' +
                '}';
    }
}
