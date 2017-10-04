package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.game.src.libs.Animation;
import com.game.src.main.classes.EntityA;

public class Bullet extends GameObject implements EntityA {
		
	private Textures tex;
	private Game game;
	
	BufferedImage image;
	
	Animation anim;
	

	public Bullet(double x, double y, Textures tex, Game game) {
		super(x, y);
		this.tex = tex;
		this.game = game;
		
		anim = new Animation(0, tex.missle[0], tex.missle[1], tex.missle[2], tex.missle[3]);
	}
	
	public void tick(){
		y -=10;
		
		anim.runAnimation();
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int) x, (int) y, 32, 32);
	}
	
	public void render(Graphics g){
		//g.drawImage(tex.missle[0],(int) x,(int) y, null);
		anim.drawAnimation(g, x, y, 0);
	}
	
	public double getY(){
		return this.y;
	}
	
	public double getX(){
		return this.x;
	}

}
