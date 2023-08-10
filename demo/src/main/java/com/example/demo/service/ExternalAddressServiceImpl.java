package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class ExternalAddressServiceImpl implements AddressService {

    public String getAddressByUser() {
        return "foo";
    }

}
