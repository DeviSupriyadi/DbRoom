package com.devisupriyadi.dbroom;

/* Tangga Pengerjaan : 2 Mei 2020
   Deskripsi         : Mengerjakan Main Activity
   NIM               : 10117181
   Nama              : Devi Tiana O S
   Kelas             : IF-5
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SuneaterEntity suneaterEntity;
    public static AppDatabase db;

    List<SuneaterEntity> suneaterEntities = new ArrayList<>();
    List<SuneaterEntity> suneaterEntityListByZone = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "suneater")
                .allowMainThreadQueries().build();

        suneaterEntity = new SuneaterEntity();
        suneaterEntity.setNamaSuneater("Baskara Putra");
        suneaterEntity.setEmailSuneater("hindia@gmail.com");
        suneaterEntity.setZonaTugas("Bintaro");

        Log.d("TAMBAH","Tambah Data Suneater");
        Log.d("TAMBAH","====================");
        Log.d("TAMBAH","Nama : "+suneaterEntity.getNamaSuneater());
        Log.d("TAMBAH","Email : "+suneaterEntity.getEmailSuneater());
        Log.d("TAMBAH","Zona : "+suneaterEntity.getZonaTugas());

        db.suneaterDao().tambahSuneater(suneaterEntity);

        Log.d("TAMPIL","Tampil seluruh data Suneater");
        Log.d("TAMPIL","============================");

        suneaterEntities = db.suneaterDao().tampilSeluruhSuneater();

        for (int i = 0; i<suneaterEntities.size(); i++){

            Log.d("TAMPIL","Data Ke-"+(i+1));
            Log.d("TAMPIL","Nama : "+suneaterEntities.get(i).getNamaSuneater());
            Log.d("TAMPIL","Email : "+suneaterEntities.get(i).getEmailSuneater());
            Log.d("TAMPIL","Zona : "+suneaterEntities.get(i).getZonaTugas());
            Log.d("TAMPIL","========================");
        }

        Log.e("ZONE","Data Suneater berdasarkan Zona");
        Log.e("ZONE","===================");
        suneaterEntityListByZone = db.suneaterDao().findByZone("Bintaro");
        for (int i = 0; i<suneaterEntityListByZone.size();i++){
            Log.e("ZONE","Data Suneater Ke-"+(i+1));
            Log.e("ZONE",suneaterEntityListByZone.get(i).getNamaSuneater());
            Log.e("ZONE",suneaterEntityListByZone.get(i).getEmailSuneater());
            Log.e("ZONE",suneaterEntityListByZone.get(i).getZonaTugas());
            Log.e("ZONE","===================");
        }
    }
}
