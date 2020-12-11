package com.rakovets.course.javabasics.practice.xml;

import com.rakovets.course.javabasics.practice.xml.model.Mapping;
import com.rakovets.course.javabasics.practice.xml.model.Property;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class XMLWriter {

    private final XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    private final XMLEvent lfEvent = eventFactory.createDTD("\n");
    private final XMLEvent tab = eventFactory.createDTD("\t");

    public void addConfigToXML(String configFilepath, Hibernate lists) {
        // create an XMLOutputFactory
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        try (OutputStream outputStream = new FileOutputStream(configFilepath)) {
            // create XMLEventWriter
            XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(outputStream);
            // create and write Start Tag
            eventWriter.add(eventFactory.createStartDocument());
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createDTD("<!DOCTYPE hibernate-configuration PUBLIC\n" +
                    "\t-//Hibernate/Hibernate Configuration DTD//EN\n" +
                    "\thttp://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd>\n"));
            eventWriter.add(lfEvent);
            // create config open tag
            eventWriter.add(eventFactory.createStartElement("", "", "hibernate-configuration"));
            eventWriter.add(lfEvent);
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createStartElement("", "", "session-factory"));
            eventWriter.add(lfEvent);
            // Write the different nodes
            List<Property> propertyList = lists.getPropertyList();
            List<Mapping> mapList = lists.getMappingList();
            for (Property el : propertyList) {

                createPropertyNode(eventWriter, el.getName(), el.getValue());
            }
            eventWriter.add(lfEvent);
            for (Mapping el : mapList) {
                createMappingNode(eventWriter, el.getValue(), el.getName());
            }
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createEndElement("", "", "session-factory"));
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createEndElement("", "", "hibernate-configuration"));
            eventWriter.add(lfEvent);
            eventWriter.add(eventFactory.createEndDocument());
            eventWriter.close();
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void createPropertyNode(XMLEventWriter eventWriter, String value, String valueAttr) throws XMLStreamException {
        XMLEvent tab = eventFactory.createDTD("\t");
        StartElement sElement = eventFactory.createStartElement("", "", "property");
        Attribute attr = eventFactory.createAttribute("name", value);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        eventWriter.add(attr);
        Characters characters = eventFactory.createCharacters(valueAttr);
        eventWriter.add(characters);
        EndElement eElement = eventFactory.createEndElement("", "", "property");
        eventWriter.add(eElement);
        eventWriter.add(lfEvent);
    }

    private void createMappingNode(XMLEventWriter eventWriter, String value, String valueAttr) throws XMLStreamException {
        XMLEvent tab = eventFactory.createDTD("\t");
        StartElement sElement = eventFactory.createStartElement("", "", "mapping");
        Attribute attr = eventFactory.createAttribute(valueAttr, value);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        eventWriter.add(attr);
        EndElement eElement = eventFactory.createEndElement("", "", "mapping");
        eventWriter.add(eElement);
        eventWriter.add(lfEvent);
    }
}

