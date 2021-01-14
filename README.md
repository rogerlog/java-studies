# Desafios em Java - Básico ao Avançado

**Introdução a programação com Java**

- [*Visita na Feira*](introducao-java/visitaFeira.java)

- [*Multiplicação Simples*](introducao-java/multiplicacaoSimples.java)

- [*Folha de Pagamento*](introducao-java/folhaPagamento.java)

  

**Fundamentos Aritméticos em Java**

- [*Quantidade de Números Positivos*](fundamentos-aritmeticos/NumerosPositivos.java)
- [*Exibindo Números Pares*](fundamentos-aritmeticos/NumerosPares.java)
- [*Análise de Números*](fundamentos-aritmeticos/AnaliseNumeros.java)
- [*Contagem de Cédulas*](fundamentos-aritmeticos/ContagemCedulas.java)
- [*Consumo Médio do Automóvel*](fundamentos-aritmeticos/ConsumoAutomovel.java)



------

### Introdução a Programação com Java

#### 	

#### 	<u>Visita na Feira</u>

**Desafio**
Você está na feira com a sua sacola e parou em uma banca. O feirante lhe entregou pimentões amarelos e vermelhos. Agora iremos somar os pimetões amarelos e vermelhos para descobrir o total de pimentões na sacola.  Você receberá 2 inteiros que devem ser lidos e armazenados nas variáveis A (pimentões amarelos) e B (pimentões vermelhos). Faça a soma de A e B atribuindo o seu resultado na variável X (total de pimentões). Apresente X como descrito na mensagem de exemplo abaixo. Não apresente outra mensagem além da mensagem especificada.

**Entrada**
A entrada contém 2 valores inteiros, separados por um espaço.

**Saída**
Imprimir a mensagem "X = " (sendo a letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Assegure que exista um espaço antes e depois do sinal de igualdade.

| Exemplos de Entrada | Exemplos de Saída |
|------ | ----- |
| `11 7` | X = 18 |
| `-11 6` | X = -5 |
| `11 -2` | X = 9 |

- Código: [*Visita na Feira*](introducao-java/visitaFeira.java)



#### 	<u>Multiplicação Simples</u>

**Desafio**
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

**Entrada**
A entrada contém 2 valores inteiros.

**Saída**
Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 3<br />9            | PROD = 27         |
| -30<br />10         | PROD = -300       |
| 0<br />9            | PROD = 0          |

- Código: [*Multiplicação Simples*](introducao-java/multiplicacaoSimples.java)



#### 	<u>Folha de Pagamento</u>

**Desafio**
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

**Entrada**
Você receverá 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.

**Saída**
Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

| Exemplos de Entrada   | Exemplos de Saída                   |
| --------------------- | ----------------------------------- |
| 25<br />100<br />5.50 | NUMBER = 25<br />SALARY = U$ 550.00 |
| 1<br />200<br />20.50 | NUMBER = 1<br />SALARY = U$ 4100.00 |
| 6<br />145<br />15.55 | NUMBER = 6<br />SALARY = U$ 2254.75 |

- Código: [*Folha de Pagamento*](introducao-java/folhaPagamento.java)



------

### Fundamentos Aritméticos em Java

#### 	

#### 	<u>Quantidade de Números Positivos</u>

**Desafio**
Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

**Entrada**
Você receberá seis valores, negativos e/ou positivos.

**Saída**
Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos" ao final.

| Exemplo de Entrada                          | Exemplo de Saída    |
| ------------------------------------------- | ------------------- |
| 7<br />-5<br />6<br />-3.4<br />4.6<br />12 | 4 valores positivos |



#### <u>Exibindo Números Pares</u>

**Desafios**
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

**Entrada**
Você receberá 1 valor inteiro N, onde N > 0.

**Saída**
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 6                  | 2<br />4<br />6  |



#### <u>Análise de Números</u>

**Desafio**
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

**Entrada**
Você receberá 5 valores inteiros.

**Saída**
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

| Exemplo de Entrada            | Exemplo de Saída                                             |
| ----------------------------- | ------------------------------------------------------------ |
| -5<br/>0<br/>-3<br/>-4<br/>12 | 3 valor(es) par(es)<br/>2 valor(es) impar(es)<br/>1 valor(es) positivo(s)<br/>3 valor(es) negativo(s) |



#### <u>Contagem de Cédulas</u>

**Desafio**
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido e a relação de notas necessárias.

**Entrada**
Você receberá um valor inteiro N (0 < N < 1000000).

**Saída**
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.

| Exemplo de Entrada | Exemplo de Saída                                             |
| ------------------ | ------------------------------------------------------------ |
| 576                | 576<br/>5 nota(s) de R$ 100,00<br/>1 nota(s) de R$ 50,00<br/>1 nota(s) de R$ 20,00<br/>0 nota(s) de R$ 10,00<br/>1 nota(s) de R$ 5,00<br/>0 nota(s) de R$ 2,00<br/>1 nota(s) de R$ 1,00 |
| 11257              | 11257<br/>112 nota(s) de R$ 100,00<br/>1 nota(s) de R$ 50,00<br/>0 nota(s) de R$ 20,00<br/>0 nota(s) de R$ 10,00<br/>1 nota(s) de R$ 5,00<br/>1 nota(s) de R$ 2,00<br/>0 nota(s) de R$ 1,00 |
| 503                | 503<br/>5 nota(s) de R$ 100,00<br/>0 nota(s) de R$ 50,00<br/>0 nota(s) de R$ 20,00<br/>0 nota(s) de R$ 10,00<br/>0 nota(s) de R$ 5,00<br/>1 nota(s) de R$ 2,00<br/>1 nota(s) de R$ 1,00 |



#### <u>Consumo Médio do Automóvel</u>

**Desafio**
Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).

**Entrada**
Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.

**Saída**
Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a mensagem "km/l".

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 500<br/>35.0       | 14.286 km/l      |
| 2254<br/>124.4     | 18.119 km/l      |
| 4554<br/>464.6     | 9.802 km/l       |

