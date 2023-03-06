package com.java8.features.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StudentUtils {

    public static Optional<List<Student>> fetchStudent() {
        List<Student> studentList = new ArrayList<Student>();

        Address stuAddress1 = new Address("Hyderabad, address1", 0);
        Address stuAddress2 = new Address("Hyderabad, address2", 0);
        Address stdAddress3 = new Address("Hyderabad, address3", 0);
        List<Address> stdAddresses = Arrays.asList(stuAddress1, stuAddress2, stdAddress3);
        Student student = new Student("RAVI", "Pannala", null, stdAddresses, 234000L, "CSE", 41451,"MALE");
        studentList.add(student);

        Address std2Address1 = new Address("Vikarabad, address1", 37468787);
        Address std2Address2 = new Address("Kondapur, address2", 387468);
        Address std2Address3 = new Address("Hyderabad, address3", 0);
        List<Address> std2Addresses = Arrays.asList(std2Address1, std2Address2, std2Address3);
        Student student2 = new Student("Ayaan", "Pannala", null, std2Addresses, 43000l, "ECE", 41453,"MALE");
        studentList.add(student2);

        Address std3Address1 = new Address("Miyapur, address1", 0);
        Address std3Address2 = new Address("Hitech city, address2", 37473657);
        Address std3Address3 = new Address("Gachibowli, address3", 0);
        List<Address> std3Addresses = Arrays.asList(std3Address1, std3Address2, std3Address3);

        Student student3 = new Student("Charvik", "Pannala", null, std3Addresses, 32342L, "MEC", 41454,"MALE");
        studentList.add(student3);

        Address std4Address1 = new Address("Anantapur, address1", 0);
        Address std4Address2 = new Address("Kurnool, address3", 0);
        List<Address> std4Addresses = Arrays.asList(std4Address1, std4Address2, std3Address3);

        Student student4 = new Student("Lavanya", "Etikyla", null, std4Addresses, 34534L, "EEE", 41456,"FEMALE");
        studentList.add(student4);


        return  Optional.of(studentList);
    }

    public static List<Student> fetchAllStudent() {
        List<Student> studentList = new ArrayList<Student>();

        Address stuAddress1 = new Address("Hyderabad, address1", 0);
        Address stuAddress2 = new Address("Hyderabad, address2", 0);
        Address stdAddress3 = new Address("Hyderabad, address3", 0);
        List<Address> stdAddresses = Arrays.asList(stuAddress1, stuAddress2, stdAddress3);
        Student student = new Student("RAVI", "Pannala", null, stdAddresses, 234000L, "CSE", 41451,"MALE");
        studentList.add(student);

        Address std2Address1 = new Address("Vikarabad, address1", 37468787);
        Address std2Address2 = new Address("Kondapur, address2", 387468);
        Address std2Address3 = new Address("Hyderabad, address3", 0);
        List<Address> std2Addresses = Arrays.asList(std2Address1, std2Address2, std2Address3);
        Student student2 = new Student("Ayaan", "Pannala", null, std2Addresses, 43000l, "ECE", 41453,"MALE");
        studentList.add(student2);

        Address std3Address1 = new Address("Miyapur, address1", 0);
        Address std3Address2 = new Address("Hitech city, address2", 37473657);
        Address std3Address3 = new Address("Gachibowli, address3", 0);
        List<Address> std3Addresses = Arrays.asList(std3Address1, std3Address2, std3Address3);

        Student student3 = new Student("Charvik", "Pannala", null, std3Addresses, 32342L, "MEC", 41454,"MALE");
        studentList.add(student3);

        Address std4Address1 = new Address("Anantapur, address1", 0);
        Address std4Address2 = new Address("Kurnool, address3", 0);
        List<Address> std4Addresses = Arrays.asList(std4Address1, std4Address2, std3Address3);

        Student student4 = new Student("Lavanya", "Etikyla", null, std4Addresses, 34534L, "EEE", 41456,"FEMALE");
        studentList.add(student4);


        return  studentList;
    }

}
