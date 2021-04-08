package mcm.edu.ph.vvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class number7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number7);
        Button butt29, butt30;
        butt29 = findViewById(R.id.butt29);
        butt30 = findViewById(R.id.butt30);
        butt29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number7.this, wrong.class);
                startActivity(intent);
            }
        });
        butt30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number7.this, correct.class);
                startActivity(intent);
            }
        });
    }
}