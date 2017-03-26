package tsouapp.data.db;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 *
 * @author Алексей
 */
 @DatabaseTable(tableName = "student")
public class student {


    @DatabaseField(generatedId = true)
    private Integer id;
    @DatabaseField
    private Integer group_n;
    @DatabaseField
    private String surname;
    @DatabaseField
    private String firstname;
    @DatabaseField
    private String middlename;
    @DatabaseField
    private String inn;
    @DatabaseField
    private Date birthday;
    @DatabaseField
    private String pasport_n;
    @DatabaseField
    private Date pasport_d;
    @DatabaseField
    private String pasport_v;
    @DatabaseField
    private String address;
    @DatabaseField
    private String hospital_n;
    @DatabaseField
    private Date hospital_d;
    @DatabaseField
    private String hospital_v;
    @DatabaseField(dataType = DataType.BYTE_ARRAY)
    private byte[] foto;

    public student(Integer group_n, String surname, String firstname, String middlename, String inn, Date birthday, String pasport_n, Date pasport_d, String pasport_v, String address, String hospital_n, Date hospital_d, String hospital_v, byte[] foto) {
        this.group_n = group_n;
        this.surname = surname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.inn = inn;
        this.birthday = birthday;
        this.pasport_n = pasport_n;
        this.pasport_d = pasport_d;
        this.pasport_v = pasport_v;
        this.address = address;
        this.hospital_n = hospital_n;
        this.hospital_d = hospital_d;
        this.hospital_v = hospital_v;
        this.foto = foto;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPasport_n() {
        return pasport_n;
    }

    public void setPasport_n(String pasport_n) {
        this.pasport_n = pasport_n;
    }

    public Date getPasport_d() {
        return pasport_d;
    }

    public void setPasport_d(Date pasport_d) {
        this.pasport_d = pasport_d;
    }

    public String getPasport_v() {
        return pasport_v;
    }

    public void setPasport_v(String pasport_v) {
        this.pasport_v = pasport_v;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHospital_n() {
        return hospital_n;
    }

    public void setHospital_n(String hospital_n) {
        this.hospital_n = hospital_n;
    }

    public Date getHospital_d() {
        return hospital_d;
    }

    public void setHospital_d(Date hospital_d) {
        this.hospital_d = hospital_d;
    }

    public String getHospital_v() {
        return hospital_v;
    }

    public void setHospital_v(String hospital_v) {
        this.hospital_v = hospital_v;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
   