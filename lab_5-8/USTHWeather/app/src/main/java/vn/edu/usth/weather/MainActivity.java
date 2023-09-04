package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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