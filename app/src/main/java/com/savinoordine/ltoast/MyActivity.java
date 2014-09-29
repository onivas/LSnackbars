package com.savinoordine.ltoast;

import io.github.onivas.lsnackbars.LSnackbarsLibrary;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        FrameLayout relativeLayout = (FrameLayout) findViewById(R.id.app_relative_layout);

        final LSnackbarsLibrary lsnackbarsLibrary = new LSnackbarsLibrary(getApplicationContext(), relativeLayout);

        final ImageButton menu = (ImageButton) findViewById(R.id.menu_button);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lsnackbarsLibrary.showLToast("Here I am! ", menu);
            }
        });
    }
}
