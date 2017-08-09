package com.vegetablecorp.singaporetourguide.View;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.vegetablecorp.singaporetourguide.Controller.Place;
import com.vegetablecorp.singaporetourguide.Controller.PlaceAdapter;
import com.vegetablecorp.singaporetourguide.R;

import java.util.ArrayList;

public class TopPlacesOfInterestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.n1),getString(R.string.a1), R.drawable.gardensbythebay));
        places.add(new Place(getString(R.string.n2),getString(R.string.a2), R.drawable.universalstudiossingapore));
        places.add(new Place(getString(R.string.n3),getString(R.string.a3), R.drawable.nightsafari));
        places.add(new Place(getString(R.string.n4),getString(R.string.a4), R.drawable.singaporezoo));
        places.add(new Place(getString(R.string.n5),getString(R.string.a5), R.drawable.singaporebotanicgardens));
        places.add(new Place(getString(R.string.n6),getString(R.string.a6), R.drawable.merlionpark));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        final PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_interest);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        // Makes a google search when the list item is clicked.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Find the current earthquake that was clicked on
                Place currentPlace = adapter.getItem(position);

                // Convert the String URL into a URI object (to pass into the Intent constructor)
                Uri placeUri = Uri.parse(currentPlace.getmName());

                // Create a new intent to view the earthquake URI
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.uri) + placeUri));

                // Send the intent to launch a new activity
                startActivity(websiteIntent);
            }
        });
    }
}