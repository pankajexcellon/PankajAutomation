//package test;
//
//import java.io.InputStream;
//import org.apache.poi.ss.usermodel.*;
//
//public class ReadExcel {
//
//    public static void main(String[] args) {
//
//        try {
//            // Load Excel file from resources
//            InputStream is = ReadExcel.class
//                    .getResourceAsStream("/TestData/Book11.xlsx");
//
//            if (is == null) {
//                throw new RuntimeException("Excel file not found in resources");
//            }
//
//            Workbook workbook = WorkbookFactory.create(is);
//            Sheet sheet = workbook.getSheet("Sheet1");
//
//            for (Row row : sheet) {
//                for (Cell cell : row) {
//                    System.out.print(cell.toString() + "\t");
//                }
//                System.out.println();
//            }
//
//            workbook.close();
//            is.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
