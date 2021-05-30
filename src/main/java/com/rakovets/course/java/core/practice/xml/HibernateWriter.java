package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class HibernateWriter {
    private final XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    private final XMLEvent lfEvent = eventFactory.createDTD("\n");
    private final XMLEvent tab = eventFactory.createDTD("\t");

    public void createConfig(String configFilePath, HibernateConfig hibernate) {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        try (OutputStream outputStream = new FileOutputStream(configFilePath)) {
            XMLEventWriter writer = outputFactory.createXMLEventWriter(outputStream);
            writer.add(eventFactory.createStartDocument());
            writer.add(lfEvent);
            writer.add(eventFactory.createDTD("<!DOCTYPE hibernate-configuration PUBLIC\n" +
                    "\t\t\"-//Hibernate/Hibernate Configuration DTD//EN\"\n" +
                    "\t\t\"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd\">\n"));
            writer.add(lfEvent);
            writer.add(eventFactory.createStartElement("", "", "hibernate-configuration"));
            writer.add(lfEvent);
            writer.add(tab);
            writer.add(eventFactory.createStartElement("", "", "session-factory"));
            writer.add(lfEvent);
            LinkedHashMap<String, String> property = hibernate.getProperty();
            LinkedHashMap<String, String> mapping = hibernate.getMapping();
            for (Map.Entry<String, String> set : property.entrySet()) {
                createNodeProperty(writer, set.getKey(), set.getValue());
            }
            writer.add(lfEvent);
            for (Map.Entry<String, String> set : mapping.entrySet()) {
                createNodeMapping(writer, set.getKey(), set.getValue());
            }
            writer.add(tab);
            writer.add(eventFactory.createEndElement("", "", "session-factory"));
            writer.add(lfEvent);
            writer.add(eventFactory.createEndElement("", "", "hibernate-configuration"));
            writer.add(lfEvent);
            writer.add(eventFactory.createEndDocument());
            writer.close();
        } catch (IOException | XMLStreamException e) {
                e.printStackTrace();
        }
    }

    private void createNodeMapping(XMLEventWriter writer, String value, String valueAttr) throws XMLStreamException {
        XMLEvent tab = eventFactory.createDTD("\t\t");
        StartElement sElement = eventFactory.createStartElement("", "", "mapping");
        Attribute attr = eventFactory.createAttribute(valueAttr, value);
        writer.add(tab);
        writer.add(sElement);
        writer.add(attr);
        EndElement eElement = eventFactory.createEndElement("", "", "mapping");
        writer.add(eElement);
        writer.add(lfEvent);
    }

    private void createNodeProperty(XMLEventWriter writer, String value, String valueAttr) throws XMLStreamException {
        XMLEvent tab = eventFactory.createDTD("\t\t");
        StartElement sElement = eventFactory.createStartElement("", "", "property");
        Attribute attr = eventFactory.createAttribute("name", value);
        writer.add(tab);
        writer.add(sElement);
        writer.add(attr);
        Characters characters = eventFactory.createCharacters(valueAttr);
        writer.add(characters);
        EndElement eElement = eventFactory.createEndElement("", "", "property");
        writer.add(eElement);
        writer.add(lfEvent);
    }
}

