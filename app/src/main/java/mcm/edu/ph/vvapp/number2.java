package mcm.edu.ph.vvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class number2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);
        Button butt15, butt16, butt17;
        butt15 = findViewById(R.id.butt15);
        butt16 = findViewById(R.id.butt16);
        butt17 = findViewById(R.id.butt17);
        butt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number2.this, wrong.class);
                startActivity(intent);
            }
        });
        butt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number2.this, wrong.class);
                startActivity(intent);
            }
        });
        butt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number2.this, correct.class);
                startActivity(intent);
            }
        });
    }
}