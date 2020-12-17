package com.example.kami;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BlankFragment1 extends Fragment {

    private FragmentActivity activity;
    private RecyclerView rcy1;
    private ArrayList<Person> list;
    private MyRcyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity = getActivity();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank1, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        list.add(new Person("太上曰：祸福无门，唯人自召。\n" +
                "善恶之报，如影随形。\n" +
                "是以天地有司过之神依人所犯轻重，以夺人算。\n" +
                "算减则贫耗，多逢忧患，人皆恶之，刑祸随之，吉庆避之，恶星灾之，算尽则死。\n" +
                "又有三台北斗神君，在人头上，录人罪恶，夺其纪算。\n" +
                "又有三尸神，在人身中，每到庚申日，辄上诣天曹，言人罪过。\n" +
                "月晦之日，灶神亦然。\n" +
                "凡人有过，大则夺纪，小则夺算。\n" +
                "其过大小，有数百事，欲求长生者，先须避之。\n" +
                "是道则进，非道则退。\n" +
                "不履邪径，不欺暗室。\n" +
                "积德累功，慈心於物。"+
                "忠孝友悌，正己化人，矜孤恤寡，敬老怀幼。\n" +
                        "昆虫草木，犹不可伤。\n" +
                        "宜悯人之凶，乐人之善，济人之急，救人之危。\n" +
                        "见人之得，如己之得。\n" +
                        "见人之失，如己之失。\n" +
                        "不彰人短，不炫己长。\n" +
                        "遏恶扬善，推多取少。\n" +
                        "受辱不怨，受宠若惊。\n" +
                        "施恩不求报，与人不追悔。\n" +
                        "所谓善人，人皆敬之，天道佑之，福禄随之。\n" +
                        "众邪远之，神灵卫之，所作必成，神仙可冀。\n" +
                        "欲求天仙者，当立一千三百善，欲求地仙者，当立三百善；\n"));
        adapter.notifyDataSetChanged();

    }

    private void initView(View view) {
        rcy1 = view.findViewById(R.id.rcy1);
        rcy1.setLayoutManager(new LinearLayoutManager(activity));
        list = new ArrayList<>();
        adapter = new MyRcyAdapter(activity,list);
        rcy1.setAdapter(adapter);
    }
}