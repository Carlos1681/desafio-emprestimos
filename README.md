# Empréstimos

Seu desafio será implementar um serviço que determine quais modalidades de empréstimo uma pessoa tem acesso.

## Exemplo

As modalidades de empréstimo que serão analisadas são:

- **Empréstimo pessoal**: Taxa de juros de 4%.
- **Empréstimo consignado**: Taxa de juros de 2%.
- **Empréstimo com garantia**: Taxa de juros de 3%.

As modalidades de empréstimo disponíveis para uma pessoa são baseadas em algumas variáveis específicas, são elas:

- **Idade**
- **Salário**
- **Localização**

Seu serviço recebe uma chamada para determinar quais modalidades de empréstimo uma pessoa tem acesso.

## Requisitos

- Conceder o empréstimo pessoal se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30
  anos e residir em São Paulo (SP).
- Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000.
- Conceder o empréstimo com garantia se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo com garantia se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver
  menos de 30 anos e residir em São Paulo (SP).

  ## Testando a API no Postman

  - Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000:
    
  ![image](https://github.com/user-attachments/assets/4dc60115-0961-44ff-aa2f-0e95d48dba55)

  -  Conceder o empréstimo pessoal ou com garantia se o salário do cliente for igual ou inferior a R$ 3000:
    
  ![image](https://github.com/user-attachments/assets/97be4ee3-7a73-42fb-ad3a-aaf45798091b)

  - Conceder o empréstimo pessoal ou com garantia se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30
  anos e residir em São Paulo (SP):

  ![image](https://github.com/user-attachments/assets/46c24aa5-3d9f-48c1-b218-84e048879e8c)

  - Caso o cliente não se encaixe em nenhuma das opções, não é retornado nenhum opção de empréstimo:
    
  ![image](https://github.com/user-attachments/assets/cee9f72b-0daa-4fce-b1a2-f83fea198e91)


