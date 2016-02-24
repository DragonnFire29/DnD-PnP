package com.DungeonSlaver.client;

import java.awt.EventQueue;

import com.DungeonSlaver.client.ui.UIFrame;

public class start {

	public static void main(String[] args)
	{
		
		
		EventQueue.invokeLater(new Runnable() {
			
            @Override
            public void run() {
                UIFrame ex = new UIFrame();
                ex.setVisible(true);
                ex.repaint();
            }
        });
	}
}
