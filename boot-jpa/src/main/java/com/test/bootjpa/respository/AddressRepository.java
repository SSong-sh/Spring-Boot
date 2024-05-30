package com.test.bootjpa.respository;

import com.test.bootjpa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository <엔티티, 인티티 @ID 자료형>
public interface AddressRepository extends JpaRepository<Address, Long> {
}
