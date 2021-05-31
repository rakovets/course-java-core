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
    private final static String EMPTY_PREFIX = "";
    private final static String EMPTY_NAMESPACE_URI = "";
    private final XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    private final XMLEvent lfEvent = eventFactory.createDTD("\n");
    private final XMLEvent tab = eventFactory.createDTD("\t");

    public void saveConfigFile(String configFilepath, HibernateConfiguration hibernate) {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        try (OutputStream outputStream = new FileOutputStream(configFilepath)) {
            XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(outputStream);
            eventWriter.add(eventFactory.createStartDocument());
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createDTD("<!DOCTYPE hibernate-configuration PUBLIC" + lfEvent
                    + tab + "\"-//Hibernate/Hibernate Configuration DTD//EN\"" + lfEvent
                    + tab + "\"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd\">"));
            eventWriter.add(lfEvent);
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.HIBERNATE_CONFIGURATION));
            eventWriter.add(lfEvent);
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.SESSION_FACTORY));
            eventWriter.add(lfEvent);
            LinkedHashMap<String, String> property = hibernate.getProperty();
            for (Map.Entry<String, String> set : property.entrySet()) {
                createNodeProperty(eventWriter, set.getKey(), set.getValue());
            }
            eventWriter.add(lfEvent);
            LinkedHashMap<String, String> mapping = hibernate.getMapping();
            for (Map.Entry<String, String> set : mapping.entrySet()) {
                createNodeMapping(eventWriter, set.getKey(), set.getValue());
            }
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.SESSION_FACTORY));
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.HIBERNATE_CONFIGURATION));
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createEndDocument());
            eventWriter.close();
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void createNodeProperty(XMLEventWriter eventWriter, String value, String valueAttr) throws XMLStreamException {
        XMLEvent tab1 = eventFactory.createDTD("\t\t");
        StartElement sElement = eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.PROPERTY);
        Attribute attribute = eventFactory.createAttribute(HibernateField.NAME, value);
        eventWriter.add(tab1);
        eventWriter.add(sElement);
        eventWriter.add(attribute);
        Characters characters = eventFactory.createCharacters(valueAttr);
        eventWriter.add(characters);
        EndElement eElement = eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.PROPERTY);
        eventWriter.add(eElement);
        eventWriter.add(lfEvent);
    }

    private void createNodeMapping(XMLEventWriter eventWriter, String value, String valueAttr) throws XMLStreamException {
        XMLEvent tab1 = eventFactory.createDTD("\t\t");
        StartElement sElement = eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI,HibernateField.MAPPING);
        Attribute attribute = eventFactory.createAttribute(HibernateField.CLASS, value);
        eventWriter.add(tab1);
        eventWriter.add(sElement);
        eventWriter.add(attribute);
        EndElement eElement = eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI,HibernateField.MAPPING);
        eventWriter.add(eElement);
        eventWriter.add(lfEvent);
    }
}
