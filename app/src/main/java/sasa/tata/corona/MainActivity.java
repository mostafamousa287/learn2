package sasa.tata.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp=findViewById(R.id.ti1);
    }

    public void click(View view) {
        String s= tp.getHour()+":"+tp.getMinute();
        Toast t=Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG);
        t.show();


    }

    public void dilog(View view) {

        TimePickerDialog.OnTimeSetListener listen=new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String ss=hourOfDay+":"+minute;
                Toast t=Toast.makeText(getApplicationContext(),ss,Toast.LENGTH_LONG);
                t.show();

            }
        };

        Calendar c=Calendar.getInstance();
        int hourday=c.get(Calendar.HOUR_OF_DAY);
        int min=c.get(Calendar.MINUTE);


        TimePickerDialog tpd=new TimePickerDialog(this,listen,hourday,min,true);
        tpd.show();


    }
}
