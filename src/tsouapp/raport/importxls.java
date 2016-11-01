package tsouapp.raport;

import jxl.DateCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import tsouapp.raport.data.student;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by alxga on 01.11.2016.
 */
public class importxls {

    student s;

    public importxls(){

    }

    public void imrev(String filedir) throws IOException, BiffException, ParseException {
        ArrayList data = new ArrayList();
        File f = new File(filedir);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        if(f.isDirectory()){
           for(File c:f.listFiles()){
                /*
                xls
                 */
               Workbook workbook = Workbook.getWorkbook(new File("xls/"+c.getName()));
               Sheet sheet = workbook.getSheet(0);
                s = new student(sheet.getCell(6,1).getContents(),
                               sheet.getCell(6,2).getContents(),
                               sheet.getCell(6,3).getContents(),
                               (sheet.getCell(6,4).getContents()!="")?sdf.parse(sheet.getCell(6,4).getContents()):new Date(),
                               sheet.getCell(8,4).getContents()+" "+sheet.getCell(6,5).getContents(),
                               sheet.getCell(6,6).getContents(),
                               sheet.getCell(4,8).getContents(),
                               sheet.getCell(4,10).getContents(),
                               (sheet.getCell(7, 10).getContents()!="")?sdf.parse(sheet.getCell(7, 10).getContents()):new Date(),
                               sheet.getCell(9,10).getContents()+" "+sheet.getCell(4,11).getContents(),
                               sheet.getCell(4,12).getContents(),
                               (sheet.getCell(7, 12).getContents()!="")?sdf.parse(sheet.getCell(7, 12).getContents()):new Date(),
                               sheet.getCell(9,12).getContents()+" "+sheet.getCell(4,13).getContents()
                       );

               workbook.close();

           }

        }
    }


}
