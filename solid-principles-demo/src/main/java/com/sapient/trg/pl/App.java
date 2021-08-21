package com.sapient.trg.pl;

import com.sapient.trg.service.Box;
import com.sapient.trg.service.BoxManager;
import com.sapient.trg.service.ColoredBox;

public class App 
{
    public static void main( String[] args )
    {
        Box box = new Box(3.2,2.8,3.1);
        System.out.println(box);
        System.out.println(box.hashCode());
        System.out.println("Dimension");
        System.out.println(box.getDepth()+" "+box.getHeight()+" "+box.getWidth());
        System.out.println("Volume");
        //BoxManager manager = new BoxManager();
        //double volume = manager.getVolumeBox(box);
        
        //unboxing Double->double auto to primitive type
        //boxing is reverse
        double volume=new BoxManager().getVolumeBox(box);
        System.out.println(volume);
    
        ColoredBox coloredBox = new ColoredBox(3.4,3.2,2.1,"Red");
        System.out.println(coloredBox.getDepth()+","+coloredBox.getHeight()+","+coloredBox.getWidth()+coloredBox.getColor());
        
        
    }
}
