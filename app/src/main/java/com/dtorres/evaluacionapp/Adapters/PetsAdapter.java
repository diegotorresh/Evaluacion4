package com.dtorres.evaluacionapp.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dtorres.evaluacionapp.R;
import com.dtorres.evaluacionapp.Modelo.Mascota;

import java.util.ArrayList;
import java.util.List;

public class PetsAdapter extends RecyclerView.Adapter<PetsAdapter.ViewHolder>{

    private static final String TAG = PetsAdapter.class.getSimpleName();

    private List<Mascota> mascotas;

    public PetsAdapter(){
        this.mascotas = new ArrayList<>();
    }

    public void setProductos(List<Mascota> pets){
        this.mascotas = mascotas;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView fotoImage;
        TextView nombreText;
        TextView razaText;
        TextView edadText;

        ViewHolder(View itemView) {
            super(itemView);
            fotoImage = itemView.findViewById(R.id.item_foto);
            nombreText = itemView.findViewById(R.id.item_nombre);
            razaText = itemView.findViewById(R.id.item_raza);
            edadText = itemView.findViewById(R.id.item_edad);
        }
    }

    @NonNull
    @Override
    public PetsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PetsAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
