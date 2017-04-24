package com.blogspot.dbh4ck.dbtheme;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by DB on 22-04-2017.
 */

public class dbThemeDialog extends DialogFragment implements View.OnClickListener {

    RecyclerView themesList;
    TextView cancelTxt;
    private int[] themes_colors;
    private MyRecycleAdapter adapter;

    public static dbThemeDialog newInstance(){
        dbThemeDialog f = new dbThemeDialog();
        return f;
    }

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NO_FRAME, DialogFragment.STYLE_NO_TITLE);
    }

    @Override
    public void onActivityCreated(Bundle arg0) {
        super.onActivityCreated(arg0);
        getDialog().getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        getDialog().getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT);
        getDialog().getWindow().setGravity(Gravity.BOTTOM);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.main, container, false);
        cancelTxt = (TextView) v.findViewById(R.id.cancel);
        cancelTxt.setOnClickListener(this);

        themesList = (RecyclerView) v.findViewById(R.id.recyclerViewThemes);

        themes_colors = new int[]{
                R.color.theme_pink1,
                R.color.theme_pink2,
                R.color.theme_pink3,
                R.color.theme_blue1,
                R.color.theme_blue2,
                R.color.theme_blue3,
                R.color.theme_red1,
                R.color.theme_red2,
                R.color.theme_green1,
                R.color.theme_green2,
                R.color.theme_green3,
                R.color.theme_green4,
                R.color.theme_purple1,
                R.color.theme_purple2,
                R.color.theme_black1,
                R.color.theme_yellow1,
                R.color.theme_brown1,
                R.color.theme_brown2,
                R.color.theme_green_shade,
                R.color.theme_grey_shade,
                R.color.app_color_primary
        };


        adapter = new MyRecycleAdapter(themes_colors, getContext());

        LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        themesList.setLayoutManager(horizontalLayoutManagaer);
        themesList.setAdapter(adapter);
        return v;
    }



    public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder> {

        private int[] horizontalList;
        Context context;

        public MyRecycleAdapter(int[] horizontalList, Context context) {
            this.horizontalList = horizontalList;
            this.context = context;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public ImageView imgView;

            public MyViewHolder(View view) {
                super(view);
                imgView = (ImageView) view.findViewById(R.id.circle_themes);

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switch (getPosition()){
                            case 0:
                                Utility.setTheme(getActivity().getApplicationContext(), 0);
                                recreateActivity();
                                break;
                            case 1:
                                Utility.setTheme(getActivity().getApplicationContext(), 1);
                                recreateActivity();
                                break;
                            case 2:
                                Utility.setTheme(getActivity().getApplicationContext(), 2);
                                recreateActivity();
                                break;
                            case 3:
                                Utility.setTheme(getActivity().getApplicationContext(), 3);
                                recreateActivity();
                                break;
                            case 4:
                                Utility.setTheme(getActivity().getApplicationContext(), 4);
                                recreateActivity();
                                break;
                            case 5:
                                Utility.setTheme(getActivity().getApplicationContext(), 5);
                                recreateActivity();
                                break;
                            case 6:
                                Utility.setTheme(getActivity().getApplicationContext(), 6);
                                recreateActivity();
                                break;
                            case 7:
                                Utility.setTheme(getActivity().getApplicationContext(), 7);
                                recreateActivity();
                                break;
                            case 8:
                                Utility.setTheme(getActivity().getApplicationContext(), 8);
                                recreateActivity();
                                break;
                            case 9:
                                Utility.setTheme(getActivity().getApplicationContext(), 9);
                                recreateActivity();
                                break;
                            case 10:
                                Utility.setTheme(getActivity().getApplicationContext(), 10);
                                recreateActivity();
                                break;
                            case 11:
                                Utility.setTheme(getActivity().getApplicationContext(), 11);
                                recreateActivity();
                                break;
                            case 12:
                                Utility.setTheme(getActivity().getApplicationContext(), 12);
                                recreateActivity();
                                break;
                            case 13:
                                Utility.setTheme(getActivity().getApplicationContext(), 13);
                                recreateActivity();
                                break;
                            case 14:
                                Utility.setTheme(getActivity().getApplicationContext(), 14);
                                recreateActivity();
                                break;
                            case 15:
                                Utility.setTheme(getActivity().getApplicationContext(), 15);
                                recreateActivity();
                                break;
                            case 16:
                                Utility.setTheme(getActivity().getApplicationContext(), 16);
                                recreateActivity();
                                break;
                            case 17:
                                Utility.setTheme(getActivity().getApplicationContext(), 17);
                                recreateActivity();
                                break;
                            case 18:
                                Utility.setTheme(getActivity().getApplicationContext(), 18);
                                recreateActivity();
                                break;
                            case 19:
                                Utility.setTheme(getActivity().getApplicationContext(), 19);
                                recreateActivity();
                                break;
                            case 20:
                                Utility.setTheme(getActivity().getApplicationContext(), 20);
                                recreateActivity();
                                break;

                        }
                    }
                });
            }
        }


        @Override
        public MyRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);

            return new MyRecycleAdapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final MyRecycleAdapter.MyViewHolder holder, final int position) {
            holder.imgView.setImageResource(horizontalList[position]);
        }


        @Override
        public int getItemCount() {
            return horizontalList.length;
        }
    }

    private void recreateActivity() {
        Intent intent = getActivity().getIntent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        getActivity().finish();
        getActivity().overridePendingTransition(0, 0);
        startActivity(intent);

        getActivity().overridePendingTransition(0, 0);
    }




    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.cancel) {
            getDialog().dismiss();
        }

    }

}
