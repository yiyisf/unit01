package com.yiyi.test.printer;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.Sides;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 * Created by liuzhe on 2016/10/30.
 */
public class HelloWorldPrinter implements Printable, ActionListener {
    public static void main(String[] args) {
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        JFrame f = new JFrame("Hello World Printer");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        JButton printButton = new JButton("Print Hello World");
        printButton.addActionListener(new HelloWorldPrinter());
        f.add("Center", printButton);
        f.pack();
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PrinterJob job = PrinterJob.getPrinterJob();
//        PrinterJob.getPrinterJob()
        job.setPrintable(this);
//        DocFlavor flavor = DocFlavor.STRING.TEXT_HTML;
        PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
        set.add(MediaSizeName.ISO_A4);
        set.add(new Copies(1));
        set.add(Sides.ONE_SIDED);
//        PageFormat pf = new PageFormat();
//        boolean ok = job.printDialog();
//        if (ok) {
            try {
                job.print(set);
            } catch (PrinterException ex) {
              /* The job did not successfully complete */
            }
//        }
    }

    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        if (page > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }

        /* User (0,0) is typically outside the imageable area, so we must
         * translate by the X and Y values in the PageFormat to avoid clipping
         */
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        /* Now we perform our rendering */
        g.drawString("Hello world! \n你好!", 100, 100);
        g.drawString("Hello world! \n你好!", 100, 150);
        g.drawString("哈哈! \n你好!", 100, 200);

        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }
}
