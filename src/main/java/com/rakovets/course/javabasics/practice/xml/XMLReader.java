package com.rakovets.course.javabasics.practice.xml;

import com.rakovets.course.javabasics.practice.xml.model.Mapping;
import com.rakovets.course.javabasics.practice.xml.model.Property;

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


import static com.rakovets.course.javabasics.practice.xml.model.HibernateField.*;

public class XMLReader {

    public Hibernate readConfig(String pathToXML) {
        Hibernate listOf = new Hibernate();
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
                        case PROPERTY:
                            property = new Property();
                            String name = getAttributeValueByName(startElement, NAME);
                            event = eventReader.nextEvent();
                            String value = event.asCharacters().getData();
                            if (name != null) {
                            }
                            property.setName(name);
                            property.setValue(value);
                            break;

                        case MAPPING:
                            mapping = new Mapping();
                            String classValue = getAttributeValueByName(startElement, CLASS);
                            event = eventReader.nextEvent();
                            if (classValue != null) {
                                mapping.setName(CLASS);
                                mapping.setValue(classValue);
                            } else {
                                String packageValue = getAttributeValueByName(startElement, PACKAGE);
                                if (packageValue != null) {
                                    mapping.setName(PACKAGE);
                                    mapping.setValue(packageValue);
                                }
                            }
                    }
                }

                if (event.isEndElement()) {
                    EndElement endElement = event.asEndElement();
                    if (endElement.getName().getLocalPart().equals(PROPERTY)) {
                        propertyList.add(property);
                    } else if (endElement.getName().getLocalPart().equals(MAPPING)){
                        mappingList.add(mapping);
                    }
                }
            }
            listOf.setMappingList(mappingList);
            listOf.setPropertyList(propertyList);

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return listOf;
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
