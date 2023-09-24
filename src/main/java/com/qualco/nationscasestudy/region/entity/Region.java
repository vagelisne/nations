package com.qualco.nationscasestudy.region.entity;

import com.qualco.nationscasestudy.continent.entity.Continent;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "regions")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Region {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "region_id")
    private long id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "continent_id")
    private Continent continent;
}
