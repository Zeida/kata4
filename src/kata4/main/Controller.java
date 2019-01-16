package kata4.main;
import java.util.*;
import kata4.model.*;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import java.io.IOException;

public class Controller {
    public static void main(String[] args) throws IOException{        
        String fileName = "src/File/emailsfile.txt";

        List<String> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);

        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}