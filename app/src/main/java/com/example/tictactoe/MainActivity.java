package com.example.tictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView img[] = new ImageView[9];
    private int id[] = new int[9];
    int i,click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            click = 0;
            id[0] = R.id.i1;
            id[1] = R.id.i2;
            id[2] = R.id.i3;
            id[3] = R.id.i4;
            id[4] = R.id.i5;
            id[5] = R.id.i6;
            id[6] = R.id.i7;
            id[7] = R.id.i8;
            id[8] = R.id.i9;

        for ( i=0;i<9;i+=1) {
            img[i] = findViewById(id[i]);
            final int j= i;
            img[i].setOnClickListener(v -> {
                if (click % 2 == 0)
                img[j].setImageResource(R.drawable.x);
                else
                    img[j].setImageResource(R.drawable.circle);
                click++;
            });
        }




    }
}