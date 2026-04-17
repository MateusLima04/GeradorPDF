package com.example.geradorpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.FileOutputStream;

public class GeradorPDFController {

    @FXML private TextArea txtArea ;

    @FXML
    private void gerarPDF() {
        try {
            String texto = txtArea.getText().trim();

            if (texto.isEmpty()) {
                mostrarAlerta("Alerta", "O campo de texto está vazio!");
                return;
            }

            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Salvar PDF");

            fileChooser.getExtensionFilters().add(
                    new FileChooser.ExtensionFilter("Arquvios PDF", "*.pdf")
            );

            FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Arquivo PDF (*.pdf)", "*.pdf");
            fileChooser.getExtensionFilters().add(filter);

            Stage stage = new Stage();

            java.io.File file = fileChooser.showOpenDialog(stage);

            if (file == null) {
                return;
            }

            Document document = new Document();

            PdfWriter.getInstance(document, new FileOutputStream(file));

            document.open();

            document.add(new Paragraph(texto));

            document.close();

            mostrarAlerta("Sucesso!", "PDF Gerado com sucesso!");
        }catch(Exception e) {
            e.printStackTrace();

            mostrarAlerta(("Erro", "Não foi possível gerar o PDF: " + e.getMessage());
        }
    }

    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
