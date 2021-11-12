package com.example.hw4androit1.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4androit1.Activity_second;
import com.example.hw4androit1.R;
import com.example.hw4androit1.databinding.FragmentSecontBinding;

import java.util.ArrayList;


public class SecontFragment extends Fragment {

    private MainAdapter adapter;
    private FragmentSecontBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecontBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();

        setClick();

    }

    private void setClick() {
        adapter.setLisener(model -> {
            Intent intent = new Intent(requireActivity(), Activity_second.class);
            intent.putExtra("key",model.getNameofsong());
            startActivity(intent);
        });
    }

    private void initRecycler() {

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel("NILRTTO","Если тебе будет грустно","1","3:09"));
        list.add(new MainModel("Dabro","Юность","2","2:23"));
        list.add(new MainModel("Charlie Puht","Attention","3","3:52"));
        list.add(new MainModel("Alec Benjamin","Let Me Down Sllowly","4","2:57"));
        list.add(new MainModel("The Kid Laroi","Stay","5","3:22"));
        list.add(new MainModel("XXXTENACTION","Look At Me","6","2:24"));
        list.add(new MainModel("Alan Walker", "Sing Me To Sleep", "7","3:12"));
        list.add(new MainModel("Alan Walker","Alone", "8","2:43"));
        list.add(new MainModel("DJ Snake ", "Let Me Love You","9","3:25"));
        list.add(new MainModel("Maroon 5", "Don't Wanna Know","10","4:36"));


        adapter = new MainAdapter();
        binding.recycle.setAdapter(adapter);
        adapter.setList(list);
    }


}
