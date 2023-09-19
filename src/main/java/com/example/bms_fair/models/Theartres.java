package com.example.bms_fair.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Theartres extends BaseModel
{
    private String name;
    private String address;

    @ManyToOne
    private city Cityid;

    @OneToMany(mappedBy = "theatres")
    List<audi> audiArrayList;
}
