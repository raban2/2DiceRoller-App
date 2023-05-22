package com.example.a2diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rollButton;
    private TextView resultText;
    private TextView resultText2;
    private ImageView diceImage;
    private ImageView diceImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.roll_button);
        resultText = findViewById(R.id.result_text);
        diceImage = findViewById(R.id.dice_image);
        resultText2 = findViewById(R.id.result_text2);
        diceImage2 = findViewById(R.id.dice_image2);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayMessage("Dice is rolled");
                int result = rollDice();
                int result2 = rollDice2();
                resultText.setText(String.valueOf(result));
                resultText2.setText(String.valueOf(result2));
                updateDiceImage(result);
                updateDiceImage2(result2);
            }
        });
    }

    private int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    private int rollDice2() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    private void displayMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void onRollButtonClick(View view) {
        displayMessage("Dice is rolled");
    }

    private void updateDiceImage(int number) {
        switch (number) {
            case 1:
                diceImage.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceImage.setImageResource(R.drawable.dice_6);
                break;
        }
    }

    private void updateDiceImage2(int number) {
        switch (number) {
            case 1:
                diceImage2.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceImage2.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceImage2.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceImage2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceImage2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceImage2.setImageResource(R.drawable.dice_6);
                break;
        }
    }

}