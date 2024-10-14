<h1 align="center"> Conversor de Moedas </h1>

![Badge em Produção](http://img.shields.io/static/v1?label=STATUS&message=ONLINE&color=GREEN&style=for-the-badge)

# Descrição do Projeto 
O Conversor de Moedas é uma aplicação feita com Java usando Orientação a Objetos e a biblioteca GSON para a desserialização do JSON da API. A principal função do Conversor de Moedas é consumir uma [API de taxa de câmbio](https://www.exchangerate-api.com/) para converter o valor de uma moeda de origem no valor de uma moeda de destino, considerando a taxa de câmbio.

# Funcionalidades do Projeto
- `Funcionalidade 1` enviar moeda de origem para a API
- `Funcionalidade 1.2` enviar moeda de destino para a API
- `Funcionalidade 1.3` enviar valor de conversão para a API
- `Funcionalidade 2` receber moeda de origem da API
- `Funcionalidade 2.1` receber moeda de destino da API
- `Funcionalidade 2.2` receber valor convertido da API
- `Funcionalidade 3` exibir no terminal as 6 (seis) possíveis escolhas de moeda origem e moeda destino para conversão, sendo elas: Dólar para Peso argentino, Peso argentino para Dólar, Dólar para Real brasileiro, Real brasileiro para Dólar, Dólar para Peso colombiano, Peso colombiano para Dólar
- `Funcionalidade 3.1` exibir no terminal a 7 (sétima) possível escolha que é uma opção de 'sair' do terminal
- `Funcionalidade 4` fornecer entrada de número inteiro no terminal para o usuário inserir quais das 7 (sete) possíveis escolhas ele deseja executar no terminal
- `Funcionalidade 5` fornecer entrada de número ponto flutuante para o usuário inserir um valor para a conversão
- `Funcionalidade 6` fornecer resultado de saída para as escolhas feitas, sendo um resultado que mostre a moeda origem, o valor de conversão, a moeda destino e o valor convertido.
- `Funcionalidade 7` enibir entrada de valores diferentes das 7 possíveis escolhas, incluindo a inibição de texto (String) e caracteres especiais
- `Funcionalidade 8` enibir entrada de valores de texto (String) e caracteres especiais para o valor de conversão
- `Funcionalidade 8.1` enibir entrada de valores maiores que 7 dígitos conforme políticas da API para o valor de conversão
- `Funcionalidade 8.2` enibir entrada de vírgula junto ao valor fornecido, permitindo apenas entrada de ponto junto ao valor fornecido para o valor de conversão

Para baixar o projeto em sua máquina, execute `git clone` com o link do repositório remoto `https://github.com/kevin-vogado/conversor-de-moedas.git`.

# Técnicas e Tecnologias Utilizadas

- `Java`
- `Orientação a Objetos`
- `GSON`
- `Consumo de API`
