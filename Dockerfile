# Estágio 1: Build da aplicação
FROM maven:3-openjdk-17 AS build-image

WORKDIR /to-build-app

# Copia os arquivos do código-fonte e do arquivo pom.xml para o diretório de trabalho
COPY pom.xml .
COPY src/ ./src/

# Executa o goal dependency:go-offline para baixar as dependências (opcional, mas pode melhorar o cache)
RUN mvn dependency:go-offline

# Executa o goal package para construir o pacote JAR, ignorando os testes
RUN mvn package -DskipTests

# Estágio 2: Construção da imagem final
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copia o pacote JAR construído no estágio anterior para o diretório de trabalho do segundo estágio
COPY --from=build-image /to-build-app/target/*.jar app.jar

# Expõe a porta 8080
EXPOSE 8080

# Ponto de entrada: executa o pacote da aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]

