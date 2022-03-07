package com.codewithutsav.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.tiagohm.markdownview.MarkdownView;

public class InformationActivity extends AppCompatActivity {
    MarkdownView markdownView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        markdownView = findViewById(R.id.markdown_view);
        markdownView.loadMarkdownFromAsset("madal.md");

    }
}