
package Business;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author zhaoxi
 */
public class ExcelRead {
    
    private static Workbook wb;
    private static Sheet sheet;
    private static FileInputStream fis;
    private static FileOutputStream fos;
    private static Row row;  
   
    public int rowNumber() throws Exception{
        fis = new FileInputStream("/Users/zhaoxi/Desktop/2020 Fall/INFO5100-Application Engineer & Development/Lab Assignment/Assignment2/Car.xlsx");
        wb = WorkbookFactory.create(fis);
        sheet = wb.getSheet("Sheet1");
        int rowNumber = sheet.getLastRowNum();
        return rowNumber;
    }
    
    /**
    *
    * @author zhaoxi
    * @param i Row index starting from 0
    * @param j Column index starting from 0
    */
    public String StringCell(int i, int j) throws Exception{
        
        fis = new FileInputStream("/Users/zhaoxi/Desktop/2020 Fall/INFO5100-Application Engineer & Development/Lab Assignment/Assignment2/Car.xlsx");
        wb = WorkbookFactory.create(fis);
        sheet = wb.getSheet("Sheet1");
        Cell cell = sheet.getRow(i).getCell(j);
        String text = cell.getStringCellValue();
        return text;
        }
       
    /**
    *
    * @author zhaoxi
    * @param i Row index starting from 0
    * @param j Column index starting from 0
    */
    public int intCell(int i, int j) throws Exception{
        fis = new FileInputStream("/Users/zhaoxi/Desktop/2020 Fall/INFO5100-Application Engineer & Development/Lab Assignment/Assignment2/Car.xlsx");
        wb = WorkbookFactory.create(fis);
        sheet = wb.getSheet("Sheet1");
        Cell cell = sheet.getRow(i).getCell(j);
        int num = (int) cell.getNumericCellValue();
        return num;
        }
    
    public String timeCell(int i, int j) throws Exception{
        fis = new FileInputStream("/Users/zhaoxi/Desktop/2020 Fall/INFO5100-Application Engineer & Development/Lab Assignment/Assignment2/Car.xlsx");
        wb = WorkbookFactory.create(fis);
        sheet = wb.getSheet("Sheet1");
        Cell cell = sheet.getRow(i).getCell(j);
        String s = Double.toString(cell.getNumericCellValue());
        return s;
        }
    
    
    public CarList loadCarList() throws Exception{
        
        ExcelRead carExcel = new ExcelRead();
        fis = new FileInputStream("/Users/zhaoxi/Desktop/2020 Fall/INFO5100-Application Engineer & Development/Lab Assignment/Assignment2/Car.xlsx");
        wb = WorkbookFactory.create(fis);
        sheet = wb.getSheet("Sheet1");
        Cell cell = sheet.getRow(1).getCell(4);
        
        CarList carList = new CarList();
            for (int i = 1; i < carExcel.rowNumber(); i++) {
                Car car = carList.addCar();
                car.setBrand(carExcel.StringCell(i, 0));
                car.setModel(carExcel.StringCell(i, 1));
                car.setPlatenumber(carExcel.StringCell(i, 2));
                car.setSeat(carExcel.intCell(i,3));
                car.setAvaliableTime(carExcel.StringCell(i,4));
                car.setLocation(carExcel.StringCell(i,5));
                car.setSerialnumber(carExcel.StringCell(i,6));
                car.setManufactureYear(carExcel.intCell(i,7));
                car.setMaintenanceCertification(carExcel.StringCell(i,8));
                car.setFleetcatalog(carExcel.StringCell(i,9));
            }
            return carList;
    }

    public static Workbook getWb() {
        return wb;
    }

    public static void setWb(Workbook wb) {
        ExcelRead.wb = wb;
    }

    public static Sheet getSheet() {
        return sheet;
    }

    public static void setSheet(Sheet sheet) {
        ExcelRead.sheet = sheet;
    }

    public static FileInputStream getFis() {
        return fis;
    }

    public static void setFis(FileInputStream fis) {
        ExcelRead.fis = fis;
    }

    public static FileOutputStream getFos() {
        return fos;
    }

    public static void setFos(FileOutputStream fos) {
        ExcelRead.fos = fos;
    }

    public static Row getRow() {
        return row;
    }

    public static void setRow(Row row) {
        ExcelRead.row = row;
    }
    
//    public static void main(String[] args) throws Exception {
//        ExcelRead carExcel = new ExcelRead();
//        fis = new FileInputStream("/Users/zhaoxi/Desktop/2020 Fall/INFO5100-Application Engineer & Development/Lab Assignment/Assignment2/Car.xlsx");
//        wb = WorkbookFactory.create(fis);
//        sheet = wb.getSheet("Sheet1");
//        
//        
//        for (int i = 0; i < 10; i++) {
//            Cell cell = sheet.getRow(1).getCell(i);
//            
//            System.out.println(cell.getCellType());
//        }
//        
//    }
    
    
}
            
