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
import java.util.LinkedHashMap;
import java.util.Map;

public class HibernateReader {
    static Map<String, String> propertyMap = new LinkedHashMap<>();
    static Map<String, String> mappingMap = new LinkedHashMap<>();

    public HibernateConfig readConfig(String pathToXML) {
        HibernateConfig Hibernate = new HibernateConfig();

        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = inputFactory.createXMLEventReader(new FileInputStream(pathToXML));

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    String elementName = startElement.getName().getLocalPart();
                    switch (elementName) {
                        case HibernateFields.PROPERTY:
                            String name = getAttributeValueByName(startElement, HibernateFields.NAME);
                            event = eventReader.nextEvent();
                            String value = event.asCharacters().getData();
                            if (name != null) {
                                propertyMap.put(name, value);
                            }
                            break;
                        case HibernateFields.MAPPING:
                            String classValue = getAttributeValueByName(startElement, HibernateFields.CLASS);
                            if (classValue != null) {
                                mappingMap.put(classValue, HibernateFields.CLASS);
                            }
                    }
                }
            }
            Hibernate.setMapMapping(mappingMap);
            Hibernate.setMapProperty(propertyMap);

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return Hibernate;
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
