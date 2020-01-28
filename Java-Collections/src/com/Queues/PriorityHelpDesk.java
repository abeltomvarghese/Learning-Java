package com.Queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

public class PriorityHelpDesk {

    private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {
        @Override
        public int compare(Enquiry o1, Enquiry o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };
    private final Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

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
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.HARRY, Category.PRINTER);
        helpDesk.enquire(Customer.JILL, Category.TABLET);
        helpDesk.processAllEnquiries();
        System.out.println(helpDesk.enquiries.isEmpty());







    }

}
