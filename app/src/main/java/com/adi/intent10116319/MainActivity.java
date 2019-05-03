package com.adi.intent10116319;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.adi.intent10116319.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void openWeb (View view){
        String url = "https://unikom.ac.id";
        Intent bukaweb = new Intent(Intent.ACTION_VIEW);
        bukaweb.setData(Uri.parse(url));
        startActivity(bukaweb);
    }

    public void Telp (View view){
        String no = "089632644938";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", no, null));
        startActivity(panggil);
    }

    public void Kirim (View view){
        Intent kirim = new Intent(this, Main2Activity.class);
        EditText editText = (EditText)findViewById(R.id.editText);
        String message = editText.getText().toString();
        kirim.putExtra(EXTRA_MESSAGE,message);
        startActivity(kirim);
    }
}
