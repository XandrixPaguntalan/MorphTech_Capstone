package mcm.edu.ph.vvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class number5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number5);
        Button butt24, butt25;
        butt24 = findViewById(R.id.butt24);
        butt25 = findViewById(R.id.butt25);
        butt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number5.this, correct.class);
                startActivity(intent);
            }
        });
        butt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number5.this, wrong.class);
                startActivity(intent);
            }
        });
    }
}