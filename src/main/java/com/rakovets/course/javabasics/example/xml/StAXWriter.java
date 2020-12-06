package com.rakovets.course.javabasics.example.xml;


import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StAXWriter {
    private final XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    private final XMLEvent lfEvent = eventFactory.createDTD("\n");

    public void saveConfig(String configFilepath) {
        // create an XMLOutputFactory
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        try (OutputStream outputStream = new FileOutputStream(configFilepath)) {
            // create XMLEventWriter
            XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(outputStream);
            // create and write Start Tag
            eventWriter.add(eventFactory.createStartDocument());
            eventWriter.add(lfEvent);
            // create config open tag
            eventWriter.add(eventFactory.createStartElement("", "", "config"));
            eventWriter.add(lfEvent);
            // Write the different nodes
            createNode(eventWriter, "mode", "1");
            createNode(eventWriter, "unit", "901");
            createNode(eventWriter, "current", "0");
            createNode(eventWriter, "interactive", "0");
            // create config close tag
            eventWriter.add(eventFactory.createEndElement("", "", "config"));
            eventWriter.add(lfEvent);
            // create and write End Tag
            eventWriter.add(eventFactory.createEndDocument());
            eventWriter.close();
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
        XMLEvent tab = eventFactory.createDTD("\t");
        // create Start node
        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        // create Content
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);
        // create End node
        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(lfEvent);
    }
}
