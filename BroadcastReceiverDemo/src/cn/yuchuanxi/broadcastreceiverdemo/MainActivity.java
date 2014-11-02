package cn.yuchuanxi.broadcastreceiverdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.UserHandle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/**
		 * 动态注册广播接收器下面三步实现
		 */
		ReceiveBC3 bc3 = new ReceiveBC3(); // 1.实例化BroadcastReceiver
		IntentFilter filter = new IntentFilter("BC_One"); // 2.注册过滤器
		registerReceiver(bc3, filter);   //3.注册监听器

	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_send1:
			Intent intent = new Intent();
			intent.putExtra("msg", "这是一条普通广播,谁收到谁得500万大奖");
			intent.setAction("BC_One");
			sendBroadcast(intent);
			break;
		case R.id.btn_send2:
			Intent intent2 = new Intent();
			intent2.putExtra("msg", "这是一条有序广播,可中止,可修改");
			intent2.setAction("BC_One");
			sendOrderedBroadcast(intent2,null);
			break;
		case R.id.btn_send3:
			Intent intent3 = new Intent();
			intent3.putExtra("msg", "这是一条异步广播,是先发送,再注册监听,依然可以收到 ");
			intent3.setAction("BC_Three");
			sendStickyBroadcast(intent3);
			
			/**
			 * 动态注册广播接收器下面三步实现
			 */
			ReceiveBC4 bc4 = new ReceiveBC4(); // 1.实例化BroadcastReceiver
			IntentFilter filter4 = new IntentFilter("BC_Three"); // 2.注册过滤器
			registerReceiver(bc4, filter4);   //3.注册监听器
			
			break;
		default:
			break;
		}

	}

}
