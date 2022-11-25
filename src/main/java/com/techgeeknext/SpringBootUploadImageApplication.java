package com.techgeeknext;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techgeeknext.entities.Patient;
import com.techgeeknext.repositories.PatientRepository;

@SpringBootApplication
public class SpringBootUploadImageApplication implements CommandLineRunner {
	
	@Autowired
	 private PatientRepository patientRepository;
	  
	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadImageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		patientRepository.save(new Patient(null,"Elyess",new Date(),2300,true));
		patientRepository.save(new Patient(null,"Ahmed",new Date(),2300,false));
		patientRepository.save(new Patient(null,"Ameur",new Date(),2300,false));
		patientRepository.save(new Patient(null,"Elyess",new Date(),2300,true));
		
		patientRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		  
		});
		
		System.out.println("****************");
		Patient patient = patientRepository.findById(4L).get();
		System.out.println(patient);
		
		System.out.println("***********");
			List<Patient> patients = patientRepository.findByNomContains("Elyess");
			patients.forEach(p ->{
				  System.out.println(p.toString());
			});
			
		System.out.println("*************");

		
		List<Patient> patinetsMalade = patientRepository.findByMalade(true);
		patinetsMalade.forEach(p ->{
			  System.out.println(p.toString());
		});
		System.out.print("liste des patiant malade");
		
	
	}
}
