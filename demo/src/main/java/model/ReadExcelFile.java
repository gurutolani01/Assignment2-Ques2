package model;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReadExcelFile
{
    //    String data = "";
    public  List<DataStructure> readExcel() {
        FileInputStream fis;
        String address = "C:\\Users\\gurudas.tolani\\Downloads\\demo (1)\\demo\\src\\main\\resources\\Accolite Interview Data - Q4 2023 - Grad Program November 2023.xlsx";
            try {
                fis = new FileInputStream(address);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        Workbook wb;
            try {
                wb = WorkbookFactory.create(fis);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        Sheet sheet = wb.getSheet("Sheet1");

        Iterator<Row> it = sheet.iterator();
        List<DataStructure> interviewData = new ArrayList<>();



        while (it.hasNext()) {
            Row currentRow = it.next();
            if (currentRow.getRowNum() == 0) {
                continue;
            }
            DataStructure ds =new DataStructure();
////            SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-yy");
////            ds.setDate(currentRow.getCell(0).getStringCellValue());
            double numericValue = currentRow.getCell(0).getNumericCellValue();
//
//            // Convert the numeric value to a Java Date object
            Date javaDate =  DateUtil.getJavaDate(numericValue);
            ds.setDate(javaDate);
            Cell monthCell= currentRow.getCell(1);

            ds.setMonth(monthCell.getStringCellValue());
//
            ds.setTeam(currentRow.getCell(2).getStringCellValue());

            ds.setPanelName(currentRow.getCell(3).getStringCellValue());

            ds.setRound(currentRow.getCell(4).getStringCellValue());

            ds.setSkill(currentRow.getCell(5).getStringCellValue());
//
           Cell timeCell=currentRow.getCell(6);
           double time = timeCell.getNumericCellValue();
            Date javaTime =  DateUtil.getJavaDate(time);
            ds.setDate(javaTime);
            ds.setCandidateCurrentLocation(currentRow.getCell(7).getStringCellValue());

            ds.setCandidatePrefferedLocation(currentRow.getCell(8).getStringCellValue());

            ds.setCandidateName(currentRow.getCell(9).getStringCellValue());

            interviewData.add(ds);



        }
        return interviewData;

    }
    public void showType()
    {
        FileInputStream fis;
        String address = "C:\\Users\\gurudas.tolani\\Downloads\\demo (1)\\demo\\src\\main\\resources\\Accolite Interview Data - Q4 2023 - Grad Program November 2023.xlsx";
        try {
            fis = new FileInputStream(address);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Workbook wb;
        try {
            wb = WorkbookFactory.create(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet = wb.getSheet("Sheet1");
        for(Row row: sheet)
        {
            for (Cell cell:row)
            {
                System.out.print(cell.getCellType());
            }
            System.out.println();
        }


    }






}
