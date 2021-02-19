package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> hm = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (hm.containsKey(surname)) {
            phoneNumberList = hm.get(surname);
            phoneNumberList.add(phoneNumber);
            hm.put(surname, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            hm.put(surname, phoneNumberList);
        }
    }

    public List<String> get(String surname) {
        return hm.get(surname);
    }

    @Override
    public String toString () {
        return "Телефонный справочник \n" + hm;

    }
}
