package com.nseit.persondetails;

import com.nseit.persondetails.model.Details;
import com.nseit.persondetails.repository.PersonRepository;
import com.nseit.persondetails.service.PersonDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;



@SpringBootApplication
public class PersondetailsApplication implements CommandLineRunner {
	@Autowired
	private PersonDetails personDetails;

	public static void main(String[] args) {
		SpringApplication.run(PersondetailsApplication.class,args);}
		@Override
		public void run (String...args) throws Exception {


			Details person1 = new Details(1, "abc", false);
			Details person2 = new Details(2, "def", false);
			Details person3 = new Details(3, "ghi", false);
			personDetails.addDetails(person1);
			personDetails.addDetails(person2);
			personDetails.addDetails(person3);

			personDetails.viewDetails();
			personDetails.updateDetails(1);
			personDetails.deleteDetails(2);
			personDetails.viewDetails();






		}

	}
