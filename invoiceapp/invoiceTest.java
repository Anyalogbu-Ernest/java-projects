package invoiceapp;

import javax.swing.JOptionPane;

public class invoiceTest {

    public static void main(String[] agrs) {
        
        double qtyPurchased = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity:"));
        double pricePerItem = Double.parseDouble(JOptionPane.showInputDialog("Enter price per item:"));
        String partNumber = JOptionPane.showInputDialog("Enter part number:");
        String partDescrition = JOptionPane.showInputDialog("Enter part description:");
        
        InvoiceApp invoice1 = new InvoiceApp(qtyPurchased, pricePerItem, partNumber, partDescrition);
        JOptionPane.showMessageDialog(null, String.format("Total: %.2f",invoice1.getInoviceAmount()));
    }
}
