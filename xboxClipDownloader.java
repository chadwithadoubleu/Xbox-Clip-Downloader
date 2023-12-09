import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.MouseInfo;

public class xboxClipDownloader 
{
	public static void main (String[] args)
	{
		try
		{
			Robot robot = new Robot();
			while (true)
			{
				int mouseX = MouseInfo.getPointerInfo().getLocation().x;
				int mouseY = MouseInfo.getPointerInfo().getLocation().y;

				System.out.println("("+mouseX+","+mouseY+")" + "\t red = " + robot.getPixelColor(mouseX,mouseY).getRed());
				//Thread.sleep(2000);


				Thread.sleep(10000);


				if (robot.getPixelColor(544,779).getRed() == 255)
				{
					Thread.sleep(10000);
					robot.mouseMove(544, 779);
					Thread.sleep(1);
					robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					Thread.sleep(1);
					robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

					Thread.sleep(60000);

					robot.mouseMove(868, 736);
					robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					Thread.sleep(1);
					robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					Thread.sleep(2000);
					robot.mouseMove(519, 564);
					robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					Thread.sleep(1);
					robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				}
				else 
				{
					robot.mouseMove(581, 730);
					Thread.sleep(1);
					if (robot.getPixelColor(581, 730).getRed() >= 34) //Photo not video
					{
						//robot.mouseMove(581, 734);


						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						Thread.sleep(1);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

						Thread.sleep(100);

						robot.mouseMove(865, 628);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						Thread.sleep(1);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						Thread.sleep(2000);
						robot.mouseMove(519, 564);
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						Thread.sleep(1);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					}
				}

			}



			/*
			robot.mouseMove(10, 10);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(10);
			robot.mouseMove(100, 100);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

			robot.mouseMove((int)(1000*4000),(int)(1366));
			Thread.sleep(10);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(10);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(10000);
			robot.
			DesktopMouse.
			 */
			/*
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_DELETE);
			*/
		}
		catch (Exception e)
		{

		}
	}
}