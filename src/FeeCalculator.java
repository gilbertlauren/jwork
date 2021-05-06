public class FeeCalculator extends Thread implements Runnable{
    private Invoice input;
    public FeeCalculator(Invoice invoice) {
        input = invoice;
    }
    @Override
    public void run() {
        System.out.println("Calculating Invoice ID: " + input.getId());
        input.setTotalFee();
        System.out.println("Finish Calculating Invoice ID: " + input.getId());
    }
}