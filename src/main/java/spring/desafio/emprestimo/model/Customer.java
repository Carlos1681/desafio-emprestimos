package spring.desafio.emprestimo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

	@Id
	private Long id;
	private String name;
	private int age;
	private String location;
	private String cpf;
	private double income;
}
