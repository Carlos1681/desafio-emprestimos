package spring.desafio.emprestimo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
	
	private String name;
	private int age;
	private String location;
	private String cpf;
	private double income;

}
