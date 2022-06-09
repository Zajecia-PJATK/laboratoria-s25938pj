package com.PJATK.main2048.gra;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.PJATK.main2048.Main;
import com.PJATK.main2048.grafika.Renderowanie;
import com.PJATK.main2048.obiektygry.ObiektyGry;
import com.PJATK.main2048.wejscie.Klawiatura;

public class Gra {

	public static List<ObiektyGry> objects;
	
	public static boolean moving = false, hasMoved = true, somethingIsMoving = false;
	public static int dir = 0;
	
	private Random rand = new Random();
	
	public Gra() {
		init();
	}

	public void init() {
		objects = new ArrayList<ObiektyGry>();
		moving = false;
		hasMoved = true;
		somethingIsMoving = false;
		spawn();
	}

	public void aktualizuj() {
		if(Klawiatura.klawiszGora(KeyEvent.VK_R)) {
			init();
		}
		
		for(int i = 0; i < objects.size(); i++) {
			objects.get(i).aktualizuj();
		}
		
		sprawdzWzrostWartosci();
		
		logikaRuchu();
	}
	

	private void sprawdzWzrostWartosci() {
		for(int i = 0; i < objects.size(); i++) {
			for(int j = 0; j < objects.size(); j++) {
				if(i == j) continue;
				if(objects.get(i).x == objects.get(j).x && objects.get(i).y == objects.get(j).y && !objects.get(i).usun && !objects.get(j).usun) {
					objects.get(j).usun = true;
					objects.get(i).wartosc *= 2;
					objects.get(i).utworzKafelek();
				}
			}
		}
		for(int i = 0; i < objects.size(); i++) {
			if(objects.get(i).usun) objects.remove(i);
		}
		System.out.println(objects.size());
	}

	private void spawn() {
		if(objects.size() == 16) return;
		
		boolean available = false;
		int x = 0, y = 0;
		while(!available) {
			x = rand.nextInt(4);
			y = rand.nextInt(4);
			boolean isAvailable = true;

			for(int i = 0 ; i < objects.size(); i++) {
				if(objects.get(i).x / 100 == x && objects.get(i).y / 100 == y) {
					isAvailable = false;
				}
			}
			if(isAvailable) available = true;
		}
		objects.add(new ObiektyGry(x * 100, y * 100));
	}

	private void logikaRuchu() {
		somethingIsMoving = false;
		for(int i = 0; i < objects.size(); i++) {
			if(objects.get(i).ruszajacySie) {
				somethingIsMoving = true;
			}
		}
		if(!somethingIsMoving) {
			moving = false;
			for(int i = 0; i < objects.size(); i++) {
				objects.get(i).poruszylSie = false;
			}
		}
		if(!moving && hasMoved) {
			spawn();
			hasMoved = false;
		}
		if(!moving && !hasMoved) {
			if(Klawiatura.klawiszDol(KeyEvent.VK_A)) {
				hasMoved = true;
				moving = true;
				dir = 0;
			}else if(Klawiatura.klawiszDol(KeyEvent.VK_D)) {
				hasMoved = true;
				moving = true;
				dir = 1;
			}else if(Klawiatura.klawiszDol(KeyEvent.VK_W)) {
				hasMoved = true;
				moving = true;
				dir = 2;
			}else if(Klawiatura.klawiszDol(KeyEvent.VK_S)) {
				hasMoved = true;
				moving = true;
				dir = 3;
			}
		}
	}
	
	public void renderuj() {
		Renderowanie.renderujTlo();

		for(int i = 0; i < objects.size(); i++) {
			objects.get(i).render();
		}
		
		for(int i = 0 ; i < Main.pixele.length; i++) {
			Main.pixele[i] = Renderowanie.pixele[i];
		}
	}
	
	public void renderujText(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setFont(new Font("Verdana", 0, 100));
		g.setColor(Color.BLACK);
		
		for(int i = 0; i < objects.size(); i++) {
			ObiektyGry obiektGry = objects.get(i);
			String string = obiektGry.wartosc + "";
			int sw = (int) (g.getFontMetrics().stringWidth(string) / 2 / Main.scale);
			g.drawString(string, (int) (obiektGry.x + obiektGry.szerokosc / 2 - sw) * Main.scale, (int) (obiektGry.y + obiektGry.wysokosc / 2 + 18) * Main.scale);
		}
		
	}	
}
