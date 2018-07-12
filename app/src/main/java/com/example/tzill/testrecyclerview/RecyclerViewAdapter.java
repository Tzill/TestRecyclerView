package com.example.tzill.testrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private String[] captions;
    private String[] texts;

    public RecyclerViewAdapter(){
    //public RecyclerViewAdapter(String[] captions, String[] texts){

        //this.captions = captions;
        //this.texts = texts;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ListView mListView;

        public ViewHolder(@NonNull ListView listView) {
            super(listView);
            this.mListView = listView;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        ListView listView = (ListView) LayoutInflater.from(parent.getContext()).inflate((R.layout.my_fragment), parent, false);
        return new ViewHolder(listView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        ListView listView = viewHolder.mListView;
        TextView captionTextView = (TextView)listView.findViewById(R.id.caption_tv);
        TextView textTextView = (TextView)listView.findViewById(R.id.text_tv);
        //captionTextView.setText(captions[position]);
        //textTextView.setText(captions[position]);



    }

    @Override
    public int getItemCount() {
        return 5;
        //return captions.length;
    }


}
