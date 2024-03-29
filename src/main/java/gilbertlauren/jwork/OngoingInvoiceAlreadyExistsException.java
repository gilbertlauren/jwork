package gilbertlauren.jwork;
/**
 * Exception when Ongoing Invoice exists
 *
 * @author Gilbert Lauren
 * @version 06/28/2021
 */
public class OngoingInvoiceAlreadyExistsException extends Exception {
        private Invoice invoice_error;

        public OngoingInvoiceAlreadyExistsException (Invoice invoice_input) {
            super("Ongoing Invoice ");
            invoice_error = invoice_input;
        }
        @Override
        public String getMessage() {
            return super.getMessage() + invoice_error.getId() + " already exists. ";
        }
}
