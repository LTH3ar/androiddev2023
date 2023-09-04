package vn.edu.usth.weather;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

import vn.edu.usth.weather.ui.ForecastFragment;


public class WeatherActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("onCreate", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart", "onRestart");
    }
}
