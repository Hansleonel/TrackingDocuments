package com.example.codehans.trackingdocuments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by ogtie05 on 25/04/2018.
 */

public class SeguimientoActivityAdapter extends RecyclerView.Adapter<SeguimientoActivityAdapter.SeguimientoViewHolder> {

    private ArrayList<SeguimientoActivityContainer> datosSeguimientoActivityContainerArrayList;

    public SeguimientoActivityAdapter(ArrayList<SeguimientoActivityContainer> datosSeguimientoActivityContainerArrayList) {
        this.datosSeguimientoActivityContainerArrayList = datosSeguimientoActivityContainerArrayList;
    }

    @Override
    public SeguimientoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_tracking, parent, false);
        SeguimientoActivityAdapter.SeguimientoViewHolder seguimientoViewHolder = new SeguimientoActivityAdapter.SeguimientoViewHolder(itemView);

        return seguimientoViewHolder;
    }

    @Override
    public void onBindViewHolder(SeguimientoViewHolder viewholder, int position) {
        SeguimientoActivityContainer item = datosSeguimientoActivityContainerArrayList.get(position);
        viewholder.bindSeguimiento(item);
    }

    @Override
    public int getItemCount() {
        return datosSeguimientoActivityContainerArrayList.size();
    }

    public class SeguimientoViewHolder extends RecyclerView.ViewHolder {
        private TextView txtV_item_date;
        private TextView txtV_item_tittle;
        private TextView txtV_item_description;

        public SeguimientoViewHolder(View itemView) {
            super(itemView);

            txtV_item_date = (TextView) itemView.findViewById(R.id.txtV_item_tracking_date);
            txtV_item_tittle = (TextView) itemView.findViewById(R.id.txtV_item_tracking_tittle);
            txtV_item_description = (TextView) itemView.findViewById(R.id.txtV_item_tracking_description);


        }

        public void bindSeguimiento(SeguimientoActivityContainer p) {
            txtV_item_date.setText(p.getDateAll());
            txtV_item_tittle.setText(p.getIdOficina());
            txtV_item_description.setText(p.getDescEstado());

            //Glide.with(context).load("http://www.ocrm.gob.pe/sigem_files/" + String.valueOf(p.getPhoto())).crossFade().centerCrop().into(circleImageView_informe);

        }


    }
}
