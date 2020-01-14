import java.util.Comparator;

public class DataPoint{
    public int heartBeat;
    public int bloodPressure;
    public double time;
    public String musicGenre;

    public DataPoint(int heartBeat, int bloodPressure, double time, String musicGenre) {
        this.heartBeat = heartBeat;
        this.bloodPressure = bloodPressure;
        this.time = time;
        this.musicGenre = musicGenre;
    }

    //==================================================================================================================

    //region Gets and Sets
    public int getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(int heartBeat) {
        this.heartBeat = heartBeat;
    }

    public int getUpperBPNumber() {
        return bloodPressure;
    }

    public void setUpperBPNumber(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }
    //endregion

    //==================================================================================================================

    public String toString(){
        return heartBeat + " - " + bloodPressure + " - " + time;
    }
}

class CompareHeartBeat implements Comparator<DataPoint>{

    @Override
    public int compare(DataPoint o1, DataPoint o2) {
        return o1.heartBeat - o2.heartBeat;
    }
}

class CompareBloodPressure implements Comparator<DataPoint>{

    @Override
    public int compare(DataPoint o1, DataPoint o2) {
        return o1.bloodPressure - o2.bloodPressure;
    }
}

class CompareTime implements Comparator<DataPoint>{

    @Override
    public int compare(DataPoint o1, DataPoint o2) {
        return (int) (Integer.MAX_VALUE * (o1.time - o2.time));
    }
}
