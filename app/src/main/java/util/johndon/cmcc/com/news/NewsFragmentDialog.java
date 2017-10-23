package util.johndon.cmcc.com.news;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by root on 17-10-23.
 */

public class NewsFragmentDialog extends DialogFragment {
    private GridView mGv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_dialog_layout,container);
        mGv = (GridView) view.findViewById(R.id.gv_type);
        return view;
    }
}
