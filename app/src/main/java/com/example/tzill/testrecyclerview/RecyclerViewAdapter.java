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
        TextView textView1;
        TextView textView2;
        public ViewHolder(@NonNull View listView) {
            super(listView);
            textView1 = listView.findViewById(R.id.caption_tv);
            textView2 = listView.findViewById(R.id.text_tv);
        }
    }

//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        private ListView mListView;
//
//        public ViewHolder(@NonNull ListView listView) {
//            super(listView);
//            this.mListView = listView;
//        }
//    }



    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View listView = LayoutInflater.from(parent.getContext()).inflate((R.layout.double_text), parent, false);
        return new ViewHolder(listView);
    }

//    @NonNull
//    @Override
//    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
//        ListView listView = (ListView) LayoutInflater.from(parent.getContext()).inflate((R.layout.double_text), parent, false);
//
//        return new ViewHolder(listView);
//    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
////        View listView = viewHolder.mListView;
//        TextView captionTextView = (TextView)listView.findViewById(R.id.caption_tv);
//        TextView textTextView = (TextView)listView.findViewById(R.id.text_tv);
        //captionTextView.setText(captions[position]);
        //textTextView.setText(captions[position]);

        //TODO нужно чем то заполнить captions
       // viewHolder.textView1.setText(captions[position]);
       // viewHolder.textView1.setText(captions[position]);

    }


//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
//        ListView listView = viewHolder.mListView;
//        TextView captionTextView = (TextView)listView.findViewById(R.id.caption_tv);
//        TextView textTextView = (TextView)listView.findViewById(R.id.text_tv);
//        //captionTextView.setText(captions[position]);
//        //textTextView.setText(captions[position]);
//
//
//
//    }

    @Override
    public int getItemCount() {
        return 20;
        //return captions.length;
    }


}
