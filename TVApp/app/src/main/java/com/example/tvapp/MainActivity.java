package com.example.tvapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    TextView raspisanie, week;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        week = findViewById(R.id.week);
        raspisanie = findViewById(R.id.raspisanie);
    }

    public void btn1Click(View view)
    {
        week.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        week.setText("ЧИСЛИТЕЛЬ");
        raspisanie.setText(
                "ПОНЕДЕЛЬНИК (Нахимовский)\n" +
                        "2: Разработка мобильных приложений 10:10-11:40\n" +
                        "3: Разработка программных модулей 12:00-13:30\n" +
                        "4: Технология разработки и защиты баз данных 14:00-15:30\n" +
                        "5: Инструментальные средства разработки ПО 15:40-17:10\n" + "\n" +

                        "ВТОРНИК \n" +
                        "1-6: ПРАКТИКА 8:30-17:10\n" + "\n" +

                        "СРЕДА \n" +
                        "1-6: ПРАКТИКА 8:30-17:10\n" + "\n" +

                        "ЧЕТВЕРГ (Нежинская)\n" +
                        "2: Иностранный язык в профессиональной деятельности 10:10-11:40\n" +
                        "3: Разработка мобильных приложений 12:00-13:30\n" +
                        "4: Технология разработки программного обеспечения 14:00-15:30\n" +
                        "5: Системное программирование 15:40-17:10\n" + "\n" +

                        "ПЯТНИЦА (Нахимовский)\n" +
                        "1: Физическая культура 8:30-10:00\n" +
                        "2: Разработка программных модулей 10:10-11:40\n" +
                        "3: Технология разработки программного обеспечения 12:00-13:30\n" +
                        "4: Технология разработки и защиты баз данных 14:00-15:30\n"
        );
    }

    public void btn2Click(View view)
    {
        week.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
        week.setText("ЗНАМЕНАТЕЛЬ");
        raspisanie.setText(
                "ПОНЕДЕЛЬНИК (Нахимовский)\n" +
                        "2: Разработка программных модулей 10:10-11:40\n" +
                        "3: Разработка программных модулей 12:00-13:30\n" +
                        "4: Системное программирование 14:00-15:30\n" +
                        "5: Инструментальные средства разработки ПО 15:40-17:10\n" + "\n" +

                        "ВТОРНИК \n" +
                        "1-6: ПРАКТИКА 8:30-17:10\n" + "\n" +

                        "СРЕДА \n" +
                        "1-6: ПРАКТИКА 8:30-17:10\n" + "\n" +

                        "ЧЕТВЕРГ (Нежинская)\n" +
                        "2: Иностранный язык в профессиональной деятельности 10:10-11:40\n" +
                        "3: Разработка мобильных приложений 12:00-13:30\n" +
                        "4: Технология разработки программного обеспечения 14:00-15:30\n" +
                        "5: Системное программирование 15:40-17:10\n" + "\n" +

                        "ПЯТНИЦА (Нахимовский)\n" +
                        "1: Физическая культура 8:30-10:00\n" +
                        "2: Разработка программных модулей 10:10-11:40\n" +
                        "3: Инструментальные средства разработки ПО 12:00-13:30\n" +
                        "4: Технология разработки и защиты баз данных 14:00-15:30\n"
        );
    }
}