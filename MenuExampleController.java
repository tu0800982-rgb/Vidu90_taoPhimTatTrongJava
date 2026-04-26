package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
    private MenuExampleView menuExampleView;
    
	public MenuExampleController(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		
		System.out.println("Clicked: "+ button);
		
		if(button.equals("Open")) {
			this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem OPEN");
		}else if(button.equals("New")) {
			this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem NEW");
		}else if(button.equals("Exit")) {
			
			//this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem EXIT");
			System.exit(0); // Khi ấn Exit -> Tắt luôn cửa sổ
			
		}else if(button.equals("Welcome")) {
			this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem Welcome");
		}
	}
}
