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


public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.n7),getString(R.string.a7)));
        places.add(new Place(getString(R.string.n8),getString(R.string.a8)));
        places.add(new Place(getString(R.string.n9),getString(R.string.a9)));
        places.add(new Place(getString(R.string.n10),getString(R.string.a10)));
        places.add(new Place(getString(R.string.n11),getString(R.string.a11)));
        places.add(new Place(getString(R.string.n12),getString(R.string.a12)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        final PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_museums);

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