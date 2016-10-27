package tsouapp.data.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author Алексей
 */
 @DatabaseTable(tableName = "tablename")
public class student {


    @DatabaseField(generatedId = true)
    private Integer id;
    @DatabaseField
    private String field;

    public student(){

    }
}
   