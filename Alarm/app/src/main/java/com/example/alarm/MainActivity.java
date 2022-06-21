package com.example.alarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    TextView txtViewAlarm;
    Button btnSetAlarm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewAlarm = findViewById(R.id.txtViewAlarm);
        btnSetAlarm = findViewById(R.id.btnSetAlarm);
    }

    public void btnAlarmOnClick(View view){
        DialogFragment timePickerDialog = new TimePickerFragment();
        timePickerDialog.show(getSupportFragmentManager(),"time picker");
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int intHourOfDay, int intMinute){
        TextView textViewPicked=(TextView) findViewById(R.id.txtViewAlarm);
        textViewPicked.setText(("Будильник установлен на "+ intHourOfDay + ":" + intMinute));
    }
}