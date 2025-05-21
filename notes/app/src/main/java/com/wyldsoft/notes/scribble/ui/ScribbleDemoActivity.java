package com.wyldsoft.notes.scribble.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.wyldsoft.notes.NotesActivity;
import com.wyldsoft.notes.R;
import com.wyldsoft.notes.databinding.ActivitySribbleDemoBinding;

/**
 * Created by seeksky on 2018/4/26.
 */

public class ScribbleDemoActivity extends AppCompatActivity {
    private ActivitySribbleDemoBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sribble_demo);
        binding.setActivitySribble(this);
    }


    public void button_notes(View view) {
        go(NotesActivity.class);
    }

    private void go(Class<?> activityClass) {
        startActivity(new Intent(this, activityClass));
    }
}
