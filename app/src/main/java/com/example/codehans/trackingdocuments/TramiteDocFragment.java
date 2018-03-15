package com.example.codehans.trackingdocuments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TramiteDocFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TramiteDocFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TramiteDocFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private Button btn_ver_document;
    private Button btn_seguir_document;
    private Button btn_ver_document2;
    private Button btn_seguir_document2;
    private Button btn_ver_document3;
    private Button btn_seguir_document3;
    private Button btn_ver_document4;
    private Button btn_seguir_document4;
    private Button btn_ver_document5;
    private Button btn_seguir_document5;
    private Button btn_ver_document6;
    private Button btn_seguir_document6;
    private Button btn_ver_document7;
    private Button btn_seguir_document7;
    private ScrollView scrollView_01;
    private ProgressBar progressBar;
    private CardView cardView01;
    private CardView cardView02;
    private CardView cardView03;
    private CardView cardView04;
    private CardView cardView05;
    private CardView cardView06;
    private CardView cardView07;
    private CardView cardView08;
    private CardView cardView09;
    private CardView cardView10;

    private AutoCompleteTextView autoCompleteTextView_tradoc;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TramiteDocFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TramiteDocFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TramiteDocFragment newInstance(String param1, String param2) {
        TramiteDocFragment fragment = new TramiteDocFragment();
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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RelativeLayout linearLayout = (RelativeLayout) inflater.inflate(R.layout.fragment_tramite_doc, container, false);
        //return inflater.inflate(R.layout.fragment_tramite_doc, container, false);

        scrollView_01 = (ScrollView) linearLayout.findViewById(R.id.scrollView_01);
        progressBar = (ProgressBar) linearLayout.findViewById(R.id.ProgressBar_01);
        btn_ver_document = (Button) linearLayout.findViewById(R.id.btn_card_main1_action1);
        btn_seguir_document = (Button) linearLayout.findViewById(R.id.btn_card_main1_action2);
        btn_ver_document2 = (Button) linearLayout.findViewById(R.id.btn_card_main2_action1);
        btn_seguir_document2 = (Button) linearLayout.findViewById(R.id.btn_card_main2_action2);
        btn_ver_document3 = (Button) linearLayout.findViewById(R.id.btn_card_main3_action1);
        btn_seguir_document3 = (Button) linearLayout.findViewById(R.id.btn_card_main3_action2);
        btn_ver_document4 = (Button) linearLayout.findViewById(R.id.btn_card_main4_action1);
        btn_seguir_document4 = (Button) linearLayout.findViewById(R.id.btn_card_main4_action2);
        btn_ver_document5 = (Button) linearLayout.findViewById(R.id.btn_card_main5_action1);
        btn_seguir_document5 = (Button) linearLayout.findViewById(R.id.btn_card_main5_action2);
        btn_ver_document6 = (Button) linearLayout.findViewById(R.id.btn_card_main6_action1);
        btn_seguir_document6 = (Button) linearLayout.findViewById(R.id.btn_card_main6_action2);
        btn_ver_document7 = (Button) linearLayout.findViewById(R.id.btn_card_main7_action1);
        btn_seguir_document7 = (Button) linearLayout.findViewById(R.id.btn_card_main7_action2);
        autoCompleteTextView_tradoc = (AutoCompleteTextView) linearLayout.findViewById(R.id.AutoCompleteTxtV);
        cardView01 = (CardView) linearLayout.findViewById(R.id.cardV_01);
        cardView02 = (CardView) linearLayout.findViewById(R.id.cardV_02);
        cardView03 = (CardView) linearLayout.findViewById(R.id.cardV_03);
        cardView04 = (CardView) linearLayout.findViewById(R.id.cardV_04);
        cardView05 = (CardView) linearLayout.findViewById(R.id.cardV_05);
        cardView06 = (CardView) linearLayout.findViewById(R.id.cardV_06);
        cardView07 = (CardView) linearLayout.findViewById(R.id.cardV_07);
        cardView08 = (CardView) linearLayout.findViewById(R.id.cardV_08);
        cardView09 = (CardView) linearLayout.findViewById(R.id.cardV_09);
        cardView10 = (CardView) linearLayout.findViewById(R.id.cardV_10);

        String[] Documents = new String[]{
                "2628", "1456", "1009", "1200", "1900", "2100", "2800", "1286", "1453", "Todos los documentos"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_dropdown_item_1line, Documents);

        autoCompleteTextView_tradoc.setAdapter(adapter);

        autoCompleteTextView_tradoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                if (textView.getText().toString().equals("2628")) {
                    cardView01.setVisibility(View.VISIBLE);
                    cardView02.setVisibility(View.GONE);
                    cardView03.setVisibility(View.GONE);
                    cardView04.setVisibility(View.GONE);
                    cardView05.setVisibility(View.GONE);
                    cardView06.setVisibility(View.GONE);
                    cardView07.setVisibility(View.GONE);
                    cardView08.setVisibility(View.GONE);
                    cardView09.setVisibility(View.GONE);
                    cardView10.setVisibility(View.GONE);
                } else if (textView.getText().toString().equals("1456")) {
                    cardView01.setVisibility(View.GONE);
                    cardView02.setVisibility(View.VISIBLE);
                    cardView03.setVisibility(View.GONE);
                    cardView04.setVisibility(View.GONE);
                    cardView05.setVisibility(View.GONE);
                    cardView06.setVisibility(View.GONE);
                    cardView07.setVisibility(View.GONE);
                    cardView08.setVisibility(View.GONE);
                    cardView09.setVisibility(View.GONE);
                    cardView10.setVisibility(View.GONE);
                } else if (textView.getText().toString().equals("1009")) {
                    cardView01.setVisibility(View.GONE);
                    cardView02.setVisibility(View.GONE);
                    cardView03.setVisibility(View.VISIBLE);
                    cardView04.setVisibility(View.GONE);
                    cardView05.setVisibility(View.GONE);
                    cardView06.setVisibility(View.GONE);
                    cardView07.setVisibility(View.GONE);
                    cardView08.setVisibility(View.GONE);
                    cardView09.setVisibility(View.GONE);
                    cardView10.setVisibility(View.GONE);
                } else if (textView.getText().toString().equals("1200")) {
                    cardView01.setVisibility(View.GONE);
                    cardView02.setVisibility(View.GONE);
                    cardView03.setVisibility(View.GONE);
                    cardView04.setVisibility(View.VISIBLE);
                    cardView05.setVisibility(View.GONE);
                    cardView06.setVisibility(View.GONE);
                    cardView07.setVisibility(View.GONE);
                    cardView08.setVisibility(View.GONE);
                    cardView09.setVisibility(View.GONE);
                    cardView10.setVisibility(View.GONE);
                } else if (textView.getText().toString().equals("1900")) {
                    cardView01.setVisibility(View.GONE);
                    cardView02.setVisibility(View.GONE);
                    cardView03.setVisibility(View.GONE);
                    cardView04.setVisibility(View.GONE);
                    cardView05.setVisibility(View.VISIBLE);
                    cardView06.setVisibility(View.GONE);
                    cardView07.setVisibility(View.GONE);
                    cardView08.setVisibility(View.GONE);
                    cardView09.setVisibility(View.GONE);
                    cardView10.setVisibility(View.GONE);
                } else if (textView.getText().toString().equals("2100")) {
                    cardView01.setVisibility(View.GONE);
                    cardView02.setVisibility(View.GONE);
                    cardView03.setVisibility(View.GONE);
                    cardView04.setVisibility(View.GONE);
                    cardView05.setVisibility(View.GONE);
                    cardView06.setVisibility(View.VISIBLE);
                    cardView07.setVisibility(View.GONE);
                    cardView08.setVisibility(View.GONE);
                    cardView09.setVisibility(View.GONE);
                    cardView10.setVisibility(View.GONE);
                } else if (textView.getText().toString().equals("Todos los documentos")) {
                    cardView01.setVisibility(View.VISIBLE);
                    cardView02.setVisibility(View.VISIBLE);
                    cardView03.setVisibility(View.VISIBLE);
                    cardView04.setVisibility(View.VISIBLE);
                    cardView05.setVisibility(View.VISIBLE);
                    cardView06.setVisibility(View.VISIBLE);
                    cardView07.setVisibility(View.VISIBLE);
                    cardView08.setVisibility(View.VISIBLE);
                    cardView09.setVisibility(View.VISIBLE);
                    cardView10.setVisibility(View.VISIBLE);
                }
            }
        });


        progressBar.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                scrollView_01.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.GONE);
            }
        }, 1800);

        btn_ver_document.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), DocumentoActivity.class);
                startActivity(i);
            }
        });

        btn_seguir_document.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getContext(), SeguimientoActivity.class);
                startActivity(in);
            }
        });

        btn_ver_document2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(getContext(), DocumentoActivity.class);
                startActivity(intento);
            }
        });

        btn_seguir_document2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SeguimientoActivity.class);
                startActivity(intent);
            }
        });


        return linearLayout;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    /*
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    */

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
