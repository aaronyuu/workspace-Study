package cn.yuchuanxi.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ReceiveBC1 extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		String s=arg1.getStringExtra("msg");
		System.out.println("通过静态注册接收到的广播1: "+s);
//		Log.i("msg", s);
		try {
			abortBroadcast();
			System.out.println("广播已经中止,后面无法再接收到广播!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}
	}

}
