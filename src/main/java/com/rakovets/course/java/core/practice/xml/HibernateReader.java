package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class HibernateReader {
    HibernateConfiguration hibernateConfiguration;

    public HibernateReader(HibernateConfiguration hibernate) {
        this.hibernateConfiguration = hibernate;
    }

    public void readXmlFile(String path) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        XMLEventReader eventReader = inputFactory.createXMLEventReader(new FileInputStream(path));

        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();
            if (event.isStartElement()) {
                StartElement startElement = event.asStartElement();
                String elementName = startElement.getName().getLocalPart();
                switch (elementName) {
                    case HibernateField.PROPERTY:
                        String attributeNameProperty = getAttributeValueByName(startElement, HibernateField.NAME);
                        event = eventReader.nextEvent();
                        hibernateConfiguration.putInPropertyMap(attributeNameProperty, event.toString());
                        break;
                    case HibernateField.MAPPING:
                        String attributeNameMapping = getAttributeValueByName(startElement, HibernateField.CLASS);
                        hibernateConfiguration.putInMappingMap(HibernateField.CLASS, attributeNameMapping);
                        break;
                }
            }
        }
    }

    private String getAttributeValueByName(StartElement startElement, String attributeName) {
        Iterator<Attribute> attributes = startElement.getAttributes();
        while (attributes.hasNext()) {
            Attribute attribute = attributes.next();
            if (attribute.getName().toString().equals(attributeName)) {
                return attribute.getValue();
            }
        }
        return null;
    }
}
