package cn.yuchuanxi.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ReceiveBC3 extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		String s=arg1.getStringExtra("msg");
		System.out.println("ͨ����̬ע����������յ��Ĺ㲥: "+s);
//		Log.i("msg","2"+ s);
	}

}
