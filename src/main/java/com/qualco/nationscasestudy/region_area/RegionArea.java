package com.qualco.nationscasestudy.region_area;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "region_areas")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RegionArea {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "region_name")
    private String name;

    @Column
    private double area;
}
