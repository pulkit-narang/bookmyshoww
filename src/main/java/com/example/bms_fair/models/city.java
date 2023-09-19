package com.example.bms_fair.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class city extends BaseModel{
private String name;
@OneToMany(mappedBy = "Cityid")
List<Theartres> listoftheatres;


}
