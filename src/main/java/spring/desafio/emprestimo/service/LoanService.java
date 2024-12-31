package spring.desafio.emprestimo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.desafio.emprestimo.dto.CustomerDto;
import spring.desafio.emprestimo.dto.LoanDto;

@Service
public class LoanService {
	
	public List<LoanDto> determineLoans(CustomerDto customerDto){
		
		String name = customerDto.getName();
		int age = customerDto.getAge();
		String location = customerDto.getLocation();
		String cpf = customerDto.getCpf();
		double income = customerDto.getIncome();
		
		List<LoanDto> loans = new ArrayList<LoanDto>();
		
		if (income <= 3000) {
		    loans.add(new LoanDto("PERSONAL", 4));
		    loans.add(new LoanDto("GUARANTEED", 3));
		} else if (income > 3000 && income < 5000) {
		    if (age < 30 && "SP".equalsIgnoreCase(location)) {
		        loans.add(new LoanDto("PERSONAL", 4));
		        loans.add(new LoanDto("GUARANTEED", 3));
		    }
		} else if (income >= 5000) {
		    loans.add(new LoanDto("CONSIGNMENT", 2));
		}

		
		return loans;
		
	}

}
