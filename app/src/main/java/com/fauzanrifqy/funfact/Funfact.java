package com.fauzanrifqy.funfact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Funfact extends AppCompatActivity implements View.OnClickListener{

    Button nextButton;
    TextView funfactText;
    FactBook factBook;
    ColorWheel colorWheel;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfact);

        factBook = new FactBook();
        colorWheel = new ColorWheel();

        relativeLayout = (RelativeLayout) findViewById(R.id.activity_funfact);
        funfactText = (TextView) findViewById(R.id.factTextView);
        nextButton = (Button) findViewById(R.id.showFactButton);

        nextButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == nextButton){
            String fact = factBook.getFact();
            int color = colorWheel.getColor();

            funfactText.setText(fact);
            relativeLayout.setBackgroundColor(color);
            nextButton.setTextColor(color);
        }
    }
}
