package com.test.bootjpa.controller;


import com.test.bootjpa.entity.Address;
import com.test.bootjpa.respository.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class AddressController {

    @Autowired
    private final AddressRepository addressRepository;

    @GetMapping("/m01.do")
    public String m01(Model model) {

        //[C]RUD
        //-레코드 추가하기
        //- 추가할 레코드의 정보 > 엔티티 객체를 생성하기

        Address address = Address.builder()
                .name("꿀꿀이")
                .age(5)
                .address("서울특별시 강남구 역삼동 한독 빌딩")
                .gender("m")
                .build();


        Address result = addressRepository.save(address);

        model.addAttribute("address", Address.toDTO(result));

        return "result_dto";
    }

    @GetMapping("/m02.do")
    public String m02(Model model) {

        //c[R]UD
        //- 1개의 레코드 가져오기

        //addressRepository.getById(73L)
        //addressRepository.getByOne(73L)

        Optional<Address> address = addressRepository.findById(73L);

//        if (address.isPresent()) {
//            model.addAttribute("address", Address.toDTO(address.get()));
//        }

        address.ifPresent(value -> model.addAttribute("address", Address.toDTO(value)));


        return "result_dto";
    }

    @GetMapping("/m03.do")
    public String m03(Model model) {

        //CR[U]D
        //- 레코드 수정하기
        //1. 생성후 수정
        //2. 검색후 수정
 //       Address address = Address.builder()
//                .seq(72L)
//                .name("꿀꿀이")
//                .age(5)
//                .address("서울특별시 강남구 역삼동 한독 빌딩 8층")
//                .gender("m")
//                .build();

        Address address = addressRepository.findById(72L).get();
        address.updateAddress("서울특별시 강동구", 6);


        Address result = addressRepository.save(address);

        model.addAttribute("address", Address.toDTO(result));


        return "result_dto";
    }

    @GetMapping("/m04.do")
    public String m04(Model model) {

        //CRU[D]
        //- 레코드 삭제하기

        Address address = addressRepository.findById(72L).get();
        addressRepository.delete(address);

        return "result_dto";
    }


}
