package com.jlundho.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class ProjectZeroApplication extends AppCompatActivity {

    // Components
    private Button movieButton;
    private Button scoresButton;
    private Button libraryButton;
    private Button buildItBiggerButton;
    private Button xyzReaderButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_zero_application);

        init();
        setUpListeners();
    }

    private void init() {
        movieButton = (Button)findViewById(R.id.movie_app_button);
        scoresButton = (Button)findViewById(R.id.scores_app_button);
        libraryButton = (Button)findViewById(R.id.library_app_button);
        buildItBiggerButton = (Button)findViewById(R.id.buildItBigger_app_button);
        xyzReaderButton = (Button)findViewById(R.id.xyz_reader_button);
        capstoneButton = (Button)findViewById(R.id.capstone_app_button);
    }

    private void setUpListeners() {
        movieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the movies app!", Toast.LENGTH_SHORT).show();
            }
        });

        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the scores app!", Toast.LENGTH_SHORT).show();
            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the library app!", Toast.LENGTH_SHORT).show();
            }
        });

        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the Build it Bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the XYZ Reader app!", Toast.LENGTH_SHORT).show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch the Capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }




}
