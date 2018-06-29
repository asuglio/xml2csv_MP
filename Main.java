import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

//import java.io.PrintWriter;
//
//import java.io.FileOutputStream;
//
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
//import org.xml.sax.Attributes;
//import org.xml.sax.InputSource;
//import org.xml.sax.SAXException;
//import org.xml.sax.helpers.DefaultHandler;
//
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
//import org.xml.sax.Attributes;
//import org.xml.sax.SAXException;
//import org.xml.sax.helpers.DefaultHandler;







import org.w3c.dom.Document;

class Main {

    public static void main(String args[]) throws Exception {
       File stylesheet = new File("C:/Users/asuglio/IdeaProjects/CLI-test/src/style.xsl");

     //File xmlSource = new File("C:/Users/asuglio/IdeaProjects/CLI-test/src/Att-SmallerBite.xml");

   File xmlSource = new File("C:/Users/asuglio/IdeaProjects/CLI-test/src/metroBigBite.xml");


//        InputStream inputStream= new FileInputStream("C:/Users/asuglio/IdeaProjects/CLI-test/src/Att-SmallerBite.xml");
//        Reader reader = new InputStreamReader(inputStream,"UTF-8");
//        InputSource is = new InputSource(reader);
//        is.setEncoding("UTF-8");



//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document document = dBuilder.parse(is);

        //THIS WORKS!
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(xmlSource);

        StreamSource stylesource = new StreamSource(stylesheet);

        Transformer transformer = TransformerFactory.newInstance().newTransformer(stylesource);

        Source source = new DOMSource(document);

       Result outputTarget = new StreamResult(new File("C:/Users/asuglio/IdeaProjects/CLI-test/src/test2.csv"));

        transformer.transform(source, outputTarget);

// InputStream inputStream= new FileInputStream("C:/Users/asuglio/IdeaProjects/CLI-test/src/test1.csv");
// Reader reader = new InputStreamReader(inputStream,"UTF-8");
// InputSource is = new InputSource(reader);
// is.setEncoding("UTF-8");

 //        p = new PrintWriter(new FileOutputStream("C:/Users/asuglio/IdeaProjects/CLI-test/src/test33.csv", true));

        }
}