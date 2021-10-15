package com.example.recyclerview;
// Step 3 creating adapter class
//the first thing to do is to create ViewHolder class, its purpose is to create different views for every item inside your recyclerview adapter

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    //10. creating arrayList for the modal we created and also we should create Context variable
    private ArrayList<ContactModal>contactModals=new ArrayList<>();
    private Context context;//we need context inorder to load different images from the internet

    //creating a constructor for the above(alt+insert)
    public RecyclerViewAdapter(Context context) {
        this.contactModals = contactModals;
        this.context = context;
    }
//15. creating empty constructor for the content to avoid null exceptions
    public RecyclerViewAdapter() {

    }

    //6. after extending the method , press ( ctrl + i) to generate the important methods
    @NonNull
    @Override
    //12.this method creates different View holder objects for each of the  items shown inside recyclerview
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }
    //13. this method sets each item to its position in recyclerview.it gets data and binds it
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ContactModal modal=contactModals.get(position);// getting exact position for the item

        holder.name.setText(modal.getName());
        holder.number.setText(modal.getNumber());
        Glide.with(context)
                .asBitmap()
                .load(modal.getImageUrl())
                .into(holder.imageView);
    }
//11.this method returns the size of items that are shown in the recyclerview
    @Override
    public int getItemCount() {
        return contactModals.size();
    }

    //14. creating a setter method for the contactModals(arraylist)
    public void setContactModals(ArrayList<ContactModal> contactModals) {
        this.contactModals = contactModals;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //5. create variables
        private ImageView imageView;
        private TextView name, number;
        //4 then create its constructor (alt + insert)
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //5. initializing them
            imageView=itemView.findViewById(R.id.image);
            number=itemView.findViewById(R.id.number);
            name=itemView.findViewById(R.id.name);
        }
    }
}
