package spring.desafio.emprestimo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.desafio.emprestimo.dto.CustomerDto;
import spring.desafio.emprestimo.dto.LoanDto;
import spring.desafio.emprestimo.service.LoanService;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {
	
	@Autowired
	private LoanService loanService;
	
	@PostMapping
	public Map<String, Object> getLoans(@RequestBody CustomerDto customerDto){
		
		List <LoanDto> loans = loanService.determineLoans(customerDto);
		
		Map<String, Object> response = new HashMap<String, Object>();
		
		response.put("customer", customerDto.getName());
		response.put("loans", loans);
		
		return response;
	}

}
