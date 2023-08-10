package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class JPAAddressServiceImpl implements AddressService {
    @Override
    public String getAddressByUser() {
        return "foo";
    }
}
