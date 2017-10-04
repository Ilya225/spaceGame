package com.game.src.main;

import java.awt.image.BufferedImage;

public class Textures {
	
	public BufferedImage[] player = new BufferedImage[4];
	public BufferedImage[] missle = new BufferedImage[4];
	public BufferedImage[] enemy = new BufferedImage[4];
	
	private SpriteSheet ss;

	public Textures(Game game) {
		ss = new SpriteSheet(game.getSpriteSheet());
		
		getTextures();
	}
	
	private void getTextures(){
		System.out.println(ss);
		player[0] = ss.grabImage(1,1,32,32);
		player[1] = ss.grabImage(1,2,32,32);
		player[2] = ss.grabImage(1,3,32,32);
		player[3] = ss.grabImage(1,4,32,32);
		
		missle[0] = ss.grabImage(2, 1, 32, 32);
		missle[1] = ss.grabImage(2, 2, 32, 32);
		missle[2] = ss.grabImage(2, 3, 32, 32);
		missle[3] = ss.grabImage(2, 4, 32, 32);
		
		enemy[0] = ss.grabImage(3, 1, 32, 32);
		enemy[1] = ss.grabImage(3, 2, 32, 32);
		enemy[2] = ss.grabImage(3, 3, 32, 32);
		enemy[3] = ss.grabImage(3, 4, 32, 32);
	}

}
