package com.example.bms_fair.models;

import com.example.bms_fair.models.enums.features;
import com.example.bms_fair.models.enums.seat_type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class audi extends  BaseModel{
    private String name;
    private int maxrows;
    private int maxcolumns;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    List<features> supportedfeatures;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    List<seat_type> listofseats;
    @ManyToOne
    private Theartres theatres;


}
