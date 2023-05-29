package com.example.examencompleto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

  private   RespositoryOficio repo;
   private LayoutInflater layoutInflater;

   public MyAdapter (Context context){
       repo = RespositoryOficio.getInstance();
       layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

   }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = layoutInflater.inflate(R.layout.simple_element_rcvw,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
       Oficio oficio = repo.getOficio(position);
     //  String a =String.valueOf( oficio.getEdad());
       holder.a.setText(oficio.getNom());
       holder.b.setText(oficio.getEdad()+ "");

    }

    @Override
    public int getItemCount() {
        return repo.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        TextView a ;
        TextView b ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            a = itemView.findViewById(R.id.textViewNombre);
            b =  itemView.findViewById(R.id.textViewedad);
        }
    }
}
