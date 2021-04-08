package mcm.edu.ph.vvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class number6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number6);
        Button butt26, butt27, butt28;
        butt26 = findViewById(R.id.butt26);
        butt27 = findViewById(R.id.butt27);
        butt28 = findViewById(R.id.butt28);
        butt26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number6.this, wrong.class);
                startActivity(intent);
            }
        });
        butt27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number6.this, wrong.class);
                startActivity(intent);
            }
        });
        butt28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number6.this, correct.class);
                startActivity(intent);
            }
        });
    }
}