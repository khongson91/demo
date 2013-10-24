package Graphics;

import javax.swing.*;
import java.awt.event.*;

public class MouseEventViewer extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public MouseEventViewer() {
		super();
		setSize(WIDTH, HEIGHT);
		setLocation(30, 40);

		// register the window listener to close the window
		WindowCloser appListener = new WindowCloser();
		addWindowListener(appListener);

		// register the mouse listener to respond to all mouse events
		MouseHandler mouseListener = new MouseHandler();
		addMouseListener(mouseListener);
	}

	private class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	private class MouseHandler extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			System.out.println("MOUSE EVENT: Mouse Pressed");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			System.out.println("MOUSE EVENT: Mouse Clicked");
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseDragged(e);
			System.out.println("MOUSE EVENT: Mouse Dragged");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseEntered(e);
			System.out.println("MOUSE EVENT: Mouse Entered");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseExited(e);
			System.out.println("MOUSE EVENT: Mouse Exited");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseMoved(e);
			System.out.println("MOUSE EVENT: Mouse Moved");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseReleased(e);
			System.out.println("MOUSE EVENT: Mouse Released");
		}

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub
			super.mouseWheelMoved(e);
			System.out.println("MOUSE EVENT: Mouse Wheel Moved");
		}

		// similarly override all the other methods in MouseAdapter

	}

	public static void main(String[] args) {
		MouseEventViewer myWindow = new MouseEventViewer();
		myWindow.setVisible(true);
	}
}
