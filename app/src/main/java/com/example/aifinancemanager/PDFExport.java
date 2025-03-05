package com.example.aifinancemanager;

import android.content.Context;
import android.os.Environment;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileOutputStream;

public class PDFExport {
    public static void generatePDF(Context context, String data) {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "ExpenseReport.pdf");
            PdfWriter writer = new PdfWriter(new FileOutputStream(file));
            PdfDocument pdfDocument = new PdfDocument(writer);
            Document document = new Document(pdfDocument);
            document.add(new Paragraph(data));
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}