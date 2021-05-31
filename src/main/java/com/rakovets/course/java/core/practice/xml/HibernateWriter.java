package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public class HibernateWriter {
    private final static String EMPTY_PREFIX = "";
    private final static String EMPTY_NAMESPACE_URI = "";

    private final XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    private final XMLEvent lfEvent = eventFactory.createDTD("\n");
    private final XMLEvent tab = eventFactory.createDTD("\t");

    public void writeConfig(HibernateConfiguration hibernateConfiguration, Path path) {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        try (OutputStream outputStream = new FileOutputStream(String.valueOf(path))) {
            XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(outputStream);
            eventWriter.add(eventFactory.createStartDocument());
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createDTD("<!DOCTYPE hibernate-configuration PUBLIC\n" +
                    "\t\t\"-//Hibernate/Hibernate Configuration DTD//EN\"\n" +
                    "\t\t\"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd\">\n"));
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, "hibernate-configuration"));
            eventWriter.add(lfEvent);
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, "session-factory"));
            eventWriter.add(lfEvent);
            LinkedHashMap<String, String> property = hibernateConfiguration.getMapProperty();
            LinkedHashMap<String, String> mapping = hibernateConfiguration.getMapMapping();
            for (Map.Entry<String, String> set : property.entrySet()) {
                createPropertyNode(eventWriter, set.getKey(), set.getValue());
            }
            eventWriter.add(lfEvent);
            for (Map.Entry<String, String> set : mapping.entrySet()) {
                createMappingNode(eventWriter, set.getKey(), set.getValue());
            }
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, "session-factory"));
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, "hibernate-configuration"));
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createEndDocument());
            eventWriter.close();
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void createMappingNode(XMLEventWriter eventWriter, String value, String valueAttr) throws XMLStreamException {
        XMLEvent tab = eventFactory.createDTD("\t\t");
        StartElement sElement = eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, "mapping");
        Attribute attr = eventFactory.createAttribute(valueAttr, value);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        eventWriter.add(attr);
        EndElement eElement = eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, "mapping");
        eventWriter.add(eElement);
        eventWriter.add(lfEvent);
    }

    private void createPropertyNode(XMLEventWriter eventWriter, String value, String valueAttr) throws XMLStreamException {
        XMLEvent tab = eventFactory.createDTD("\t\t");
        StartElement sElement = eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, "property");
        Attribute attr = eventFactory.createAttribute("name", value);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        eventWriter.add(attr);
        Characters characters = eventFactory.createCharacters(valueAttr);
        eventWriter.add(characters);
        EndElement eElement = eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, "property");
        eventWriter.add(eElement);
        eventWriter.add(lfEvent);
    }}
