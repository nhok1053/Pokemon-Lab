package com.example.hasan.test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayFragment extends Fragment {

    ImageView img_back;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    View vn;
    public PlayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_play, container, false);
        img_back = (ImageView) v.findViewById(R.id.fragmentplay_back);
        btn1 = (Button) v.findViewById(R.id.btn1);
        btn2 = (Button) v.findViewById(R.id.btn2);
        btn3 = (Button) v.findViewById(R.id.btn3);
        btn4 = (Button) v.findViewById(R.id.btn4);
        vn = v.findViewById(R.id.view);
        addListener();
        btn1.setBackgroundResource(R.drawable.custom_view_circular_white);
        btn2.setBackgroundResource(R.drawable.custom_view_circular_white);
        btn3.setBackgroundResource(R.drawable.custom_view_circular_white);
        btn4.setBackgroundResource(R.drawable.custom_view_circular_white);

        return v;

    }

    private void addListener() {
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
    }

}
