# Java & Apache Kafka
.............
## Descrição

Repositório destinado ao entendimento do conceito e da prática do Kafka. Pretendo aprender um pouco mais sobre o Apache Kafka e sua relação com a linguagem Java.

Para abordar os aspectos do Kafka foi utilizada a estratégia de dividir em módulos cada recurso (produto, consumidor, etc):

- str-producer (Produtor de mensagens em formato de string);
- str-consumer (Consumidor Kafka de str-producer);
- payment-service (Produtor de mensagens em formato JSON);
- json-consumer (Consumidor Kakfa de payment-service).

Obs: todos os recursos/funcionalidades implementadas são meramente ilustrativas, apenas servem para demonstrar o conceito em sua mais pura essência.

<div align="center">
<img src="images/Fluxo do kafka.png" width="2000px" alt="Imagem do site" title="Fluxo do Kafka"/>
</div>

## Status do projeto

Projeto concluído.

## Pré-requisitos

### Linguagens

- Java (v17.0.5).

### Dependências

- [Spring Web](https://start.spring.io/);
- [Lombok](https://start.spring.io/);
- [Spring for Apache Kafka](https://start.spring.io/).

## Instalando

1. Clone o repositório para o seu ambiente local:

```
$ git clone https://github.com/igoraugustobrz/java-kafka
```

2. Navegue até o diretório do projeto.

```
$ cd java-kafka
```

3. Execute o Kafka com Docker:

```
$ docker-compose up -d
```

## Contribuindo

Contribuições são bem-vindas! Se você quiser contribuir para o projeto, siga as etapas abaixo:

1. Fork o repositório e clone-o para o seu ambiente local.

2. Crie uma nova branch:

```
git checkout -b minha-contribuicao
```

3. Faça as alterações desejadas e commit-as:

```
git commit -m "Minha contribuição"
```

4. Envie suas alterações para o repositório remoto:

```
git push origin minha-contribuicao
```

5. Abra uma solicitação de pull no repositório original.

## Autor

- Igor Augusto
- E-mail: igoraugustobz@gmail.com
- Acesse o meu [Portfólio](https://iaugusto.vercel.app/)
- Conecte-se comigo no [LinkedIn](https://www.linkedin.com/in/igorbrz/)
