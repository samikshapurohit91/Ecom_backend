package com.example.Ecom.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecom.Repository.OrderRepository;
import com.example.Ecom.entity.Order;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;

import com.lowagie.text.pdf.PdfWriter;


import jakarta.servlet.http.HttpServletResponse;


import com.lowagie.text.Paragraph;






@RestController
@RequestMapping("/api/receipt")
public class ReceiptController {
	
	@Autowired
    private OrderRepository orderRepository;

    @GetMapping("/download/{orderId}")
    public void downloadReceipt(@PathVariable Long orderId,
                                HttpServletResponse response) throws IOException, DocumentException {

        Order order = orderRepository.findById(orderId).orElseThrow();

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=receipt.pdf");

        Document document = new Document();
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();

        document.add(new Paragraph("E-Commerce Order Receipt"));
        document.add(new Paragraph(" "));
        document.add(new Paragraph("Order Details"));
        document.add(new Paragraph("----------------------------"));
        document.add(new Paragraph("Order ID : " + order.getId()));
        document.add(new Paragraph("Total Amount : ₹" + order.getTotalAmount()));
        document.add(new Paragraph("Order Status : " + order.getStatus()));
        document.add(new Paragraph(" "));
        document.add(new Paragraph("Thank you for shopping with us!"));

        document.close();
    }

}
