package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by droberts2 on 2016-10-13.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    public final int COLOR;
    MediaPlayer mMediaPlayer;
    MediaPlayer mMediaPlayer2;


    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        COLOR = color;
        mMediaPlayer2.create(context, R.raw.number_one);

    }


    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.default_textView);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        mMediaPlayer.create(getContext(), R.raw.number_one);


        englishTextView.setText(currentWord.getDefaultWord());
        miwokTextView.setText(currentWord.getMiwokWord());


        if (currentWord.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getImage());
           // imageView.setBackgroundColor(Color.parseColor("#FFF7DA"));
        } else {
            imageView.setVisibility(View.GONE);
        }

        //setting color for list item, ranhou find the color that the res maps to
        View textContainer = listItemView.findViewById(R.id.textContainerLL);
        int color = ContextCompat.getColor(getContext(),COLOR);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
