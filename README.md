# 🏦 Proyecto de Pruebas de Caja Blanca

Este proyecto implementa un sistema de gestión de cuentas bancarias y utiliza **JUnit 5, JaCoCo y PITest** para realizar pruebas de caja blanca, análisis de cobertura de código y pruebas de mutación.

---

## 📋 **Requisitos previos**
Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java 17** o superior
- **Apache Maven 3.8+**
- Un **IDE** como VS Code o IntelliJ IDEA (opcional)

Puedes verificar las versiones con los siguientes comandos:

```sh
java -version
mvn -version
```

## 🚀 **Instalación**
Clonar el repositorio:
```sh
git clone https://github.com/tu_usuario/proyecto-pruebas-caja-blanca.git
cd proyecto-pruebas-caja-blanca
```

Compilar el proyecto:
```sh
mvn clean compile
```

## ✅ **Ejecución de Pruebas**
El proyecto usa JUnit 5 para las pruebas unitarias. Puedes ejecutar los tests de las siguientes maneras:

🔹 Ejecutar todas las pruebas
```sh
mvn test
```

🔹 Ejecutar solo las pruebas de BankAccountTest
```sh
mvn test -Dtest=org.example.BankAccountTest
```

🔹 Ejecutar un test específico dentro de BankAccountTest
```sh
mvn test -Dtest=org.example.BankAccountTest#testDeposit
```

## 🧪 **Ejecutar Pruebas de Mutación con PITest**
Para analizar la calidad de las pruebas y detectar mutantes sobrevivientes, ejecuta:
```sh
mvn org.pitest:pitest-maven:mutationCoverage
```

## 📊 **Generar y Ver el Informe de Cobertura de Código (JaCoCo)**
```sh
mvn jacoco:report
```

## 📊 **Revisión de analisis estatico de codigo**
```sh
mvn checkstyle:check
```