package com.example.demo.service;

public class UserServiceImpl implements UserService {

    private AddressService addressService;

    public UserServiceImpl(AddressService addressService) {
        this.addressService = addressService;
    }

    public void updateUser() {
        String address = addressService.getAddressByUser();
    }

}
