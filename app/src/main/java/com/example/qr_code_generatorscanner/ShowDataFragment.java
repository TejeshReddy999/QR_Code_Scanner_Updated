package com.example.qr_code_generatorscanner;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textview.MaterialTextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShowDataFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShowDataFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters

    private MaterialTextView qrCodeTextInputEditText;
    private MaterialTextView qrCodeTextInputEditText1;
    private MaterialTextView qrCodeTextInputEditText2;
    private String mParam1;

    public ShowDataFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShowDataFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShowDataFragment newInstance(String param1, String param2) {
        ShowDataFragment fragment = new ShowDataFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString("concatinatedString");
            qrCodeTextInputEditText.setText("temp1");
            qrCodeTextInputEditText1.setText("temp2");
            qrCodeTextInputEditText2.setText("temp3");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_show_data, container, false);
        qrCodeTextInputEditText  = rootView.findViewById(R.id.inputData);
        qrCodeTextInputEditText1 = rootView.findViewById(R.id.inputData1);
        qrCodeTextInputEditText2 = rootView.findViewById(R.id.inputData2);
        return rootView;
    }
}