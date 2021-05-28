package com.fleet.pk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageSlider slider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slider = findViewById(R.id.slider);
        displaySlider();
    }

    private void displaySlider() {
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.b1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.b2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.b3, ScaleTypes.FIT));

        slider.setImageList(slideModels, ScaleTypes.FIT);
    }
}