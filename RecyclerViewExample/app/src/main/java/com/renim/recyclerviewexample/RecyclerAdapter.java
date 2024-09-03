package com.renim.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CountryViewHolder> {
    private ArrayList<String> countryNameList;
    private ArrayList<String>detailsList;

    private ArrayList<Integer> imageList;
    private Context context;

    public RecyclerAdapter(ArrayList<String> countryNameList, ArrayList<String> detailsList, ArrayList<Integer> imageList, Context context) {
        this.countryNameList = countryNameList;
        this.detailsList = detailsList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_desing, parent, false);

        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        holder.textViewCountryName.setText(countryNameList.get(position));
        holder.textViewDetail.setText(detailsList.get(position));
        holder.imageView.setImageResource(imageList.get(position));
        holder.cardView.setOnClickListener(v -> {
            if(position == 0){
                Toast.makeText(context,"You selected the Turkey flag",Toast.LENGTH_SHORT).show();
            }
            else if(position == 1){
                Toast.makeText(context,"You selected the USA flag",Toast.LENGTH_SHORT).show();
            }
            else if(position == 2){
                Toast.makeText(context,"You selected the Germany flag",Toast.LENGTH_SHORT).show();
            }
            else if(position == 3){
                Toast.makeText(context,"You selected the United Kingdom flag",Toast.LENGTH_SHORT).show();
            }
            else if(position == 4){
                Toast.makeText(context,"You selected the Denmark flag",Toast.LENGTH_SHORT).show();
            }
            else if(position == 5){
                Toast.makeText(context,"You selected the France flag",Toast.LENGTH_SHORT).show();
            }
            else if(position == 6){
                Toast.makeText(context,"You selected the Italy flag",Toast.LENGTH_SHORT).show();
            }
            else if(position == 7){
                Toast.makeText(context,"You selected the Canada flag",Toast.LENGTH_SHORT).show();
            }
            else if(position == 8){
                Toast.makeText(context,"You selected the Russia flag",Toast.LENGTH_SHORT).show();
            }
            else if(position == 9){
                Toast.makeText(context,"You selected the Syria flag",Toast.LENGTH_SHORT).show();
            }

        });

    }

    @Override
    public int getItemCount() {
        return countryNameList.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewCountryName,textViewDetail;
        private ImageView imageView;
        private CardView cardView;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewCountryName = itemView.findViewById(R.id.textViewCountryName);
            textViewDetail = itemView.findViewById(R.id.textViewDetail);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }

}
