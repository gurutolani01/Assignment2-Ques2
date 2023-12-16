package model;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile
{
    //    String data = "";
    FileInputStream fis;

    {
        try {
            fis = new FileInputStream("C:\\Users\\gurudas.tolani\\Downloads\\demo (1)\\demo\\src\\main\\resources\\Accolite Interview Data - Q4 2023 - Grad Program November 2023.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    Workbook wb;

    {
        try {
            wb = WorkbookFactory.create(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Sheet s =wb.getSheet("Sheet1");
  //    int i,j;
    //    for(int i=0)
//     Row r = s.getRow(5);
//     Cell c = r.getCell(3);
//     String data = c.getStringCellValue();
     public void getCellValue() {
         
         for (Row r : s) {
             for (Cell c : r) {
                 switch (c.getCellType()) {
                     case STRING:
                         System.out.print(c.getStringCellValue() + "\t");
                         break;
                     case NUMERIC:
                         System.out.print(c.getNumericCellValue() + "\t");
                         break;
                     case BOOLEAN:
                         System.out.print(c.getBooleanCellValue() + "\t");
                         break;
                     case BLANK:
                         System.out.print("[BLANK]\t");
                         break;
                     default:
                         System.out.print("[UNKNOWN]\t");
                 }

             }
             System.out.println();
//         System.out.println(data);
         }
     }
}
