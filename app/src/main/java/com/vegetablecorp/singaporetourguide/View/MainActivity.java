package com.vegetablecorp.singaporetourguide.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.vegetablecorp.singaporetourguide.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the category
        TextView hawkers = (TextView) findViewById(R.id.hawkers);
        
        // Find the View that shows the category
        TextView interest = (TextView) findViewById(R.id.interest);

        // Set a click listener on that View
        interest.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent museumsIntent = new Intent(MainActivity.this, TopPlacesOfInterestActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // Set a click listener on that View
        hawkers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open
                Intent hawkersIntent = new Intent(MainActivity.this, HawkerActivity.class);

                // Start the new activity
                startActivity(hawkersIntent);
            }
        });

        // Find the View that shows the category
        TextView libaries = (TextView) findViewById(R.id.libraries);

        // Set a click listener on that View
        libaries.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open 
                Intent libariesIntent = new Intent(MainActivity.this, LibrariesActivity.class);

                // Start the new activity
                startActivity(libariesIntent);
            }
        });
        
        // Find the View that shows the category
        TextView museums = (TextView) findViewById(R.id.museums);

        // Set a click listener on that View
        museums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open 
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });
    }
}
