# 📄 GeradorPDF

Sistema para **geração automatizada de arquivos PDF com interface gráfica**, permitindo criar documentos personalizados de forma prática e intuitiva.

---

## 📌 Sobre o projeto

O **GeradorPDF** é uma aplicação desenvolvida em Java que permite a geração de arquivos PDF através de uma interface gráfica amigável.

O projeto foi criado com o objetivo de automatizar a criação de documentos, tornando o processo mais rápido, organizado e acessível ao usuário.

---

## 🚀 Tecnologias utilizadas

Este projeto foi desenvolvido utilizando:

- ☕ **Java**  
- 🖥️ **JavaFX** (Interface gráfica)  
- 📄 **Biblioteca de geração de PDF** *(ex: iText / PDFBox)*  
- ⚙️ **Programação Orientada a Objetos (POO)**  
- 📁 Manipulação de arquivos  
- 🛡️ Tratamento de exceções (**try-catch**)  

---

## 🎨 Interface gráfica (JavaFX)

A aplicação utiliza o **JavaFX** para fornecer uma interface gráfica interativa, permitindo ao usuário:

- Inserir dados de forma visual  
- Gerar PDFs com poucos cliques  
- Melhor experiência de uso em comparação com aplicações em console  

---

## 🧠 Boas práticas aplicadas

- ✔️ Organização de código em camadas  
- ✔️ Separação de responsabilidades  
- ✔️ Uso de **JavaFX** para UI  
- ✔️ Tratamento de erros com `try-catch`  
- ✔️ Código limpo e legível  

---

## ⚠️ Tratamento de erros

O sistema utiliza **try-catch** para evitar falhas durante a execução.

### Exemplo:

```java
try {
    gerarPDF();
    System.out.println("PDF gerado com sucesso!");
} catch (Exception e) {
    System.out.println("Erro ao gerar PDF: " + e.getMessage());
}
