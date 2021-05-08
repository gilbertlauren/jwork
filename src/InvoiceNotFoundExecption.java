public class InvoiceNotFoundExecption extends Exception {
    private int invoice_error;

    public InvoiceNotFoundExecption(int invoice_input) {
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }
    @Override
    public String getMessage() {
        return super.getMessage() + invoice_error + " not found";
    }
}
