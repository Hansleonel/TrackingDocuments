package com.example.codehans.trackingdocuments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class SeguimientoActivity extends AppCompatActivity {

    private static final String URL_TRAKING = "http://10.24.9.6:8080/sistradoc/0000740857.json";

    private RecyclerView recyclerView_tracking;
    private ArrayList<SeguimientoActivityContainer> ArrayListSeguimiento;

    SeguimientoActivityAdapter seguimientoActivityAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguimiento);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Seguimiento Documento");
        setSupportActionBar(toolbar);

        recyclerView_tracking = (RecyclerView) findViewById(R.id.recyclerViewTracking);
        recyclerView_tracking.setHasFixedSize(true);

        ArrayListSeguimiento = new ArrayList<SeguimientoActivityContainer>();

        ver_seguimiento();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void ver_seguimiento() {

        JSONObject js = new JSONObject();
        try {
            js.put("anno", "2017");
            js.put("codigoexpediente", "00001");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Make request for JSONObject
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(
                Request.Method.GET, URL_TRAKING, js,

                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            //obtengo el JsonObject jsonObjectData dentro del JsonObject response
                            JSONObject jsonObjectdata = response.getJSONObject("data");
                            //obtengo el JsonArray jsonArrayRuta dentro del JsonObject jsonObjectData
                            JSONArray jsonArrayRuta = jsonObjectdata.getJSONArray("ruta");
                            for (int i = 0; i < jsonArrayRuta.length(); i++) {
                                JSONObject jsonObjectRutaSeguimiento = jsonArrayRuta.getJSONObject(i);
                                String idOficina = jsonObjectRutaSeguimiento.getString("ofc_descripcion");
                                String dateAll = jsonObjectRutaSeguimiento.getString("ban_fechareg");
                                String dateYear = jsonObjectRutaSeguimiento.getString("ban_annodes");
                                String codOficina = jsonObjectRutaSeguimiento.getString("ban_ofcdes");
                                String codDescripcion = jsonObjectRutaSeguimiento.getString("ban_refdes");
                                String codEstado = jsonObjectRutaSeguimiento.getString("sit_codigo");
                                String desEstado = jsonObjectRutaSeguimiento.getString("sit_descripcion");

                                ArrayListSeguimiento.add(new SeguimientoActivityContainer(idOficina,dateAll,dateYear,codOficina,codDescripcion,codEstado,desEstado));

                            }
                            SeguimientoActivityAdapter adaptador = new SeguimientoActivityAdapter(ArrayListSeguimiento);
                            recyclerView_tracking.setAdapter(adaptador);
                            recyclerView_tracking.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));


                            Log.d("JsonObjectdata", "onResponse: " + jsonArrayRuta);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("eRRor Response", "Error: " + error.toString());
                Toast.makeText(getApplicationContext(), "" + error.toString(), Toast.LENGTH_LONG).show();
            }
        }) {

            /**
             * Passing some request headers
             */
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json; charset=utf-8");
                //headers.put("Authorization", "Bearer " + TOKEN);
                return headers;
            }
        };
        // Adding request to request queue
        Volley.newRequestQueue(getApplicationContext()).add(jsonObjReq);

    }


}

