package mcm.edu.ph.vvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class number8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number8);
        Button butt31, butt32, butt33;
        butt31 = findViewById(R.id.butt31);
        butt32 = findViewById(R.id.butt32);
        butt33 = findViewById(R.id.butt33);
        butt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number8.this, correct.class);
                startActivity(intent);
            }
        });
        butt32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number8.this, wrong.class);
                startActivity(intent);
            }
        });
        butt33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number8.this, wrong.class);
                startActivity(intent);
            }
        });
    }
}