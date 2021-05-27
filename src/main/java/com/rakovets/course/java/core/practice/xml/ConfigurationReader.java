package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class ConfigurationReader {

    public static void readConfiguration(String filePath, ConfigurationHibernate configurationHibernate) {
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = inputFactory.createXMLEventReader(new FileInputStream(filePath));
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    String elementName = startElement.getName().getLocalPart();
                    if (elementName.equals(ConfigurationFields.PROPERTY.getType())) {
                        String name = getAttributeValueByName(startElement, ConfigurationFields.NAME.getType());
                        event = eventReader.nextEvent();
                        String value = event.asCharacters().getData();
                        if (name != null) {
                            configurationHibernate.putToProperties(name, value);
                        }
                    } else if(elementName.equals(ConfigurationFields.MAPPING.getType())) {
                        String value = getAttributeValueByName(startElement, ConfigurationFields.CLASS.getType());
                        if (value != null) {
                            configurationHibernate.putToMapping(ConfigurationFields.CLASS.getType(),value);
                        }
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException  e) {
            e.printStackTrace();
        }
    }

    private static String getAttributeValueByName(StartElement startElement, String attributeName) {
        String attributeStringValue = "";
        Iterator<Attribute> attributes = startElement.getAttributes();
        while (attributes.hasNext()) {
            Attribute attribute = attributes.next();
            if (attribute.getName().toString().equals(attributeName)) {
                attributeStringValue = attribute.getValue();
            }
        }
        return attributeStringValue;
    }
}

