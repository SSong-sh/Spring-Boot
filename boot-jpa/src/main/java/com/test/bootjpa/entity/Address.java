package com.test.bootjpa.entity;

import com.test.bootjpa.dto.AddressDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


//Entity
//- 데이터베이스의 테이블과 연결된 객체
@Entity
@Getter
@ToString
@Table(name = "tblAddress")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq_generator")
    @SequenceGenerator(name="address_seq_generator", sequenceName = "seqAddress" ,allocationSize =1 )
    private long seq;


    private String name;
    private Integer age;
    private String address;
    private String gender;

    //Address 하나가 여러개의 Memo
    @OneToMany
    @JoinColumn(name = "aseq")
    private List<Memo> memo;

    public static AddressDTO toDTO(Address address) {
        //엔티티 > DTO
        return AddressDTO.builder()
                .seq(address.getSeq())
                .name(address.getName())
                .age(address.getAge())
                .address(address.getAddress())
                .gender(address.getGender())
                .build();

    }

    public void updateAddress(String address, Integer age){
        this.address = address;
        this.age = age;
    }

}
