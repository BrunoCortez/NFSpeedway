package nfspeedway.nfspeedway;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ConfActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.layout.activity_conf);
    }
}
