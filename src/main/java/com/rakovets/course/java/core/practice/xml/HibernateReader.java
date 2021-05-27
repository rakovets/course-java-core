package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HibernateReader {
    public HibernateConfiguration readConfig(String pathToXML) {
        HibernateConfiguration Hibernate = new HibernateConfiguration();
        Mapping mapping = new Mapping();
        Property property = new Property();
        List<Mapping> mappingList = new ArrayList<>();
        List<Property> propertyList = new ArrayList<>();
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = inputFactory.createXMLEventReader(new FileInputStream(pathToXML));
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    String elementName = startElement.getName().getLocalPart();
                    switch (elementName) {
                        case HibernateField.PROPERTY:
                            property = new Property();
                            String name = getAttributeValueByName(startElement, HibernateField.NAME);
                            event = eventReader.nextEvent();
                            String value = event.asCharacters().getData();
                            if (name != null) {
                                property.setName(name);
                                property.setValue(value);
                            }
                            break;
                        case HibernateField.MAPPING:
                            mapping = new Mapping();
                            String classValue = getAttributeValueByName(startElement, HibernateField.CLASS);
                            event = eventReader.nextEvent();
                            if (classValue != null) {
                                mapping.setName(HibernateField.CLASS);
                                mapping.setValue(classValue);
                            }
                    }
                }

                if (event.isEndElement()) {
                    EndElement endElement = event.asEndElement();
                    if (endElement.getName().getLocalPart().equals(HibernateField.PROPERTY)) {
                        propertyList.add(property);
                    } else if (endElement.getName().getLocalPart().equals(HibernateField.MAPPING)) {
                        mappingList.add(mapping);
                    }
                }
            }
            Hibernate.setMappingList(mappingList);
            Hibernate.setPropertyList(propertyList);

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return Hibernate;
    }

    private static String getAttributeValueByName(StartElement startElement, String attributeName) {
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
