package com.example.kylud;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.TextView;

    public class BORCH extends AppCompatActivity {

        TextView tW3;
        Button button123;
        Button gm;
        //ddddddd
        int i = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_borch);

            Button button123 = (Button)findViewById(R.id.button123);
            TextView tW3 = (TextView)findViewById(R.id.tW3);
            button123.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if(i == 1){
                        tW3.setText("Подготавливают все необходимые продукты. Если чернослив сухой, заливают его кипятком на 10-15 минут.");
                    }
                    if(i == 2){
                        tW3.setText("Мясо нарезают небольшими кусочками.");
                    }
                    if(i == 3){
                        tW3.setText("Выкладывают мясо в кастрюлю, заливают холодной водой. Доводят до кипения, снимают пену и варят мясо 1,5 часа на маленьком огне, под крышкой.");
                    }
                    if(i == 4){
                        tW3.setText("Картофель очищают и нарезают крупными кусками.");
                    }
                    if(i == 5){
                        tW3.setText("Свеклу очищают, нарезают соломкой. Обычно свёклу тушат в сковороде с добавлением лимонного сока или уксуса - можно сделать именно так. Но в этом рецепте свёкла добавляется в бульон в сыром виде и варится вместе с картошкой и капустой.");
                    }
                    if(i == 6){
                        tW3.setText("Капусту шинкуют соломкой, лук чистят и мелко нарезают, а морковь чистят и натирают на крупной терке, чернослив очищают от косточек, мелко нарезают.");
                    }
                    if(i == 7){
                        tW3.setText("Сковороду нагревают, наливают растительное масло. В горячее масло выкладывают лук и морковь, обжаривают овощи, помешивая, 3-4 минуты на среднем огне. Добавляют томатную пасту, перемешивают и обжаривают овощи с томатом ещё 1 минуту.");
                    }
                    if(i == 8){
                        tW3.setText("В мясной бульон добавляют картофель, свёклу, капусту, обжаренные лук и морковь. Добавляют чернослив, соль и варят борщ с черносливом до готовности картофеля, 20-25 минут.");
                    }
                    if(i == 9){
                        tW3.setText("Зелень моют и мелко режут.");
                    }
                    if(i == 10){
                        tW3.setText("Готовый борщ с черносливом разливают по тарелкам, посыпают измельченной зеленью петрушки. Подают борщ со сметаной. Приятного аппетита!");
                    }

                }

            });
            Button gm = (Button)findViewById(R.id.gm);
            gm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i;
                    i = new Intent(BORCH.this, MainActivity.class);
                    startActivity(i);
                }
            });



        }


    }
