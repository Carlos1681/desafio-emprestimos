package spring.desafio.emprestimo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {
	
	@PostMapping
	public Map<String, Object> getLoans(@RequestBody Map<String, Object> request){
		
		int age = (int) request.get("age");
		double income = (double) request.get("income");
		String location = (String) request.get("location");
		String name = (String) request.get("name");
		
		List<Map<String, Object>> loans = new ArrayList<Map<String, Object>>();
		
		if(income <= 3000) {
			loans.add(createLoan("PERSONAL", 4));
			loans.add(createLoan("GUARANTEED", 3));
		}
		if(income >= 5000) {
			loans.add(createLoan("CONSIGNMENT", 2));
		}
		
		if(income > 3000 && income < 5000 & age < 30 && "SP".equalsIgnoreCase(location)) {
			loans.add(createLoan("PERSONAL", 4));
			loans.add(createLoan("GUARANTEED", 3));
		}
		
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("customer", name);
		response.put("loans", loans);
		
		return response;
	}
	
	private Map<String, Object> createLoan(String type, int interestRate){
		Map<String, Object> loan = new HashMap<String, Object>();
		
		loan.put("type", type);
		loan.put("interest_rate", interestRate);
		
		return loan;
	}

}
