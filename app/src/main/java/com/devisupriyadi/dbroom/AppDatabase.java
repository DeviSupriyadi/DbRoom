package com.devisupriyadi.dbroom;

/* Tangga Pengerjaan : 1 Mei 2020
   Deskripsi         : Mengerjakan Database
   NIM               : 10117181
   Nama              : Devi Tiana O S
   Kelas             : IF-5
 */

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {SuneaterEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SuneaterDao suneaterDao();
}
