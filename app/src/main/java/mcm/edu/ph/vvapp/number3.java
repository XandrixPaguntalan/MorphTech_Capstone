package mcm.edu.ph.vvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class number3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number3);
        Button butt18, butt19, butt20;
        butt18 = findViewById(R.id.butt18);
        butt19 = findViewById(R.id.butt19);
        butt20 = findViewById(R.id.butt20);
        butt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number3.this, wrong.class);
                startActivity(intent);
            }
        });
        butt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number3.this, wrong.class);
                startActivity(intent);
            }
        });
        butt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number3.this, correct.class);
                startActivity(intent);
            }
        });
    }
}