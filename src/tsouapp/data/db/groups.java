package tsouapp.data.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by alxgav on 26.03.2017.
 */
@DatabaseTable(tableName = "groups")
public class groups {
    @DatabaseField(generatedId = true)
    private Integer id;
    @DatabaseField
    private Integer group_n;
    @DatabaseField
    private Integer group_year;
    @DatabaseField
    private String kategorija;
    @DatabaseField
    private Date data_begin;
    @DatabaseField
    private Date data_end;
    @DatabaseField
    private Integer price;

    public groups(Integer group_n, Integer group_year, String kategorija, Date data_begin, Date data_end, Integer price) {
        this.group_n = group_n;
        this.group_year = group_year;
        this.kategorija = kategorija;
        this.data_begin = data_begin;
        this.data_end = data_end;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroup_n() {
        return group_n;
    }

    public void setGroup_n(Integer group_n) {
        this.group_n = group_n;
    }

    public Integer getGroup_year() {
        return group_year;
    }

    public void setGroup_year(Integer group_year) {
        this.group_year = group_year;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public Date getData_begin() {
        return data_begin;
    }

    public void setData_begin(Date data_begin) {
        this.data_begin = data_begin;
    }

    public Date getData_end() {
        return data_end;
    }

    public void setData_end(Date data_end) {
        this.data_end = data_end;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
