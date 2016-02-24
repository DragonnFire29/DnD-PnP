package com.DungeonSlaver.client.ui;

import javax.swing.JFrame;

public class UIFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public UIFrame() {

        initUI();
    }

    private void initUI() {

        add(new UIPanel());

        setTitle("D&D-P&P: Dungeons and Dragons Automated");
        setSize(1024, 768);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}