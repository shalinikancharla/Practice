package TDDFrameWork;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Log;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ApachePOI {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/shali/Downloads/student_data.xlsx");
        FileInputStream fis=new FileInputStream(file);  //read the file
        XSSFWorkbook workbook= new XSSFWorkbook(fis); //create a work book here work book as one excel file
        XSSFSheet sheet=workbook.getSheet("sheet1");  //get the sheet from work book

         //read the value of a particular cell,like get the address of the student present in the second row.
        //Create a row object to retrieve row at index 1
        XSSFRow row2=sheet.getRow(1);

        //Create a cell object to retreive cell at index 5
        XSSFCell cell=row2.getCell(4);
        //Get the address in a variable
        String address= cell.getStringCellValue();

        //Printing the address
        System.out.println("Address is :"+ address);

//        //get the mobile present in the first row
//        XSSFRow row1=sheet.getRow(1);
//       XSSFCell cellMobile= row1.getCell(4); //get the mobile from cell
//        Number mobile=cellMobile.getNumericCellValue();
//
//        System.out.println("mobile number:"+mobile);


        //get email present in the first row
        XSSFRow row1=sheet.getRow(1);

        XSSFCell cellEmail=row1.getCell(2);
        String email= cellEmail.getStringCellValue();
        System.out.println("Email:"+email);



        //get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        System.out.println(rowCount);
        System.out.println(sheet.getLastRowNum());
        System.out.println(sheet.getFirstRowNum());
        //Create a row object to retrieve row at index 3
        XSSFRow row3=sheet.createRow(3);


//To write into Excel File
        row3.createCell(0).setCellValue("Piya");

        FileOutputStream outputStream = new FileOutputStream("Data/student_data.xls");
        workbook.write(outputStream);



        //iterate over all the row to print the data present in each cell.
        for(int i=0;i<=rowCount;i++){

            //get cell count in a row
            int cellCount=sheet.getRow(i).getLastCellNum();

            //iterate over each cell to print its value
            System.out.println("Row "+ i+" data is :");

            for(int j=0;j<cellCount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+ " ");
            }
            System.out.println();
        }


//        //Create a row object to retrieve row at index 3
//        XSSFRow row3=sheet.createRow(3);
//
//
////To write into Excel File
//        row3.createCell(6).setCellValue("Diana");
//
//        FileOutputStream outputStream = new FileOutputStream("Data/student_data.xls");
//        workbook.write(outputStream);
        workbook.close();



    }

}
