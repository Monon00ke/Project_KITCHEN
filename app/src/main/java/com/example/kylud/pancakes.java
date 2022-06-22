package com.example.kylud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pancakes extends AppCompatActivity {

    Button butttt;
    Button button;
    TextView textView5;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancakes);

        Button button1 = (Button)findViewById(R.id.button1);
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                if(i == 1){
                    textView5.setText("Смешайте 2 яйца и 200 мл молока.");
                }
                if(i == 2){
                    textView5.setText("Затем добавьте 2 ст.л. сахара и ваниль.");
                }
                if(i == 3){
                    textView5.setText("Взбейте до однородности. Добавьте 10 ст. л. муки и разрыхлитель.");
                }
                if(i == 4){
                    textView5.setText("Тщательно перемешайте. Тесто получится средней густоты.");
                }
                if(i == 5){
                    textView5.setText("Разогрейте сковородку с антипригарным покрытием. На сухую сковороду налейте тесто небольшим половником. Накройте крышкой, и жарьте панкейки на среднем огне.");
                }
                if(i == 6){
                    textView5.setText("Переворачивайте, когда верхняя поверхность панкейков станет пористой, при этом будет еще влажной. Жарьте блинчики до румяности с двух сторон.");
                }
                if(i == 7){
                    textView5.setText("Складывайте готовые панкейки башенкой на тарелке. Подавайте панкейки с медом. Можно добавить орехи.\n" +
                            "Приятного аппетита!");
                }



            }


        });

        Button butttt = (Button)findViewById(R.id.butttt);
        butttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(pancakes.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}