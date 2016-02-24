package com.DungeonSlaver.client.ui;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.DungeonSlaver.client.info;

class UIPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private int time = 0;

	@Override
    public void paint(Graphics g) {

		loadImage();
        UIComponents.drawDonut(g, getSize());
        UIComponents.alphaWarning(g);
        
        if(time < 9000){
        	time++;
        	g.drawImage(info.temp[time / 1000], 50, 50, null);
        	System.out.println("Drawing frame " + (time / 1000) + ", time=" + time);
        }
        else
        {
        	time = 0;
        }
    }
	
	private void loadImage() {
        
        for(int i = 0; i < 9; i++)
        {
        	//System.out.println("Loading image " + i + ".");
        	ImageIcon ii = new ImageIcon("res/ui/loading/frame"+i+".png");
            info.temp[i] = ii.getImage();
        }
    }
}