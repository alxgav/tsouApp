package tsouapp.raport.data;

import java.util.Date;

/**
 * Created by alxga on 01.11.2016.
 */
public class student {
    String surname;
    String firstname;
    String lastname;
    Date  dbirth;
    String placeb;
    String inn;
    String address;
    String pasport;
    Date dpassport;
    String passportv;
    String meddov;
    Date dmeddov;
    String meddovv;

    public student(String surname, String firstname, String lastname, Date dbirth, String placeb, String inn, String address, String pasport, Date dpassport, String passportv, String meddov, Date dmeddov, String meddovv) {
        this.surname = surname;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dbirth = dbirth;
        this.placeb = placeb;
        this.inn = inn;
        this.address = address;
        this.pasport = pasport;
        this.dpassport = dpassport;
        this.passportv = passportv;
        this.meddov = meddov;
        this.dmeddov = dmeddov;
        this.meddovv = meddovv;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDbirth() {
        return dbirth;
    }

    public void setDbirth(Date dbirth) {
        this.dbirth = dbirth;
    }

    public String getPlaceb() {
        return placeb;
    }

    public void setPlaceb(String placeb) {
        this.placeb = placeb;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPasport() {
        return pasport;
    }

    public void setPasport(String pasport) {
        this.pasport = pasport;
    }

    public Date getDpassport() {
        return dpassport;
    }

    public void setDpassport(Date dpassport) {
        this.dpassport = dpassport;
    }

    public String getPassportv() {
        return passportv;
    }

    public void setPassportv(String passportv) {
        this.passportv = passportv;
    }

    public String getMeddov() {
        return meddov;
    }

    public void setMeddov(String meddov) {
        this.meddov = meddov;
    }

    public Date getDmeddov() {
        return dmeddov;
    }

    public void setDmeddov(Date dmeddov) {
        this.dmeddov = dmeddov;
    }

    public String getMeddovv() {
        return meddovv;
    }

    public void setMeddovv(String meddovv) {
        this.meddovv = meddovv;
    }
}
