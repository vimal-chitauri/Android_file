package myapplication1.com.alarmapp_broadcastreciver_alarmamager;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

public class Myalarm extends BroadcastReceiver {
    private Intent serviceIntent;

    @Override
    public void onReceive(Context context, Intent intent) {
//        final MediaPlayer mediaPlayer=MediaPlayer.create(context,Settings.System.DEFAULT_RINGTONE_URI);
//        mediaPlayer.start();
        serviceIntent = new Intent(context, MyService.class);
        context.startService(serviceIntent);


    }
}
