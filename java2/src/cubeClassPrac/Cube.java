package cubeClassPrac;

public class Cube
{
    private float width;
    private float length;
    private float height;

    Cube()
    {
        this(0.0f, 0.0f,0.0f); //constructor chaining
    }

    Cube(float fWidth, float fLength, float fHeight)
    {
        setWidth(fWidth);
        setLength(fLength);
        setHeight(fHeight);
    }

    public  float getHeight()
    {
        return this.height;
    }
    public void setHeight(float height)
    {
        if (height < 0)
        {
            this.height = 0;
        }
        else
        {
            this.height = height;
        }
    }

    public  float getLength()
    {
        return this.length;
    }

    public void setLength(float length)
    {
        if (length < 0)
        {
            this.length = 0;
        }
        else
        {
            this.length = length;
        }
    }

    public  float getWidth()
    {
        return this.width;
    }

    public void setWidth(float width)
    {
        if (width < 0)
        {
            this.width = 0;
        }
        else
        {
            this.width = width;
        }
    }


    public String toString()
    {
        return "Length: " + length + ", Width: " + width + ", Height: " + height;
    }



}
