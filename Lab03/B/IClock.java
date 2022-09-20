public interface IClock {

    public int getHour();
    public int getMinute();
    public int getSecond();
    public void tick();
    public void tickAhead(int numSecs);

}
