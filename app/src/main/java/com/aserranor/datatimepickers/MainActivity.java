package com.aserranor.datatimepickers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePickerDialog(View view){
        DialogFragment newDataFragment = new DataPickerFragment();
        newDataFragment.show(getSupportFragmentManager(), getString(R.string.date));
    }

    public void showTimePickerDialog(View view){
        DialogFragment newTimeFragment = new TimePickerFragment();
        newTimeFragment.show(getSupportFragmentManager(), getString(R.string.time));
    }

    public void processDatePickerResult(int year, int month, int day){
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        String dateMessage = (month_string + "/" + day_string + "/" + year_string);

        Toast.makeText(this, "Date: "+ dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfDay, int minute){
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);

        String timeMessage = (hour_string + "/" + minute_string);

        Toast.makeText(this, "Time: " + timeMessage, Toast.LENGTH_SHORT).show();
    }
}