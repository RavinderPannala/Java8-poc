package com.java8.features.strings;

import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ExcelSheet {

    //A B
    //D5:D5
    //A2:B
    //2A:B1
    //empty
    //2A:
    //22:33
    //d5:a2A
    //A2:b12

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.isEmpty() && s.length() == 0) {
            System.out.println("Please provide proper output");
        } else {
            String[] excelSheet = s.split(":");
            if (excelSheet != null & excelSheet.length > 1) {
                String sheet1 = excelSheet[0];  //--A1
                String sheet2 = excelSheet[1];  //--B12
                if ((!sheet1.isEmpty() && sheet1.length() > 1) && (!sheet2.isEmpty() && sheet2.length() > 1)) {
                    if (sheet1.matches(".*\\d.*") && sheet2.matches(".*\\d.*")) {
                        if (Character.isAlphabetic(sheet1.charAt(0)) && Character.isAlphabetic(sheet2.charAt(0))) {
                            int istart = Character.codePointAt(sheet1, 0);
                            int iend = Character.codePointAt(sheet2, 0);
                            int beginRowNumber = Integer.parseInt(sheet1.substring(1, sheet1.length()));
                            int endRowNumber = Integer.parseInt(sheet2.substring(1, sheet2.length()));
                            System.out.println("Jstart-->+" + beginRowNumber + "''''" + endRowNumber);
                            List<String> list = new ArrayList<>();
                            if (istart <= iend) {
                                for (int i = istart; i <= iend; i++) {
                                    for (int j = beginRowNumber; j <= endRowNumber; j++) {
                                        list.add(Character.toString((char) i) + j);
                                    }
                                }
                                System.out.println(list);
                            }
                        }
                    }
                }
            } else {
                System.out.println("Sheet doesn't contain number");
            }
        }

    }


    //A2,A3,A4,A5,A6
    //B2,B3,B4,B5,B6
}
