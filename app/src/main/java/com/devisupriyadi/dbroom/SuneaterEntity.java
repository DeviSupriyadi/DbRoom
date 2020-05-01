package com.devisupriyadi.dbroom;

/* Tangga Pengerjaan : 1 Mei 2020
   Deskripsi         : Mengerjakan Suneater Entity
   NIM               : 10117181
   Nama              : Devi Tiana O S
   Kelas             : IF-5
 */

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class SuneaterEntity {
    @PrimaryKey(autoGenerate = true)
    private int idSuneater;
    @ColumnInfo(name = "namaSuneater")
    private String namaSuneater;
    @ColumnInfo(name = "emailSuneater")
    private String emailSuneater;
    @ColumnInfo(name = "zonaTugas")
    private String zonaTugas;

    public int getIdSuneater() {
        return idSuneater;
    }

    public void setIdSuneater(int idSuneater) {
        this.idSuneater = idSuneater;
    }

    public String getNamaSuneater() {
        return namaSuneater;
    }

    public void setNamaSuneater(String namaSuneater) {
        this.namaSuneater = namaSuneater;
    }

    public String getEmailSuneater() {
        return emailSuneater;
    }

    public void setEmailSuneater(String emailSuneater) {
        this.emailSuneater = emailSuneater;
    }

    public String getZonaTugas() {
        return zonaTugas;
    }

    public void setZonaTugas(String zonaTugas) {
        this.zonaTugas = zonaTugas;
    }
}
