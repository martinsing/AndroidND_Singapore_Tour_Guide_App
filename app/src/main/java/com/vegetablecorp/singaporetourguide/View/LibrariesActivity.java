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

public class LibrariesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.n120),getString(R.string.a120)));
        places.add(new Place(getString(R.string.n121),getString(R.string.a121)));
        places.add(new Place(getString(R.string.n122),getString(R.string.a122)));
        places.add(new Place(getString(R.string.n123),getString(R.string.a123)));
        places.add(new Place(getString(R.string.n124),getString(R.string.a124)));
        places.add(new Place(getString(R.string.n125),getString(R.string.a125)));
        places.add(new Place(getString(R.string.n126),getString(R.string.a126)));
        places.add(new Place(getString(R.string.n127),getString(R.string.a127)));
        places.add(new Place(getString(R.string.n128),getString(R.string.a128)));
        places.add(new Place(getString(R.string.n129),getString(R.string.a129)));
        places.add(new Place(getString(R.string.n130),getString(R.string.a130)));
        places.add(new Place(getString(R.string.n131),getString(R.string.a131)));
        places.add(new Place(getString(R.string.n132),getString(R.string.a132)));
        places.add(new Place(getString(R.string.n133),getString(R.string.a133)));
        places.add(new Place(getString(R.string.n134),getString(R.string.a134)));
        places.add(new Place(getString(R.string.n135),getString(R.string.a135)));
        places.add(new Place(getString(R.string.n136),getString(R.string.a136)));
        places.add(new Place(getString(R.string.n137),getString(R.string.a137)));
        places.add(new Place(getString(R.string.n138),getString(R.string.a138)));
        places.add(new Place(getString(R.string.n139),getString(R.string.a139)));
        places.add(new Place(getString(R.string.n140),getString(R.string.a140)));
        places.add(new Place(getString(R.string.n141),getString(R.string.a141)));
        places.add(new Place(getString(R.string.n142),getString(R.string.a142)));
        places.add(new Place(getString(R.string.n143),getString(R.string.a143)));
        places.add(new Place(getString(R.string.n144),getString(R.string.a144)));
        places.add(new Place(getString(R.string.n145),getString(R.string.a145)));
        places.add(new Place(getString(R.string.n146),getString(R.string.a146)));




        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        final PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_libraries);

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