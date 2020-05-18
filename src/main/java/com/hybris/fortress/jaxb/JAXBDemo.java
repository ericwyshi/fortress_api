package com.hybris.fortress.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JAXBDemo {

    /**
     * 我们将Java对象转换为XML的过程称之为Marshal，将XML转换为Java对象的过程称之为UnMarshal
     */
    public static void testMarshaller() throws JAXBException { // Java To Xml
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // marshaller.marshal(new Student("10","sam",30), System.out);
        StringWriter sw = new StringWriter();
        Student sam = new Student("10", "sam", 30);
        List<String> courses = new ArrayList<>();
        courses.add("math");
        courses.add("language");
        sam.setCourse(courses);
        marshaller.marshal(sam, sw);
        System.out.println(sw.toString());
    }

    public static void testUnmarshaller() throws JAXBException, FileNotFoundException { // Xml To Java
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        String fileLoc = "D:\\project\\github\\fortress_api\\src\\main\\java\\com\\hybris\\fortress\\jaxb\\student.xml";
        File file = new File(fileLoc);
        if ( file.exists() ){
            FileInputStream fis = new FileInputStream(fileLoc);
            Student student = (Student)unmarshaller.unmarshal(fis);
            System.out.println(student);
        } else {
            System.out.println("file not exist!");
        }
    }

}
