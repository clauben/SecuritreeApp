package com.example.securitree_app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_new);

        ImageView mImageView = (ImageView)findViewById(R.id.imageView2);

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent mainIntent = new Intent(DashboardNew.this, Main4Activity.class);
                DashboardNew.this.startActivity(mainIntent);

            }
        });

    }

}
