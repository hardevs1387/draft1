package com.example.draft1.ui.Camera;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.inline.InlineContentView;
import com.example.draft1.R;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CameraFragment extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_camera);
    }
}
