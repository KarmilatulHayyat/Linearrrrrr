package com.example.linearrrrrr;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepassword;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);


        fab = findViewById(R.id.fabSimpan);
        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.edEmail);
        edtPassword = findViewById(R.id.edpassword);
        edtrepassword = findViewById(R.id.edRepass);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNama.getText().toString().isEmpty()||
                        edtAlamat.getText().toString().isEmpty()||
                        edtEmail.getText().toString().isEmpty()||
                        edtPassword.getText().toString().isEmpty()||
                        edtrepassword.getText().toString().isEmpty()
                )
                {
                    Snackbar.make(view, "wajib isi seluruh data !!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if(edtPassword.getText().toString().equals(edtrepassword.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(),
                                "pendaftarann berhasil...", Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view,
                                "password dan repassword harus sama !!!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }

            }
        });
    }
}