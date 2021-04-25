package com.example.hw42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView =findViewById(R.id.listVw );
        String[] recipes= {"Σούπα βελουτε με καροτο","Πρωινό γεμάτο ενέργεια","Ομελέτα φούρνου","Μακαρονάδα με μύδια","Μπακαλιαρακια στο φουρνο"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.item, recipes );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView textView = (TextView) view;

                Intent intent = new Intent(MainActivity.this, SeondActivity.class );
                intent .putExtra("name",textView.getText().toString() );
                startActivity(intent);
            }
        });

    }
}