# API IBGE

Esta API consome os dados do IBGE e gera um gráfico animado sobre a taxa de natalidade.

## Modo de Uso:

1. Certifique-se de ter um servidor Apache em execução na porta 1208.
2. Mova a pasta do gráfico para o diretório do servidor web/www/xampp.
3. Acesse a aplicação pelo IP local na porta 8080. Ex: 127.0.0.1:8080
4. Se houver algum bug no preenchimento dos estados, vá para `main > java > com > FGRW > tfpi > config > WebConfig.java`.
5. Altere:
    ```java
    .allowedOrigins(servidor)
    ```
    para:
    ```java
    .allowedOrigins("*")
    ```
6. Não se esqueça de ajustar qualquer variável com referência ao servidor para o IP local ou IP público.

Projeto desenvolvido por:
- **Waldemar Silva**
- **Rhuan Flores**
- **Gabriel Gama**
- **Felipe Melidas**
