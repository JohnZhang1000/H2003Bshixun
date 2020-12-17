package com.example.kami;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BlankFragment5 extends Fragment {
    private ArrayList<Person> list;
    private MyRcyAdapter adapter;
    private RecyclerView rcy5;
    private FragmentActivity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity = getActivity();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank5, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        list.add(new Person("唾流星，指虹霓。\n" +
                "辄指三光，久视日月，\n" +
                "春月燎猎，对北恶骂。\n" +
                "无故杀龟打蛇，如是等罪，\n" +
                "司命随其轻重，夺其纪算。\n" +
                "算尽则死，死有余责，乃殃及子孙。\n" +
                "又诸横取人财者，乃计其妻子家口以当之，渐至死丧。\n" +
                "若不死丧，则有水火盗贼，\n" +
                "遗亡器物，疾病口舌诸事，以当妄取之直。\n" +
                "又枉杀人者，是易刀兵而相杀也。\n" +
                "取非羲之财者，譬如漏脯救饥，\n" +
                "鸩酒止渴，非不暂饱，死亦及之。\n" +
                "夫心起於善，善虽未为，而吉神已随之。\n" +
                "或心起於恶，恶虽未为，而凶神已随之。\n" +
                "其有曾行恶事，後自改悔，\n" +
                "诸恶莫作，众善奉行。\n" +
                "久久必获吉庆，所谓转祸为福也。\n" +
                "故吉人语善，视善，行善。\n" +
                "一日有三善，三年天必降之福。\n" +
                "凶人语恶、视恶、行恶，一日有三恶，\n" +
                "三年天必降之祸，胡不勉而行之。"));
        adapter.notifyDataSetChanged();
    }

    private void initView(View view) {
        rcy5 = view.findViewById(R.id.rcy5);
        rcy5.setLayoutManager(new LinearLayoutManager(activity));
        list = new ArrayList<>();
        adapter = new MyRcyAdapter(activity, list);
        rcy5.setAdapter(adapter);

    }
}