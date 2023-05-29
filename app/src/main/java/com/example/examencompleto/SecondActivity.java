package com.example.examencompleto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private RespositoryOficio respositoryOficio;

    private Spinner spinner;
    private Button btn;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btn = findViewById(R.id.button2222);

        editText = findViewById(R.id.editTextTextPersonName);

        respositoryOficio = new RespositoryOficio();


        spinner = findViewById(R.id.spinner);
        ArrayAdapter<Oficio> myadap = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, respositoryOficio.getAll());

        spinner.setAdapter(myadap);


        ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                i.putExtra("uno", editText.getText().toString());
                activityResultLauncher.launch(i);
            }
        });


    }
}
