package p2;

public class Primitive {
    private boolean booleanValue;
    private char charValue;
    private byte byteValue;
    private short shortValue;
    private int intValue;
    private long longValue;
    private float floatValue;
    private double doubleValue;

    public Primitive(boolean value) {
        this.booleanValue = value;
    }

    public Primitive(char value) {
        this.charValue = value;
    }

    public Primitive(byte value) {
        this.byteValue = value;
    }

    public Primitive(short value) {
        this.shortValue = value;
    }

    public Primitive(int value) {
        this.intValue = value;
    }

    public Primitive(long value) {
        this.longValue = value;
    }

    public Primitive(float value) {
        this.floatValue = value;
    }

    public Primitive(double value) {
        this.doubleValue = value;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setBooleanValue(boolean value) {
        this.booleanValue = value;
    }

    public void setCharValue(char value) {
        this.charValue = value;
    }

    public void setByteValue(byte value) {
        this.byteValue = value;
    }

    public void setShortValue(short value) {
        this.shortValue = value;
    }

    public void setIntValue(int value) {
        this.intValue = value;
    }

    public void setLongValue(long value) {
        this.longValue = value;
    }

    public void setFloatValue(float value) {
        this.floatValue = value;
    }

    public void setDoubleValue(double value) {
        this.doubleValue = value;
    }

    public static void main(String[] args) {

    	Primitive boolPrimitive = new Primitive(true);
        System.out.println("Boolean value: " + boolPrimitive.getBooleanValue());

        Primitive intPrimitive = new Primitive(42);
        System.out.println("Int value: " + intPrimitive.getIntValue());

        intPrimitive.setIntValue(100);
        System.out.println("Updated int value: " + intPrimitive.getIntValue());
    }
}
