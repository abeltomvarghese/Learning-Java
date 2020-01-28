package com.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

public class HelpDesk {

    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer,category));
    }

    public void processAllEnquiries() {
        Enquiry enquiry;

        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turning it off & on again?");
        }

        /*
        while (!enquiries.isEmpty()) {
            final Enquiry enquiry = enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off & on again?");
        }
       */
    }

    public void processPrinterEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        final Predicate<Enquiry> predicate = enq -> enq.getCategory() == Category.PRINTER;
        final String message = "Is it out of paper?";

        processEnquiry(enquiry, predicate.test(enquiry), message);

    }

    public void processGeneralEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        final String message = "Have you tried turning it off and on again?";
        final Predicate<Enquiry> predicate = enq -> enq.getCategory() != Category.PRINTER;
        processEnquiry(enquiry, predicate.test(enquiry), message);

    }

    private void processEnquiry(Enquiry enquiry, boolean b, String s) {
        if (enquiry != null && b) {
            enquiries.remove();
            enquiry.getCustomer().reply(s);
        } else {
            System.out.println("No work to do");
        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.HARRY, Category.PRINTER);
        helpDesk.enquire(Customer.JILL, Category.TABLET);
        //helpDesk.processAllEnquiries();
        System.out.println(helpDesk.enquiries.isEmpty());

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
        helpDesk.processPrinterEnquiry();



    }

}
