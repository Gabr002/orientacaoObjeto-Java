package atividade01;
import atividade01.Classes.Invoice;

public class Main {
    public static void main(String[] args) {
        Invoice inv = new Invoice(1, "Mouse pad", -10, 50.0f);

        System.out.println("Valor total = " + inv.getInvoiceAmount());
    }
}
