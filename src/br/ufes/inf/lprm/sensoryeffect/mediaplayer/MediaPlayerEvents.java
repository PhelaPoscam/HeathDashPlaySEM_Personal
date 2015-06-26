package br.ufes.inf.lprm.sensoryeffect.mediaplayer;

import br.ufes.inf.lprm.sensoryeffect.mediaplayer.autoextraction.AutoExtraction;
import br.ufes.inf.lprm.sensoryeffect.mediaplayer.upnp.CommandSERendererDevice;
import uk.co.caprica.vlcj.binding.internal.libvlc_media_t;
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventListener;

public class MediaPlayerEvents implements MediaPlayerEventListener {
	public void finished(MediaPlayer mediaPlayer) {
		if (VideoPlayer.existsSem && VideoPlayer.seDeviceSelected) {
			try {
				VideoPlayer.mediaPlayerActions.stopVideo();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		VideoPlayer.lblStatus.setText(" Finished ");
	}

	public void paused(MediaPlayer mediaPlayer) {
		VideoPlayer.lblStatus.setText(" Paused: " +  formatTimeVideo((long)(mediaPlayer.getTime() / 1000.0)) + " of " + formatTimeVideo((long)(mediaPlayer.getLength() / 1000.0)) + " (" + mediaPlayer.getTime() + ")" + " ");
	}

	public void playing(MediaPlayer mediaPlayer) {
		VideoPlayer.lblStatus.setText(" Playing ");
	}

	public void stopped(MediaPlayer mediaPlayer) {
		VideoPlayer.lblStatus.setText(" Stopped ");
		VideoPlayer.jslider.setValue(0);
	}
	
	@Override
	public void positionChanged(MediaPlayer mediaPlayer, float arg1) {
		if (mediaPlayer.isPlaying()){
			int pos = (int)(arg1 * 100.0);
	        VideoPlayer.jslider.setValue(pos); 
		}
	}
	
	@Override
	public void timeChanged(MediaPlayer mediaPlayer, long arg1) {
		if (VideoPlayer.autoColorExtraction){
			String[] hexColors = AutoExtraction.autoColorCalculationToHex(VideoPlayer.getFrame());
			try {
				CommandSERendererDevice.setLightColors(hexColors[0], hexColors[1], hexColors[2]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		VideoPlayer.lblStatus.setText(" Playing: " +  formatTimeVideo((long)(mediaPlayer.getTime() / 1000.0)) + " of " + formatTimeVideo((long)(mediaPlayer.getLength() / 1000.0)) + " (" + mediaPlayer.getTime() + ")" + " ");
	}
	private String formatTimeVideo(long val){
		long longVal = val;
	    int hours = (int) longVal / 3600;
	    int remainder = (int) longVal - hours * 3600;
	    int mins = remainder / 60;
	    remainder = remainder - mins * 60;
	    int secs = remainder;
	    return String.format("%02d:%02d:%02d", hours, mins, secs);
	}
	
	@Override
	public void opening(MediaPlayer mediaPlayer) {}

	@Override
	public void backward(MediaPlayer arg0) {}

	@Override
	public void buffering(MediaPlayer arg0, float arg1) {}

	@Override
	public void endOfSubItems(MediaPlayer arg0) {}

	@Override
	public void error(MediaPlayer arg0) {}

	@Override
	public void forward(MediaPlayer arg0) {}

	@Override
	public void lengthChanged(MediaPlayer arg0, long arg1) {}

	@Override
	public void mediaChanged(MediaPlayer arg0, libvlc_media_t arg1, String arg2) {}

	@Override
	public void mediaDurationChanged(MediaPlayer arg0, long arg1) {}

	@Override
	public void mediaFreed(MediaPlayer arg0) {}

	@Override
	public void mediaMetaChanged(MediaPlayer arg0, int arg1) {}

	@Override
	public void mediaParsedChanged(MediaPlayer arg0, int arg1) {}

	@Override
	public void mediaStateChanged(MediaPlayer arg0, int arg1) {}

	@Override
	public void mediaSubItemAdded(MediaPlayer arg0, libvlc_media_t arg1) {}

	@Override
	public void newMedia(MediaPlayer arg0) {}

	@Override
	public void pausableChanged(MediaPlayer arg0, int arg1) {}

	@Override
	public void seekableChanged(MediaPlayer arg0, int arg1) {}

	@Override
	public void snapshotTaken(MediaPlayer arg0, String arg1) {}

	@Override
	public void subItemFinished(MediaPlayer arg0, int arg1) {}

	@Override
	public void subItemPlayed(MediaPlayer arg0, int arg1) {}

	@Override
	public void titleChanged(MediaPlayer arg0, int arg1) {}

	@Override
	public void videoOutput(MediaPlayer arg0, int arg1) {}
}
