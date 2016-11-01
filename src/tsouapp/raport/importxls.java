package tsouapp.raport;

import jxl.DateCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import tsouapp.raport.data.student;

import java.io.File;
import java.io.IOException;
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

    public void imrev(String filedir) throws IOException, BiffException {
        ArrayList data = new ArrayList();
        File f = new File(filedir);
        if(f.isDirectory()){
           for(File c:f.listFiles()){
                /*
                xls
                 */
               Workbook workbook = Workbook.getWorkbook(new File("xls/"+c.getName()));
               Sheet sheet = workbook.getSheet(0);
               System.out.println(sheet.getCell(6,4).getContents());
               DateCell dc =  (DateCell) sheet.getCell(6, 4);
//               DateCell dcp = (DateCell) sheet.getCell(7, 10);
//               DateCell dcm = (DateCell) sheet.getCell(7, 12);
//               s = new student(sheet.getCell(6,1).getContents(),
//                               sheet.getCell(6,2).getContents(),
//                               sheet.getCell(6,3).getContents(),
//                               dc.getDate(),
//                               sheet.getCell(8,4).getContents()+" "+sheet.getCell(6,5).getContents(),
//                               sheet.getCell(6,6).getContents(),
//                               sheet.getCell(4,8).getContents(),
//                               sheet.getCell(4,10).getContents(),
//                               dcp.getDate(),
//                               sheet.getCell(9,10).getContents()+" "+sheet.getCell(4,11).getContents(),
//                               sheet.getCell(4,12).getContents(),
//                               dcm.getDate(),
//                               sheet.getCell(9,12).getContents()+" "+sheet.getCell(4,13).getContents()
//                       );
               workbook.close();

           }
        }
    }


}
