package cn.yuchuanxi.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ReceiveBC2 extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		String s=arg1.getStringExtra("msg");
		System.out.println("ͨ����̬ע����յ��Ĺ㲥2,���ȼ���200: "+s);
//		Log.i("msg","2"+ s);
		try {
			Bundle bundle=new Bundle();
			bundle.putString("test","�����޸ĺ�Ĺ㲥");
			setResultExtras(bundle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

}
