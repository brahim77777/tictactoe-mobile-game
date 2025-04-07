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
    private int record[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1};

    public void printWinner(int i ){
        if(i == 0 )
            findViewById(R.id.rs).setBackgroundColor(Color.RED);
            else{

            findViewById(R.id.rs).setBackgroundColor(Color.GREEN);

        }
    }
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


                if (click % 2 == 0){
                    img[j].setImageResource(R.drawable.x);
                    record[j] = 1;}
                else {
                    img[j].setImageResource(R.drawable.circle);
                    record[j] = 0;
                }
                click++;





                for (int i = 0  ; i < 8; i+=3)
                        if(record[i] == record[i+1] && record[i] == record[i+2] ){
                            if (record[i] == 1){
                                // x win
                                printWinner(record[i]);
                            } else if (record[i] == 0) {
                                // o win
                                printWinner(record[i]);

                            }
                        }
                for (int i = 0 ;i < 3 ; i++ )
                    if(record[i] == record[i+3] && record[i] == record[i+6] ){
                        if (record[i] == 1){
                            // x win
                            printWinner(record[i]);

                        } else if (record[i] == 0) {
                            // o win
                            printWinner(record[i]);

                        }
                    }

                if(record[0] == record[4] && record[0] == record[8]) {
                    if (record[0] == 1) {
                        // x win
                        printWinner(record[0]);

                    } else if (record[0] == 0) {
                        // o win
                        printWinner(record[0]);

                    }
                }
                if(record[2] == record[4] && record[2] == record[6]) {
                    if (record[2] == 1) {
                        // x win
                        printWinner(record[2]);

                    } else if (record[2] == 0) {
                        // o win
                        printWinner(record[2]);

                    }
                }




            });
        }




    }
}