package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.events.XMLEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ConfigurationWriter {
    private static final XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    private static final XMLEvent lf = eventFactory.createDTD("\n");
    private static final XMLEvent tab = eventFactory.createDTD("\t");

    public static void writeConfig(ConfigurationHibernate configurationHibernate, String filePath) {
        try {
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileWriter(filePath));
            writer.writeStartDocument();
            writer.writeDTD("\n");
            writer.writeDTD("<!DOCTYPE hibernate-configurationHibernate PUBLIC" + lf  + tab+ "\"-//Hibernate/Hibernate Configuration DTD//EN\"" + lf + tab + "\"http://www.hibernate.org/dtd/hibernate-configurationHibernate-3.0.dtd\">");
            writer.writeDTD("\n");
            writer.writeDTD("\n");
            writer.writeStartElement(ConfigurationFields.HIBERNATE_CONFIGURATION_HIBERNAME.getType());
            writer.writeDTD("\n");
            writer.writeDTD("\t");
            writer.writeStartElement(ConfigurationFields.SESSION_FACTORY.getType());
            writer.writeDTD("\n");
            for (Map.Entry<String, String> property : configurationHibernate.getProperties().entrySet()) {
                writer.writeDTD("\t\t");
                writer.writeStartElement(ConfigurationFields.PROPERTY.getType());
                writer.writeAttribute(ConfigurationFields.NAME.getType(), property.getKey());
                writer.writeCharacters(property.getValue());
                writer.writeEndElement();
                writer.writeDTD("\n");
            }
            for (Map.Entry<String, String> mapping : configurationHibernate.getMapping().entrySet()) {
                writer.writeDTD("\t\t");
                writer.writeStartElement(ConfigurationFields.PROPERTY.getType());
                writer.writeAttribute(ConfigurationFields.NAME.getType(), mapping.getKey());
                writer.writeCharacters(mapping.getValue());
                writer.writeEndElement();
                writer.writeDTD("\n");
            }
            writer.writeDTD("\t");
            writer.writeEndElement();
            writer.writeDTD("\n");
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.close();
        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
    }
}
