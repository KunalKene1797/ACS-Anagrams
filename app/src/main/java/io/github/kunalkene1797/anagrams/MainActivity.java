package io.github.kunalkene1797.anagrams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button check;
    ListView listview1;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        check = (Button)findViewById(R.id.check);
        textView = (TextView)findViewById(R.id.textView);
        setContentView(R.layout.activity_main);
        String list[] = {
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        ListView listview1 = (ListView)findViewById(R.id.listview1);
        listview1.setAdapter(adapter);
    }
}
