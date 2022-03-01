package invoiceapp;

public class InvoiceApp {

    private double qtyPurchased, pricePerItem;
    private String partNumber, partDescription;

    public InvoiceApp(double qtyPurchased, double pricePerItem, String partNumber, String partDescrition) {
        this.partNumber = partNumber;
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        }
        this.partDescription = partDescrition;
        if (qtyPurchased > 0.0) {
            this.qtyPurchased = qtyPurchased;
        }
    }

    private void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    private String getPartNumber() {
        return partNumber;
    }

    private void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    private double getPricePerItem() {
        return pricePerItem;
    }

    private void setQtyPurchased(int qtyPurchased) {
        this.qtyPurchased = qtyPurchased;
    }

    private double getQtyPurchased() {
        return qtyPurchased;
    }

    private void setPartDescription(String partDescrition) {
        this.partDescription = partDescrition;
    }

    private String getPartDescription() {
        return partDescription;
    }
    public double getInoviceAmount() {
        return qtyPurchased * pricePerItem;
    }

}
