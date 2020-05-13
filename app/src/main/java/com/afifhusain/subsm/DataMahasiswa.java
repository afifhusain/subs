package com.afifhusain.subsm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.annotation.SuppressLint;

import android.widget.TextView;

public class DataMahasiswa extends AppCompatActivity {

    //Deklarasi Variable
    private TextView GetNIM, GetNama, GetJurusan, GetSemester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);
        getSupportActionBar().setTitle("Data Mahasiswa");
        GetNIM = findViewById(R.id.getnim);
        GetNama = findViewById(R.id.getnama);
        GetJurusan = findViewById(R.id.getjurusan);
        GetSemester = findViewById(R.id.getsemester);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama){
            case "Wildan":
                GetNIM.setText("NIM: 17720004");
                GetNama.setText("Nama: Wildam M Athoillah");
                GetJurusan.setText("Jurusan: Teknik Informatika");
                GetSemester.setText("Semester: 2");
                break;

            case "Taufan":
                GetNIM.setText("NIM: 17720005");
                GetNama.setText("Nama: Taufan Artha");
                GetJurusan.setText("Jurusan: Ekonomi");
                GetSemester.setText("Semester: 5");
                break;

            case "Adibil":
                GetNIM.setText("NIM: 17720006");
                GetNama.setText("Nama: Adibil Muchtar");
                GetJurusan.setText("Jurusan: Akuntansi");
                GetSemester.setText("Semester: 6");
                break;

            case "Hari":
                GetNIM.setText("NIM: 17720007");
                GetNama.setText("Nama: Hari");
                GetJurusan.setText("Jurusan: Management Informatika");
                GetSemester.setText("Semester: 4");
                break;

            case "Adam":
                GetNIM.setText("NIM: 17720008");
                GetNama.setText("Nama: Adam Makmur");
                GetJurusan.setText("Jurusan: Fakultas Ilmu Komunikasi");
                GetSemester.setText("Semester: 8");
                break;
        }
    }
}