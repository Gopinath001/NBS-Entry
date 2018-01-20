/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author jess
 */
public class excel_working {
    
    private static String[] Columns = {"Col_0", "Col_1", "Col_2"};
    
    public static void main() throws IOException{
    
        Workbook WrB = new XSSFWorkbook();
        CreationHelper createHelper = WrB.getCreationHelper();
        Sheet Sht = WrB.createSheet("Contents");
        Font FntH = WrB.createFont();
        FntH.setBold(true);
        FntH.setFontHeight((short)14);
        CellStyle FntHCellStle = WrB.createCellStyle();
        FntHCellStle.setFont(FntH);
       
        //creating 
        Row hRow = Sht.createRow(0);
        for(int i =0;i<Columns.length;i++){
            Cell  xCel = hRow.createCell(i);
            xCel.setCellValue(Columns[i]);
            xCel.setCellValue(Columns[i]);
        }
                
                
                
                
                
                
        
        
        
        

        
        
        
        
        
        //actual writing to file
        try {
            FileOutputStream create = new FileOutputStream("month-here.xls");
            WrB.write(create);
            create.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(excel_working.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    class DataToFeed
    {   
        //stuff like that
        private String S_No;
    }
}
