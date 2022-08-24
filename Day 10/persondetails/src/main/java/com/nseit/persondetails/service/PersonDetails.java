package com.nseit.persondetails.service;

import com.nseit.persondetails.model.Details;
import com.nseit.persondetails.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service


public class PersonDetails {
    @Autowired
    private PersonRepository personRepository;

    public void addDetails(Details detail) {
        ArrayList<Details> details = personRepository.getDetails();
        details.add(detail);

    }

    public void viewDetails() {
        for (Details details : personRepository.getDetails()) {
            System.out.println(details.getId() +"."+details.getName()+"- " + details.isCompleted());

        }
    }

    public void updateDetails(int id) {
        for (Details details : personRepository.getDetails()) {
            if (id == details.getId()) {
                details.setCompleted(true);
                break;
            }
        }

    }
    public void deleteDetails(int id) {
        for (Details details : personRepository.getDetails()) {
            if (id == details.getId()) {
                personRepository.getDetails().remove(details);
                break;
            }
        }

    }
}

