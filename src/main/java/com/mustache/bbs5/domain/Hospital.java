package com.mustache.bbs5.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nation_wide_hospitals") // hospital이라는 table이 아님
@Getter
@NoArgsConstructor
public class Hospital {
    @Id // GeneratedValue 안씀
    private Integer id; // Long -> BigInteger
    @Column(name = "hospital_name")
    private String name;
    @Column(name = "road_name_address")
    private String address;

    private String businessTypeName;

    @Column(name = "total_number_of_beds")
    private int beds;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;

    }
}
