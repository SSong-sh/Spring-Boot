package com.test.bootjpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Table(name = "tblInfo")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Info {

    @Id
    private long seq;

    private String school;
    private String country;

    //자식이 부모를 참조
    @OneToOne
    @JoinColumn(name="seq")
    private Address address;


}
