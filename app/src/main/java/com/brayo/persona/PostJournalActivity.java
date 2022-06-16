package com.brayo.persona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.brayo.persona.databinding.ActivityPostJournalBinding;

public class PostJournalActivity extends AppCompatActivity {
    private ActivityPostJournalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPostJournalBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }
}