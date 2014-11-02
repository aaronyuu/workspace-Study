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
		 * ��̬ע��㲥��������������ʵ��
		 */
		ReceiveBC3 bc3 = new ReceiveBC3(); // 1.ʵ����BroadcastReceiver
		IntentFilter filter = new IntentFilter("BC_One"); // 2.ע�������
		registerReceiver(bc3, filter);   //3.ע�������

	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_send1:
			Intent intent = new Intent();
			intent.putExtra("msg", "����һ����ͨ�㲥,˭�յ�˭��500���");
			intent.setAction("BC_One");
			sendBroadcast(intent);
			break;
		case R.id.btn_send2:
			Intent intent2 = new Intent();
			intent2.putExtra("msg", "����һ������㲥,����ֹ,���޸�");
			intent2.setAction("BC_One");
			sendOrderedBroadcast(intent2,null);
			break;
		case R.id.btn_send3:
			Intent intent3 = new Intent();
			intent3.putExtra("msg", "����һ���첽�㲥,���ȷ���,��ע�����,��Ȼ�����յ� ");
			intent3.setAction("BC_Three");
			sendStickyBroadcast(intent3);
			
			/**
			 * ��̬ע��㲥��������������ʵ��
			 */
			ReceiveBC4 bc4 = new ReceiveBC4(); // 1.ʵ����BroadcastReceiver
			IntentFilter filter4 = new IntentFilter("BC_Three"); // 2.ע�������
			registerReceiver(bc4, filter4);   //3.ע�������
			
			break;
		default:
			break;
		}

	}

}
