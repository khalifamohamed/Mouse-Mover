/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouse.mover;
import java.awt.AWTException;
import java.lang.Object;
import java.awt.Robot;
/**
 *
 * @author khalifamohamed
 */
public class MouseMover {
    public static void keepmousemoving() throws AWTException
    {
        int x = 500;
        int y = 500;
        Robot r = new Robot();
        while(true)
        {
            if(x == 0 && y == 0)
            {
                 x = 500;
                y = 500;
            }
            else{
                x -= 1;
                y -= 1 ;
                r.mouseMove(x, y);
            }
            
        }
    }
}
