package com.yiyi.test.printer;

import com.aspose.words.*;
import com.aspose.words.Document;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.PageRanges;
import java.awt.print.PrinterJob;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by liuzhe on 2016/10/15.
 */
public class printset {

    public static void main(String[] args) throws Exception {
        String testData = "Hello World !\n你好\n";
        InputStream is = new ByteArrayInputStream(testData.getBytes());
        Document doc = new Document(is);

        PrinterJob pj = PrinterJob.getPrinterJob();
        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
        attributeSet.add(new PageRanges(1, doc.getPageCount()));

        AsposeWordsPrintDocument awpd = new AsposeWordsPrintDocument(doc);
        pj.setPageable(awpd);
//        if(pj.printDialog()){
            pj.print();
//            return;
//        }




    }

}
