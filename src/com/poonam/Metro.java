package com.poonam;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;

interface Voice {
	void setSequence(int seq);
	void playsound(String key);
}

class MaleVoice extends AudioFormat {
	private int seq;
	@Override
	public void setSequence(int seq) {
		this.seq = seq;
	}
	public int getSequence() {
		return seq;
	}
}

class FemaleVoice extends AudioFormat {
	private int seq;
	@Override
	public void setSequence(int seq) {
		this.seq = seq;
	}
	public int getSequence() {
		return seq;
	}
}

abstract class AudioFormat implements Voice {

	LinkedHashMap<String, String> soundformat = new LinkedHashMap<>();
	String englishformat = "Please mind the gap";
	String accouncement;

	public void setSoundformat(LinkedHashMap<String, String> soundformat) {
	  this.soundformat=soundformat;
		
	}

	public String getEnglishformat() {
		return englishformat;
	}

	public LinkedHashMap<String, String> getSoundformat() {
		return soundformat;
	}

	public String getAccouncement() {
		return accouncement;
	}

	@Override
	public void playsound(String key) {
		 accouncement = soundformat.get(key);
	}

}

class Announcement implements Runnable {
	private LinkedHashMap<String, Double> station;
	double initialVelocity = 0.0;
	double acceleration = 2.0;
	double travelledDistance = 0;
	int time = 0;
	CountDownLatch countdown;
	FemaleVoice femaleVoice;
	MaleVoice maleVoice;

	public Announcement(MaleVoice maleVoice, FemaleVoice femaleVoice, LinkedHashMap<String, Double> station, CountDownLatch countdown) {
		super();
		this.femaleVoice = femaleVoice;
		this.maleVoice = maleVoice;
		this.station = station;
		this.countdown = countdown;
	}

	private void announceArrivalStation(String station, Double Distance, Double travelledDistance) {
		for (time = 0; time <= 4; time++) {
			travelledDistance = ((initialVelocity * time) + (0.5 * acceleration * time * time));
			if (travelledDistance >= 0.8 * Distance)
				break;
		}
		if(femaleVoice.getSequence()==1){
		System.out.println(femaleVoice.getAccouncement()+"Next station is " + station + " metro station" );
		System.out.println(maleVoice.getEnglishformat()+"Next station is " + station + " metro station");
		}
		if(maleVoice.getSequence()==1){
			System.out.println(maleVoice.getAccouncement()+"Next station is " + station + " metro station" );
			System.out.println(femaleVoice.getEnglishformat()+"Next station is " + station + " metro station");
			}
	}

	private void openDoorActivity(String station, Double Distance, Double travelledDistance) {
		for (time = 0; time <= 4; time++) {
			travelledDistance = ((initialVelocity * time) + (0.5 * acceleration * time * time));
			if (travelledDistance >= Distance)
				break;
		}
		if(femaleVoice.getSequence()==1){
		System.out.println(station + femaleVoice.getAccouncement()+" station Door will open on left .Please mind the gap " );
		System.out.println(station + maleVoice.getEnglishformat()+" station Door will open on left .Please mind the gap ");
	}
		if(maleVoice.getSequence()==1){
			System.out.println(station + maleVoice.getAccouncement()+" station Door will open on left .Please mind the gap " );
			System.out.println(station + femaleVoice.getEnglishformat()+" station Door will open on left .Please mind the gap ");
		}
		}

	@Override
	public void run() {
		Iterator<String> itr = station.keySet().iterator();
		while (itr.hasNext()) {
			String comingStation = itr.next();
			Double Distance = station.get(comingStation);
			announceArrivalStation(comingStation, Distance, travelledDistance);
			openDoorActivity(comingStation, Distance, travelledDistance);
			countdown.countDown();
		}
	}

}

public class Metro {
	private void run() {
		System.out.println("Metro is running");
	}

	private void stop() {
		System.out.println("Metro has arrived at destination");
	}

	public static void main(String[] args) throws InterruptedException {
		Metro m = new Metro();
		FemaleVoice female = new FemaleVoice();
		female.setSequence(2);
		LinkedHashMap<String, String> soundformat = new LinkedHashMap<>();
		soundformat.put("Up", "kripya dhyan dijiye");
		soundformat.put("Kerala", "kuttanpujliye ");
		soundformat.put("Banglore", "దయచేసి ఖాళీని గుర్తుంచుకోండి");
		female.setSoundformat(soundformat);
		female.playsound("Kerala");
		MaleVoice male = new MaleVoice();
		male.setSequence(1);
		male.setSoundformat(soundformat);
		male.playsound("Kerala");
		m.run();
		LinkedHashMap<String, Double> mapOfStationwithDistance = new LinkedHashMap<>();
		mapOfStationwithDistance.put("Vaishali", 0.0);
		mapOfStationwithDistance.put("Kaushambi", 10.0);
		mapOfStationwithDistance.put("AnandVihar", 5.0);
		final CountDownLatch cdl = new CountDownLatch(mapOfStationwithDistance.size());
		Announcement a1 = new Announcement(male, female, mapOfStationwithDistance, cdl);
		Thread t = new Thread(a1);
		t.start();
		cdl.await();
		m.stop();
	}

}

