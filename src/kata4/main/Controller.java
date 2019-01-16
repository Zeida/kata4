package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Controller {
    private static List<String> mailList;
    private static Histogram<String> histogram;

    public static void main(String[] args) {
        execute();
    }

    private static void execute(){
        Input();
        Process();
        Output();
    }

    private static void Input(){
        mailList = MailListReader.read("src/File/emailsfile.txt");
    }

    private static void Process(){
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void Output(){
        (new HistogramDisplay(histogram)).execute();
    }
}