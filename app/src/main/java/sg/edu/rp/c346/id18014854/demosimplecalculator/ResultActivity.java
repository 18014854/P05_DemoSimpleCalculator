package sg.edu.rp.c346.id18014854.demosimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv = findViewById(R.id.tv);
        Intent intentRecieved = getIntent();
        double value1 = intentRecieved.getDoubleExtra("value1", -1);
        double value2 = intentRecieved.getDoubleExtra("value2", -1);
        double valueTotal = value1 + value2;
        tv.setText(String.format("%.1f",valueTotal));
    }
}
