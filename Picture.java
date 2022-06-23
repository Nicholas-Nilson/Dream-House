
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Triangle tree;
    private Square trunk;
    private Square window2;
    private Square trunk2;
    private Triangle tree2;
    private Square door;
    private Square door2;
    private Square sky;
    private Square grass;
    private Rectangl sidewalk;
    private Circle cloud1;
    private Circle cloud2;
    private Circle lakeLeft;
    private Square lakeMiddle;
    private Circle lakeRight;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeSize(500);
        sky.moveHorizontal(-60);
        sky.moveVertical(-50);
        sky.changeColor("skyblue");
        sky.makeVisible();
        
        grass = new Square();
        grass.changeSize(500);
        grass.moveHorizontal(-60);
        grass.moveVertical(150);
        grass.changeColor("green");
        grass.makeVisible();
        
        cloud1 = new Circle();
        
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(90);
        wall.makeVisible();
        wall.changeColor("white");
        
        door = new Square();
        door.changeColor("red");
        door.moveHorizontal(40);
        door.moveVertical(130);
        door.changeSize(15);
        door.makeVisible();
        
        door2 = new Square();
        door2.changeColor("red");
        door2.moveHorizontal(40);
        door2.moveVertical(145);
        door2.changeSize(15);
        door2.makeVisible();
        
        sidewalk = new Rectangl();
        sidewalk.changeWidth(15);
        sidewalk.changeHeight(100);
        sidewalk.moveHorizontal(40);
        sidewalk.moveVertical(165);
        sidewalk.makeVisible();
        sidewalk.changeColor("black");
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.changeSize(20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(50);
        window2.moveVertical(100);
        window2.changeSize(20);
        window2.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(55);
        roof.moveVertical(70);
        roof.changeColor("brown");
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        cloud1 = new Circle();
        cloud1.changeColor("white");
        cloud1.moveHorizontal(260);
        cloud1.moveVertical(0);
        cloud1.changeSize(40);
        cloud1.makeVisible();
        
        cloud2 = new Circle();
        cloud2.changeColor("white");
        cloud2.moveHorizontal(285);
        cloud2.moveVertical(-5);
        cloud2.changeSize(55);
        cloud2.makeVisible();
        
        lakeLeft = new Circle();
        lakeLeft.changeColor("blue");
        lakeLeft.moveHorizontal(295);
        lakeLeft.moveVertical(170);
        lakeLeft.changeSize(55);
        lakeLeft.makeVisible();
        
        lakeMiddle = new Square();
        lakeMiddle.changeColor("blue");
        lakeMiddle.moveHorizontal(290);
        lakeMiddle.moveVertical(183);
        lakeMiddle.changeSize(47);
        lakeMiddle.makeVisible();
        
        lakeRight = new Circle();
        lakeRight.changeColor("blue");
        lakeRight.moveHorizontal(345);
        lakeRight.moveVertical(170);
        lakeRight.changeSize(55);
        lakeRight.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.moveHorizontal(170);
        tree.moveVertical(120);
        tree.slowMoveHorizontal(5);
        tree.changeSize(50,15);
        tree.makeVisible();
        
        tree2 = new Triangle();
        tree2.changeColor("green");
        tree2.moveHorizontal(185);
        tree2.moveVertical(120);
        tree2.slowMoveHorizontal(5);
        tree2.changeSize(50,15);
        tree2.makeVisible();
        
        
        trunk = new Square();
        trunk.changeColor("magenta");
        trunk.changeSize(20);
        trunk.moveHorizontal(152);
        trunk.moveVertical(130);
        trunk.makeVisible();
        
        trunk2 = new Square();
        trunk2.changeColor("magenta");
        trunk2.changeSize(20);
        trunk2.moveHorizontal(172);
        trunk2.moveVertical(130);
        trunk2.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
