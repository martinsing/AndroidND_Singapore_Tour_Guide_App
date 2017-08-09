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

public class HawkerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.n13),getString(R.string.a13)));
        places.add(new Place(getString(R.string.n14),getString(R.string.a14)));
        places.add(new Place(getString(R.string.n15),getString(R.string.a15)));
        places.add(new Place(getString(R.string.n16),getString(R.string.a16)));
        places.add(new Place(getString(R.string.n17),getString(R.string.a17)));
        places.add(new Place(getString(R.string.n18),getString(R.string.a18)));
        places.add(new Place(getString(R.string.n19),getString(R.string.a19)));
        places.add(new Place(getString(R.string.n20),getString(R.string.a20)));
        places.add(new Place(getString(R.string.n21),getString(R.string.a21)));
        places.add(new Place(getString(R.string.n22),getString(R.string.a22)));
        places.add(new Place(getString(R.string.n23),getString(R.string.a23)));
        places.add(new Place(getString(R.string.n24),getString(R.string.a24)));
        places.add(new Place(getString(R.string.n25),getString(R.string.a25)));
        places.add(new Place(getString(R.string.n26),getString(R.string.a26)));
        places.add(new Place(getString(R.string.n27),getString(R.string.a27)));
        places.add(new Place(getString(R.string.n28),getString(R.string.a28)));
        places.add(new Place(getString(R.string.n29),getString(R.string.a29)));
        places.add(new Place(getString(R.string.n30),getString(R.string.a30)));
        places.add(new Place(getString(R.string.n31),getString(R.string.a31)));
        places.add(new Place(getString(R.string.n32),getString(R.string.a32)));
        places.add(new Place(getString(R.string.n33),getString(R.string.a33)));
        places.add(new Place(getString(R.string.n34),getString(R.string.a34)));
        places.add(new Place(getString(R.string.n35),getString(R.string.a35)));
        places.add(new Place(getString(R.string.n36),getString(R.string.a36)));
        places.add(new Place(getString(R.string.n37),getString(R.string.a37)));
        places.add(new Place(getString(R.string.n38),getString(R.string.a38)));
        places.add(new Place(getString(R.string.n39),getString(R.string.a39)));
        places.add(new Place(getString(R.string.n40),getString(R.string.a40)));
        places.add(new Place(getString(R.string.n41),getString(R.string.a41)));
        places.add(new Place(getString(R.string.n42),getString(R.string.a42)));
        places.add(new Place(getString(R.string.n43),getString(R.string.a43)));
        places.add(new Place(getString(R.string.n44),getString(R.string.a44)));
        places.add(new Place(getString(R.string.n45),getString(R.string.a45)));
        places.add(new Place(getString(R.string.n46),getString(R.string.a46)));
        places.add(new Place(getString(R.string.n47),getString(R.string.a47)));
        places.add(new Place(getString(R.string.n48),getString(R.string.a48)));
        places.add(new Place(getString(R.string.n49),getString(R.string.a49)));
        places.add(new Place(getString(R.string.n50),getString(R.string.a50)));
        places.add(new Place(getString(R.string.n51),getString(R.string.a51)));
        places.add(new Place(getString(R.string.n52),getString(R.string.a52)));
        places.add(new Place(getString(R.string.n53),getString(R.string.a53)));
        places.add(new Place(getString(R.string.n54),getString(R.string.a54)));
        places.add(new Place(getString(R.string.n55),getString(R.string.a55)));
        places.add(new Place(getString(R.string.n56),getString(R.string.a56)));
        places.add(new Place(getString(R.string.n57),getString(R.string.a57)));
        places.add(new Place(getString(R.string.n58),getString(R.string.a58)));
        places.add(new Place(getString(R.string.n59),getString(R.string.a59)));
        places.add(new Place(getString(R.string.n60),getString(R.string.a60)));
        places.add(new Place(getString(R.string.n61),getString(R.string.a61)));
        places.add(new Place(getString(R.string.n62),getString(R.string.a62)));
        places.add(new Place(getString(R.string.n63),getString(R.string.a63)));
        places.add(new Place(getString(R.string.n64),getString(R.string.a64)));
        places.add(new Place(getString(R.string.n65),getString(R.string.a65)));
        places.add(new Place(getString(R.string.n66),getString(R.string.a66)));
        places.add(new Place(getString(R.string.n67),getString(R.string.a67)));
        places.add(new Place(getString(R.string.n68),getString(R.string.a68)));
        places.add(new Place(getString(R.string.n69),getString(R.string.a69)));
        places.add(new Place(getString(R.string.n70),getString(R.string.a70)));
        places.add(new Place(getString(R.string.n71),getString(R.string.a71)));
        places.add(new Place(getString(R.string.n72),getString(R.string.a72)));
        places.add(new Place(getString(R.string.n73),getString(R.string.a73)));
        places.add(new Place(getString(R.string.n74),getString(R.string.a74)));
        places.add(new Place(getString(R.string.n75),getString(R.string.a75)));
        places.add(new Place(getString(R.string.n76),getString(R.string.a76)));
        places.add(new Place(getString(R.string.n77),getString(R.string.a77)));
        places.add(new Place(getString(R.string.n78),getString(R.string.a78)));
        places.add(new Place(getString(R.string.n79),getString(R.string.a79)));
        places.add(new Place(getString(R.string.n80),getString(R.string.a80)));
        places.add(new Place(getString(R.string.n81),getString(R.string.a81)));
        places.add(new Place(getString(R.string.n82),getString(R.string.a82)));
        places.add(new Place(getString(R.string.n83),getString(R.string.a83)));
        places.add(new Place(getString(R.string.n84),getString(R.string.a84)));
        places.add(new Place(getString(R.string.n85),getString(R.string.a85)));
        places.add(new Place(getString(R.string.n86),getString(R.string.a86)));
        places.add(new Place(getString(R.string.n87),getString(R.string.a87)));
        places.add(new Place(getString(R.string.n88),getString(R.string.a88)));
        places.add(new Place(getString(R.string.n89),getString(R.string.a89)));
        places.add(new Place(getString(R.string.n90),getString(R.string.a90)));
        places.add(new Place(getString(R.string.n91),getString(R.string.a91)));
        places.add(new Place(getString(R.string.n92),getString(R.string.a92)));
        places.add(new Place(getString(R.string.n93),getString(R.string.a93)));
        places.add(new Place(getString(R.string.n94),getString(R.string.a94)));
        places.add(new Place(getString(R.string.n95),getString(R.string.a95)));
        places.add(new Place(getString(R.string.n96),getString(R.string.a96)));
        places.add(new Place(getString(R.string.n97),getString(R.string.a97)));
        places.add(new Place(getString(R.string.n98),getString(R.string.a98)));
        places.add(new Place(getString(R.string.n99),getString(R.string.a99)));
        places.add(new Place(getString(R.string.n100),getString(R.string.a100)));
        places.add(new Place(getString(R.string.n101),getString(R.string.a101)));
        places.add(new Place(getString(R.string.n102),getString(R.string.a102)));
        places.add(new Place(getString(R.string.n103),getString(R.string.a103)));
        places.add(new Place(getString(R.string.n104),getString(R.string.a104)));
        places.add(new Place(getString(R.string.n105),getString(R.string.a105)));
        places.add(new Place(getString(R.string.n106),getString(R.string.a106)));
        places.add(new Place(getString(R.string.n107),getString(R.string.a107)));
        places.add(new Place(getString(R.string.n108),getString(R.string.a108)));
        places.add(new Place(getString(R.string.n109),getString(R.string.a109)));
        places.add(new Place(getString(R.string.n110),getString(R.string.a110)));
        places.add(new Place(getString(R.string.n111),getString(R.string.a111)));
        places.add(new Place(getString(R.string.n112),getString(R.string.a112)));
        places.add(new Place(getString(R.string.n113),getString(R.string.a113)));
        places.add(new Place(getString(R.string.n114),getString(R.string.a114)));
        places.add(new Place(getString(R.string.n115),getString(R.string.a115)));
        places.add(new Place(getString(R.string.n116),getString(R.string.a116)));
        places.add(new Place(getString(R.string.n117),getString(R.string.a117)));
        places.add(new Place(getString(R.string.n118),getString(R.string.a118)));
        places.add(new Place(getString(R.string.n119),getString(R.string.a119)));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        final PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_hawkers);

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
