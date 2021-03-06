package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import com.bridgelabz.addressbook.model.AddressbookData;

import java.util.List;

public interface IAddressbookService {
    List<AddressbookData> getAddressbookData();

    AddressbookData getAddressbookDataById(int personId);

    AddressbookData createAddressbooData(AddressbookDTO addressbookDTO);

    AddressbookData updateAddressbookData(int personId,AddressbookDTO addressbookDTO);

    void deleteAddressbooData(int personId);

    List<AddressbookData> sortAddressBookByCity();

    List<AddressbookData> getAddressBookByCity(String city);

    List<AddressbookData> sortAddressBookByState();

    List<AddressbookData> getAddressBookByState(String state);

    List<AddressbookData> sortAddressBookByZip();

    List<AddressbookData> getAddressBookByZip(String state);

    List<AddressbookData> sortAddressBookByName();
}