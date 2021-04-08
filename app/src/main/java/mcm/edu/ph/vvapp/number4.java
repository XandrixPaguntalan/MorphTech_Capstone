package mcm.edu.ph.vvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class number4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);
        Button butt21, butt22, butt23;
        butt21 = findViewById(R.id.butt21);
        butt22 = findViewById(R.id.butt22);
        butt23 = findViewById(R.id.butt23);
        butt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number4.this, wrong.class);
                startActivity(intent);
            }
        });
        butt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number4.this, correct.class);
                startActivity(intent);
            }
        });
        butt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number4.this, wrong.class);
                startActivity(intent);
            }
        });
    }
}