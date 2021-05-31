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
        private final XMLEventFactory xmlEventFactory = XMLEventFactory.newInstance();
        private final XMLEvent tab = xmlEventFactory.createDTD("\t");
        private final XMLEvent newLine = xmlEventFactory.createDTD("\n");

        public void createFile(String pathToFileConfig, HibernateConfig hibernateConfig) {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();

            try (OutputStream outputStream = new FileOutputStream(pathToFileConfig)) {
                XMLEventWriter xmlEventWriter = xmlOutputFactory.createXMLEventWriter(outputStream);
                xmlEventWriter.add(xmlEventFactory.createStartDocument());
                xmlEventWriter.add(newLine);
                xmlEventWriter.add(xmlEventFactory
                        .createDTD("<!DOCTYPE hibernate-configuration PUBLIC\n"
                        + "\t\t\"-//Hibernate/Hibernate Configuration DTD//EN\"\n"
                        + "\t\t\"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd\">\n"));
                xmlEventWriter.add(newLine);
                xmlEventWriter.add(xmlEventFactory
                        .createStartElement("", "", "hibernate-configuration"));
                xmlEventWriter.add(newLine);
                xmlEventWriter.add(tab);
                xmlEventWriter.add(xmlEventFactory
                        .createStartElement("", "", "session-factory"));
                xmlEventWriter.add(newLine);
                LinkedHashMap<String, String> property = hibernateConfig.getMapProperty();
                LinkedHashMap<String, String> mapping = hibernateConfig.getMapMapping();

                for (Map.Entry<String, String> set : property.entrySet()) {
                    createPropertyNode(xmlEventWriter, set.getKey(), set.getValue());
                }
                xmlEventWriter.add(newLine);
                for (Map.Entry<String, String> set : mapping.entrySet()) {
                    createMappingNode(xmlEventWriter, set.getKey(), set.getValue());
                }
                xmlEventWriter.add(tab);
                xmlEventWriter.add(xmlEventFactory
                        .createEndElement("", "", "session-factory"));
                xmlEventWriter.add(newLine);
                xmlEventWriter.add(xmlEventFactory
                        .createEndElement("", "", "hibernate-configuration"));
                xmlEventWriter.add(newLine);
                xmlEventWriter.add(xmlEventFactory
                        .createEndDocument());
                xmlEventWriter.close();
            } catch (IOException | XMLStreamException e) {
                e.printStackTrace();
            }
        }

        private void createMappingNode(XMLEventWriter xmlEventWriter, String attributeValue, String value)
                throws XMLStreamException {
            XMLEvent dualTab = xmlEventFactory.createDTD("\t\t");
            StartElement startElement = xmlEventFactory.createStartElement("", "", "mapping");
            Attribute attribute = xmlEventFactory.createAttribute(value, attributeValue);
            xmlEventWriter.add(dualTab);
            xmlEventWriter.add(startElement);
            xmlEventWriter.add(attribute);
            EndElement endElement = xmlEventFactory.createEndElement("", "", "mapping");
            xmlEventWriter.add(endElement);
            xmlEventWriter.add(newLine);
        }

        private void createPropertyNode(XMLEventWriter xmlEventWriter, String attributeValue, String value)
                throws XMLStreamException {
            XMLEvent dualTab = xmlEventFactory.createDTD("\t\t");
            StartElement startElement = xmlEventFactory.createStartElement("", "", "property");
            Attribute attribute = xmlEventFactory.createAttribute("name", attributeValue);
            xmlEventWriter.add(dualTab);
            xmlEventWriter.add(startElement);
            xmlEventWriter.add(attribute);
            Characters characters = xmlEventFactory.createCharacters(value);
            xmlEventWriter.add(characters);
            EndElement endElement = xmlEventFactory.createEndElement("", "", "property");
            xmlEventWriter.add(endElement);
            xmlEventWriter.add(newLine);
        }
}
