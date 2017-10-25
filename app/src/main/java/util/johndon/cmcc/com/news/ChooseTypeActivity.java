package util.johndon.cmcc.com.news;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by root on 17-10-25.
 */

public class ChooseTypeActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_type);
        findViewById(R.id.ll_top).setOnClickListener(this);
        findViewById(R.id.ll_social).setOnClickListener(this);
        findViewById(R.id.ll_national).setOnClickListener(this);
        findViewById(R.id.ll_world).setOnClickListener(this);
        findViewById(R.id.ll_entertainment).setOnClickListener(this);
        findViewById(R.id.ll_sport).setOnClickListener(this);
        findViewById(R.id.ll_military).setOnClickListener(this);
        findViewById(R.id.ll_science).setOnClickListener(this);
        findViewById(R.id.ll_finance).setOnClickListener(this);
        findViewById(R.id.ll_fashion).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
