package com.xml;

import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Main {
    public static void main(String[] args) {

        try {
            Person person = new Person("Shahrom","Man",19);


            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer;
            writer = new XMLWriter( System.out, format );
            writer.write( XMLConverter.XMLFile(person) );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
