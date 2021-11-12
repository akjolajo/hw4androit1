package com.example.hw4androit1;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.hw4androit1.Fragments.MainAdapter;
import com.example.hw4androit1.Fragments.MainModel;
import com.example.hw4androit1.Fragments.SecontFragment;
import com.example.hw4androit1.Fragments.firstFragment;
import com.example.hw4androit1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity   {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view= binding.getRoot();
        setContentView(view);
        getSupportFragmentManager().beginTransaction().add(R.id.container1,new firstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container2,new SecontFragment()).commit();

    }
}