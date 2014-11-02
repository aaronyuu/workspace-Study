package cn.yuchuanxi.gridviewdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class MainActivity extends ActionBarActivity {

	private GridView gridview;
	private SimpleAdapter simpleadapter;
	private List<Map<String,Object>>datalist;
	private String[] s=new String[]{"abc","def","haha"};
	private int[] image=new int[]{R.drawable.baidu,R.drawable.xiaomi,R.drawable.yun};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		gridview=(GridView) findViewById(R.id.gridView1);
		
		datalist=new ArrayList<Map<String,Object>>();
		simpleadapter=new SimpleAdapter(this, getdata() , R.layout.gridviewitem, new String[]{"text","image"}, new int[]{R.id.textViewitem,R.id.imageitem});
		
		gridview.setAdapter(simpleadapter);
		
	}
	private List<Map<String,Object>> getdata() {
		// TODO Auto-generated method stub
		
		for (int i=0;i<3;i++){
			Map<String,Object> map=new HashMap<String, Object>();
			map.put("text", s[i]);
			map.put("image", image[i]);
			datalist.add(map);
		}
		return datalist;
	}

	
}
