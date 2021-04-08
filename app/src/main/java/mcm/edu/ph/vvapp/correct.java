package mcm.edu.ph.vvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class correct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);
        Button butt14, butt37;
        butt37 = findViewById(R.id.butt37);
        butt14 = findViewById(R.id.butt14);
        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(correct.this, TestYourKnowledge.class);
                startActivity(intent);
            }
        });
        butt37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(correct.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}