package com.zmarkan.artifactorysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zmarkan.echoer.Echo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Echo echoer = new Echo();

        ((TextView)findViewById(R.id.text)).setText(echoer.echo("Hello World!"));
    }
}
