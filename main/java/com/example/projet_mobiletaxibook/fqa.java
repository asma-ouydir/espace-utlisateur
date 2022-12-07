package com.example.projet_mobiletaxibook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class fqa extends AppCompatActivity {
    private TextView qst ;
    private int icon;
    private Button avoirinfo;
   private ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fqa);
        ls=findViewById(R.id.lstrqa);
        qst = findViewById(R.id.id_txt);
        icon=findViewById(R.id.icon_id);
        avoirinfo=findViewById(R.id.btn);
    }
}