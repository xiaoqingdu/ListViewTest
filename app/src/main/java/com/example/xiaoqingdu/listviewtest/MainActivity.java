package com.example.xiaoqingdu.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private final static String Student_name="name";
    private final static String Student_class="class";
    private final static String Student_num="num";
    private final static String Student_sex="sex";
    private final static String Student_phone="phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names={"小明","小红","李华","文豪"};
        String[] classes={"13","12","11","9"};
        String[] nums={"1304","1234","1123","0923"};
        String[] sex={"男","女","男","女"};
        String[] phone={"15839334602","15839334603","15839334604","15839334605"};

        List<Map<String ,Object>> items=new ArrayList<Map<String, Object>>();
        for(int i=0;i<names.length;i++){
            Map<String ,Object> item=new HashMap<String,Object>();
            item.put(Student_name,names[i]);
            item.put(Student_class,classes[i]);
            item.put(Student_num,nums[i]);
            item.put(Student_sex,sex[i]);
            item.put(Student_phone,phone[i]);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{
                Student_name,Student_class,Student_num,Student_sex,Student_phone},
                new int[]{R.id.stu_name,R.id.stu_class,R.id.stu_num,R.id.stu_sex,R.id.stu_phonenum});
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
