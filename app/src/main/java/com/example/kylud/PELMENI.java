package com.example.kylud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PELMENI extends AppCompatActivity {

    Button buttoo;
    Button button;
    TextView textView5;
    int i = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelmeni);

        Button buttono = (Button)findViewById(R.id.buttoo);
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        buttoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                if(i == 1){
                    textView5.setText("В муку (3 стакана объёмом 250 мл + 1 ст. ложка) добавляем соль, яйцо и растительное масло. Слегка перемешиваем.");
                }
                if(i == 2){
                    textView5.setText("Сдвигаем яйцо немного к краю миски, чтобы оно не сварилось. Заливаем муку горячей водой (температура 70-75 градусов), постоянно перемешивая ложкой.");
                }
                if(i == 3){
                    textView5.setText("Затем замешиваем тесто руками. Если останутся небольшие вкрапления сварившегося желтка - ничего страшного, они разойдутся при вымешивании теста.\n" +
                            "Вымешиваем тесто примерно 7 минут, пока оно полностью не остынет.");
                }
                if(i == 4){
                    textView5.setText("Тесто не липнет ни к рукам, ни к поверхности, поэтому дополнительно муку можно не добавлять. Накрываем тесто полотенцем и даём ему отдохнуть 20-30 минут.");
                }
                if(i == 5){
                    textView5.setText("Готовим начинку. Вес теста - приблизительно 800 г, поэтому и начинки берём тоже 800 г.Мясо, сало и лук перемалываем с помощью мясорубки. (Можно взять уже готовый фарш и смешать с измельчённым луком.) Фарш солим и перчим. Добавляем немного воды, чтобы фарш был слегка жидковатым. Перемешиваем.");
                }
                if(i == 6){
                    textView5.setText("Берём часть теста весом 120 г, выкладываем на присыпанную мукой поверхность и раскатываем по размеру пельменницы. Остальное тесто отправляем под полотенце, чтобы оно не засыхало.");
                }
                if(i == 7){
                    textView5.setText("Хорошо посыпаем мукой верх пельменницы и ту сторону теста, которую будем выкладывать на пельменницу, чтобы пельмени хорошо от неё отделялись.");
                }
                if(i == 8){
                    textView5.setText("Разравниваем тесто по всей поверхности пельменницы.");
                }
                if(i == 9){
                    textView5.setText("Выкладываем фарш в ячейки. Следим, чтобы фарш не попадал на тесто вокруг ячеек, таким образом тесто будет хорошо скрепляться и пельмени не развалятся.");
                }
                if(i == 10){
                    textView5.setText("Убираем остатки теста по краям, кладём под полотенце, их можно использовать повторно. Вытряхиваем пельмени из пельменницы.");
                }if(i == 11){
                    textView5.setText("Из этого количества теста и фарша получилось 185 пельменей (5 пельменниц). Пельмени выкладываем на посыпанную мукой поверхность и замораживаем.");
                }
                if(i == 12){
                    textView5.setText("Отвариваем пельмени в подсоленной воде с лавровым листом, горошинами чёрного перца и луком. Слегка перемешиваем пельмени и варим 2-3 минуты после того, как они всплывут. Даже если варить дольше, пельмени не разварятся.");
                }if(i == 13){
                    textView5.setText("Подаём пельмени со сливочным маслом. Приятного аппетита!");
                }

                Button button5 = (Button)findViewById(R.id.button5);
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i;
                        i = new Intent(PELMENI.this, MainActivity.class);
                        startActivity(i);
                    }
                });

            }


        });
    }
}