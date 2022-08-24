package com.nseit.persondetails.repository;

import com.nseit.persondetails.model.Details;
import com.nseit.persondetails.service.PersonDetails;

import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Getter
@Repository

public class PersonRepository {

    ArrayList<Details> details = new ArrayList<>();



}
