package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class HibernateWriter {
    HibernateConfiguration hibernateConfiguration;
    private final static String EMPTY_PREFIX = "";
    private final static String EMPTY_NAMESPACE_URI = "";
    private final XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    private final XMLEvent lfEvent = eventFactory.createDTD("\n");
    private final XMLEvent tab = eventFactory.createDTD("\t");

    public HibernateWriter(HibernateConfiguration hibernateConfiguration) {
        this.hibernateConfiguration = hibernateConfiguration;
    }

    public void writeConfig(String path) throws XMLStreamException, FileNotFoundException {
        Map<String, String> propertyMap = new LinkedHashMap<>(hibernateConfiguration.getPropertyMap());
        Map<String, String> mappingMap = new LinkedHashMap<>(hibernateConfiguration.getMappingMap());
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        OutputStream outputStream = new FileOutputStream(path);
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(outputStream);
        eventWriter.add(eventFactory.createStartDocument());
        eventWriter.add(lfEvent);
        eventWriter.add(eventFactory.createDTD(HibernateField.DOCTYPE));
        eventWriter.add(lfEvent);
        eventWriter.add(eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.HIBERNATE));
        eventWriter.add(lfEvent);
        eventWriter.add(tab);
        eventWriter.add(eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.SESSION));
        eventWriter.add(lfEvent);
        for (Map.Entry<String, String> map : propertyMap.entrySet()) {
            eventWriter.add(tab);
            createNodeForProperty(eventWriter, HibernateField.PROPERTY, map.getKey(), map.getValue());
        }
        eventWriter.add(lfEvent);
        for (Map.Entry<String,String> map : mappingMap.entrySet()) {
            eventWriter.add(tab);
            createNodeForMapping(eventWriter, HibernateField.MAPPING, map.getKey(), map.getValue());
        }
        eventWriter.add(tab);
        eventWriter.add(eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.SESSION));
        eventWriter.add(lfEvent);
        eventWriter.add(eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, HibernateField.HIBERNATE));
        eventWriter.add(lfEvent);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    private void createNodeForProperty(XMLEventWriter eventWriter, String name, String key, String value) throws  XMLStreamException {
        StartElement startElement = eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, name);
        Attribute attribute = eventFactory.createAttribute(HibernateField.NAME, key);
        eventWriter.add(tab);
        eventWriter.add(startElement);
        eventWriter.add(attribute);
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);
        EndElement endElement = eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, name);
        eventWriter.add(endElement);
        eventWriter.add(lfEvent);
    }

    private void createNodeForMapping(XMLEventWriter eventWriter, String name, String key, String value) throws XMLStreamException {
        StartElement startElement = eventFactory.createStartElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, name);
        Attribute attribute = eventFactory.createAttribute(key, value);
        eventWriter.add(tab);
        eventWriter.add(startElement);
        eventWriter.add(attribute);
        EndElement endElement = eventFactory.createEndElement(EMPTY_PREFIX, EMPTY_NAMESPACE_URI, name);
        eventWriter.add(endElement);
        eventWriter.add(lfEvent);
    }
}
