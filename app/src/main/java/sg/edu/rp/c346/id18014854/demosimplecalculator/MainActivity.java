package sg.edu.rp.c346.id18014854.demosimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.editTextNum1);
        number2 = findViewById(R.id.editTextNum2);
        btnCal = findViewById(R.id.buttonCalculate);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent (MainActivity.this, ResultActivity.class);
                myIntent.putExtra("value1", 2.5);
                myIntent.putExtra("value2", 1.5);
                startActivity(myIntent);
            }
        });
    }
}
