package com.example.fragmentsbootcamp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.fragmentsbootcamp.fragments.FragmentDetail;
import com.example.fragmentsbootcamp.fragments.FragmentExtern;
import com.example.fragmentsbootcamp.fragments.FragmentItem;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public Boolean fragmtThreeVisible = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarFragmentItem();
        cargarFragmentDetail();
    }

    private void cargarFragmentItem() {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.frg_item, new FragmentItem())
                .commit();


    }
    private void cargarFragmentDetail() {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.frg_detail, new FragmentDetail())
                .commit();

    }

    public void cargarFragmentExtern() {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.frg_extern, new FragmentExtern())
                .commit();
        findViewById(R.id.frg_extern).setVisibility(View.VISIBLE);
        fragmtThreeVisible = true;
    }

    @Override
    public void onBackPressed(){
        if (fragmtThreeVisible) {
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction()
                    .remove(Objects.requireNonNull(fm.findFragmentById(R.id.frg_extern)))
                    .commit();
            findViewById(R.id.frg_extern).setVisibility((View.GONE));
            fragmtThreeVisible = false;

        } else {
                super.getOnBackPressedDispatcher();
        }
    }
}