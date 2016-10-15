package com.yiyi.test.printer;

import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;
import java.awt.print.PrinterJob;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by liuzhe on 2016/10/15.
 */
public class CardPrinter {
    public static void main(String[] args) {
        try {
            PrintService mPrinter = null;
            Boolean bFoundPrinter = false;

            PrintService[] printServices = PrinterJob.lookupPrintServices();

            //
            // Iterates the print services and print out its name.
            //
//            for (PrintService printService : printServices) {
//                String sPrinterName = printService.getName();
//                if (sPrinterName.equals("DTC4000 Card Printer")) {
//                    mPrinter = printService;
//                    bFoundPrinter = true;
//                }
//            }

            //
            String testData = "Hello World !";
            InputStream is = new ByteArrayInputStream(testData.getBytes());
//            is = new StringBufferInputStream(testData);

            DocFlavor flavor =  DocFlavor.INPUT_STREAM.AUTOSENSE   ;

            // Find the default service
            PrintService service = PrintServiceLookup.lookupDefaultPrintService();
            System.out.println(service);

            // Create the print job
            DocPrintJob job = service.createPrintJob();
            Doc doc= new SimpleDoc(is, flavor, null);
            PrintRequestAttributeSet praSet = new HashPrintRequestAttributeSet();
            praSet.add(MediaSizeName.ISO_A4);
            praSet.add(new Copies(1));

            // Monitor print job events; for the implementation of PrintJobWatcher,
            PrintJobWatcher pjDone = new PrintJobWatcher(job);

            // Print it
            job.print(doc, praSet);

            // Wait for the print job to be done
            pjDone.waitForDone();

            // It is now safe to close the input stream
            is.close();
        } catch (PrintException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class PrintJobWatcher {
        // true iff it is safe to close the print job's input stream
        boolean done = false;

        PrintJobWatcher(DocPrintJob job) {
            // Add a listener to the print job
            job.addPrintJobListener(new PrintJobAdapter() {
                public void printJobCanceled(PrintJobEvent pje) {
                    allDone();
                }
                public void printJobCompleted(PrintJobEvent pje) {
                    allDone();
                }
                public void printJobFailed(PrintJobEvent pje) {
                    allDone();
                }
                public void printJobNoMoreEvents(PrintJobEvent pje) {
                    allDone();
                }
                void allDone() {
                    synchronized (PrintJobWatcher.this) {
                        done = true;
                        PrintJobWatcher.this.notify();
                    }
                }
            });
        }
        public synchronized void waitForDone() {
            try {
                while (!done) {
                    wait();
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
