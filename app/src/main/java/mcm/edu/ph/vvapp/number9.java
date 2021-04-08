package mcm.edu.ph.vvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class number9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number9);
        Button butt34, butt35, butt36;
        butt34 = findViewById(R.id.butt34);
        butt35 = findViewById(R.id.butt35);
        butt36 = findViewById(R.id.butt36);
        butt34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number9.this, wrong.class);
                startActivity(intent);
            }
        });
        butt35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number9.this, correct.class);
                startActivity(intent);
            }
        });
        butt36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number9.this, wrong.class);
                startActivity(intent);
            }
        });
    }
}