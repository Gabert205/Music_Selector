import java.util.Comparator;

public class DataPoint{
    public int heartBeat;
    public int upperBPNumber;
    public int lowerBPNumber;
    public int time;
    public String musicGenre;

    public DataPoint(int heartBeat, int upperBPNumber, int lowerBPNumber, String musicGenre) {
        this.heartBeat = heartBeat;
        this.upperBPNumber = upperBPNumber;
        this.lowerBPNumber = lowerBPNumber;
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
        return upperBPNumber;
    }

    public void setUpperBPNumber(int upperBPNumber) {
        this.upperBPNumber = upperBPNumber;
    }

    public int getLowerBPNumber() {
        return lowerBPNumber;
    }

    public void setLowerBPNumber(int lowerBPNumber) {
        this.lowerBPNumber = lowerBPNumber;
    }

    public int getTime() {
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
        return 0;
    }
}

class CompareTime implements Comparator<DataPoint>{

    @Override
    public int compare(DataPoint o1, DataPoint o2) {
        return o1.time - o2.time;
    }
}
