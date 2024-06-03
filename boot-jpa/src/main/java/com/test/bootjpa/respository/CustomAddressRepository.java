package com.test.bootjpa.respository;

import com.querydsl.core.Tuple;
import com.test.bootjpa.dto.AddressDTO;
import com.test.bootjpa.entity.Address;

import java.util.List;

public interface CustomAddressRepository {
     Address findAddressByName(String name);

    List<Address> findAll();

    List<String> findName();

    List<Tuple> findNameAndAge();

    List<AddressDTO> findNameAndAddress();

    List<Address> findAddressByGender(String m);

    List<Address> findAddressOrderBy();

    List<Address> findAddressPagenation(int offset, int limit);

    int count();

    Tuple findAddressAggregation();

    List<Tuple> findAddressGroupByGender();
}