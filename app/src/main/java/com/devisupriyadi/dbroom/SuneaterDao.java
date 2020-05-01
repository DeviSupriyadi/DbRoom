package com.devisupriyadi.dbroom;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SuneaterDao {
    @Insert
    void tambahSuneater(SuneaterEntity suneaterEntity);
    @Delete
    public void hapusSuneater(SuneaterEntity suneaterEntity);
    @Query("SELECT * FROM SuneaterEntity")
    List<SuneaterEntity> tampilSeluruhSuneater();
    @Query("SELECT * FROM SuneaterEntity WHERE zonaTugas LIKE :zona")
    List<SuneaterEntity> findByZone(String zona);
}
