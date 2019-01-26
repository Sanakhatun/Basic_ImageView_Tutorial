package com.professional.tutorials.basic_imageview_tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button bClick;
    private boolean isImageClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView =  (ImageView) findViewById(R.id.imageView);
        bClick = (Button) findViewById(R.id.bClick);

        bClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(isImageClicked == false)
                {
                    imageView.setImageResource(R.drawable.image_selected);
                    isImageClicked = true;
                }
                else
                {
                    imageView.setImageResource(R.drawable.image_unselected);
                    isImageClicked = false;
                }
            }
        });
    }
}